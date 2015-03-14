package com.hibtest1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibtest1.entity.Users;

public class HibernateDAO implements HibernateInter{

	public void addUser(Users user) {

		// 1��ʼ������ȡ�����ļ�hibernate.cfg.xml
		Configuration config = new Configuration().configure();
		// 2��ȡ����sessionFactory
		SessionFactory sessionFactory = config.buildSessionFactory();
		// 3��session
		Session session = sessionFactory.openSession();
		Transaction tx = null;

		try {
			// 4��ʼһ������
			tx = session.beginTransaction();
			// 5�־û�����
			session.save(user);
			// 6�ύ����
			tx.commit();

		} catch (Exception e) {
			if (tx != null) {
				// �ع�
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			// 7�ر�session
			session.close();
		}
	}

//	public void testLoad() {
//		// 1��ʼ������ȡ�����ļ�hibernate.cfg.xml
//		Configuration config = new Configuration().configure();
//		// 2��ȡ����sessionFactory
//		SessionFactory sessionFactory = config.buildSessionFactory();
//		// 3��session
//		Session session = sessionFactory.openSession();
//		// 4��������
//		Users user = (Users) session.get(Users.class, new Integer(1));
//
//		System.out.println(user.getLoginName() + " " + user.getLoginPwd());
//	}
//
//	public void testDelete() {
//		// 1��ʼ������ȡ�����ļ�hibernate.cfg.xml
//		Configuration config = new Configuration().configure();
//		// 2��ȡ����sessionFactory
//		SessionFactory sessionFactory = config.buildSessionFactory();
//		// 3��session
//		Session session = sessionFactory.openSession();
//		Transaction tx = null;
//
//		Users user = (Users) session.get(Users.class, new Integer(1));
//		try {
//			tx = session.beginTransaction();
//			session.delete(user);
//			tx.commit();
//		} catch (Exception e) {
//			if (tx != null) {
//				tx.rollback();
//			}
//			e.printStackTrace();
//		} finally {
//			session.close();
//		}
//	}
//
//	public void testUpdate() {
//		// 1��ʼ������ȡ�����ļ�hibernate.cfg.xml
//		Configuration config = new Configuration().configure();
//		// 2��ȡ����sessionFactory
//		SessionFactory sessionFactory = config.buildSessionFactory();
//		// 3��session
//		Session session = sessionFactory.openSession();
//		Transaction tx = null;
//		
//		Users user = (Users) session.get(Users.class, new Integer(2));
//		//�޸�����
//		user.setLoginName("jihongwei");
//		try {
//			tx = session.beginTransaction();
//			session.update(user);
//			tx.commit();
//		} catch (Exception e) {
//			if (tx != null) {
//				tx.rollback();
//			}
//			e.printStackTrace();
//		} finally {
//			session.close();
//		}
//	}

}
