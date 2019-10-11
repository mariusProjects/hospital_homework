package com.sda.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {


    private static StandardServiceRegistry standardServiceRegistry;
    private static SessionFactory sessionFactory;

    static {
        try {
            System.out.println("clasa HibernateUtil");
            if (sessionFactory == null){
                standardServiceRegistry = new StandardServiceRegistryBuilder().configure().build();
                if(standardServiceRegistry != null){
                    System.out.println("Standard registry exista");
                }
                MetadataSources metadataSources = new MetadataSources(standardServiceRegistry);
                if(metadataSources != null){
                    System.out.println("metadataSources");
                }
                Metadata metadata = metadataSources.getMetadataBuilder().build();
                if(metadata == null){
                    System.out.println("metadata exista");
                }
                sessionFactory = metadata.getSessionFactoryBuilder().build();
                if(sessionFactory != null){
                    System.out.println("sessionfactory exista");
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
            if (standardServiceRegistry != null){
                StandardServiceRegistryBuilder.destroy(standardServiceRegistry);
            }
        }
    }
    public static SessionFactory getSessionFactory(){
        return (SessionFactory) sessionFactory.getCurrentSession();
    }

}

