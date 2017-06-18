/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import javax.persistence.NoResultException;
import model.dao.interfaces.Dao;
import model.entity.Aparelho;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Fernando
 */
public class AparelhoDao implements Dao<Aparelho>{

    private static AparelhoDao aparelhoDao;

    private static Session session;

    private AparelhoDao() {
        session = getSession();
    }

    private static Session getSession() {
        if (session == null) {
            session = HibernateUtil.getSession();
        }
        return session;
    }

    public static AparelhoDao getInstance() {
        if (aparelhoDao == null) {
            aparelhoDao = new AparelhoDao();
        }
        return aparelhoDao;
    }

    @Override
    public void insert(Aparelho ap) {

        if( ! session.isOpen()){
            session = HibernateUtil.getSession();
        }
       
        try {
            session.getTransaction().begin();
            session.save(ap);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.println(e.toString());
        } finally {
            session.close();
        }

    }

    @Override
    public void delete(Aparelho ap) {

         if( ! session.isOpen()){
            session = HibernateUtil.getSession();
        }
         
        try {
            session.getTransaction().begin();
            ap = session.find(Aparelho.class, ap.getId_ap());
            session.delete(ap);
            session.getTransaction().commit();

        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.println(e.toString());
        } finally {
            session.close();
        }
    }

    @Override
    public Aparelho findById(int id) {

        if( ! session.isOpen()){
            session = HibernateUtil.getSession();
        }
        
        try {
            return session.find(Aparelho.class, id);
        } catch (NoResultException e) {
            return null;
        } finally {
            session.close();
        }

    }

    @Override
    public List<Aparelho> findAll() {
        
        if( ! session.isOpen()){
            session = HibernateUtil.getSession();
        }
        
        try {
            return session.createQuery("FROM " + Aparelho.class.getName()).getResultList();
        } catch (NoResultException e) {
            return null;
        } finally {
            session.close();
        }

    }
    
}
