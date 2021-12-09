package com.desenvolvimento.persistence;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.desenvolvimento.model.Pessoa;

public class PessoaDAOImpl implements PessoaDAO {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		} catch (Throwable ex) {
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public void adicionarPessoa(Pessoa pessoa) {
		Transaction trns = null;
		Session session = getSessionFactory().openSession();
		try {
			trns = session.beginTransaction();
			session.save(pessoa);
			session.getTransaction().commit();
		} catch (Exception e) {
			if (trns != null) {
				trns.rollback();
			}
		} finally {
			session.flush();
			session.close();
		}
	}

	@Override
	public List<Pessoa> listarPessoa() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluirPessoa(Pessoa pessoa) {
		// TODO Auto-generated method stub
	}
	
}
