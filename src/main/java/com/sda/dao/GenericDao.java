package com.sda.dao;

import com.sda.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class GenericDao<T> {

    public void createEntity(T entity) {
        System.out.println("clasa GenericDao");
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();


        session.persist(entity);
        transaction.commit();
        session.close();
    }
}
