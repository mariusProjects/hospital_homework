package com.sda.insert;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;
import java.util.Scanner;

public class Physician {
    public static SessionFactory returnSession() {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        MetadataSources sources = new MetadataSources(registry);
        Metadata metadata = sources.getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        return sessionFactory;
    }

    public static void insertStudentsfromInput(Session session, List<Physician> physicianList) {
        System.out.println("How many students do you want to insert?");
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = scanner.nextInt();
        int i = 0;

        while (i < numberOfStudents) {
            System.out.print("Please enter first name: ");
            String firstName = scanner.next();
            //scanner.nextLine();
            System.out.print("Please enter last name: ");
            String lastName = scanner.next();

            System.out.print("Please enter the age: ");
            int age = scanner.nextInt();

            /*System.out.print("Please enter the locker:");
            int locker  = scanner.nextInt();*/

            physicianList.add(new Physician());
            System.out.println("The student has been added to the list");
            i++;
        }

        for (Physician student : physicianList) {
            session.persist(student);
        }
    }

    public static void deleteStudent(Session session) {
        Physician student = session.find(Physician.class, 22);
        if (student != null) {
            session.delete(student);
        }
    }

}
