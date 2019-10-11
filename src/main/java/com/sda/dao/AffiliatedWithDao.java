package com.sda.dao;

import com.sda.entities.AffiliatedWith;
import com.sda.entities.compositeprimarykeys.AffiliatedWithPK;

public class AffiliatedWithDao extends GenericDao<AffiliatedWith> {
    public void addAffiliatedWith(AffiliatedWithPK affiliatedWithPK,Boolean affiliation){
        AffiliatedWith affiliatedWith = new AffiliatedWith();
        affiliatedWith.setAffiliatedWithPK(affiliatedWithPK);
        affiliatedWith.setPrimaryAffiliation(affiliation);
        AffiliatedWithDao affiliatedWithDao = new AffiliatedWithDao();
        affiliatedWithDao.createEntity(affiliatedWith);
    }
}
