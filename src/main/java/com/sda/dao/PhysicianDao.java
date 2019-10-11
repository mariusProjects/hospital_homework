package com.sda.dao;

import com.sda.entities.Physician;
import com.sda.utils.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class PhysicianDao extends GenericDao<Physician> {
    public void addPhysician(Integer id,String name, String position, Integer ssn) {
        System.out.println("clasa Physiciandao");
        Physician physician = new Physician();
        physician.setEmployee_id(id);
        physician.setName(name);
        physician.setPosition(position);
        physician.setSsn(ssn);
        PhysicianDao physicianDao = new PhysicianDao();
        physicianDao.createEntity(physician);

    }
}
