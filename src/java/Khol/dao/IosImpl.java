/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Khol.dao;

import Khol.Bean.Os;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Cheikh
 */
public class IosImpl implements Ios{

    @PersistenceContext
    EntityManager em;
    @Override
    public List<Os> getAll() {
        
         Query query = em.createQuery("SELECT o FROM os o");

    try {
            List<Os> listlect = query.getResultList();
           
            return listlect;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    
}
