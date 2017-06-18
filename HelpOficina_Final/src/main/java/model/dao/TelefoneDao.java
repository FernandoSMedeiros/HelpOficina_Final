/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import javax.persistence.NoResultException;
import model.entity.Telefone;
import model.dao.interfaces.Dao;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Fernando
 */
public class TelefoneDao implements Dao<Telefone> {

    private static TelefoneDao telefoneDao;

    private static Session session;

    private TelefoneDao() {
        session = getSession();
    }

    private static Session getSession() {
        if (session == null) {
            session = HibernateUtil.getSession();
        }
        return session;
    }

    public static TelefoneDao getInstance() {
        if (telefoneDao == null) {
            telefoneDao = new TelefoneDao();
        }
        return telefoneDao;
    }

    @Override
    public void insert(Telefone tel) {

        if (!session.isOpen()) {
            session = HibernateUtil.getSession();
        }

        try {
            session.getTransaction().begin();
            session.save(tel);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.println(e.toString());
        } finally {
            session.close();
        }

    }

    @Override
    public void delete(Telefone tel) {

        if (!session.isOpen()) {
            session = HibernateUtil.getSession();
        }

        try {
            session.getTransaction().begin();
            tel = session.find(Telefone.class, tel.getId());
            session.delete(tel);
            session.getTransaction().commit();

        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.println(e.toString());
        } finally {
            session.close();
        }
    }

    @Override
    public Telefone findById(int id) {

        if (!session.isOpen()) {
            session = HibernateUtil.getSession();
        }

        try {
            return session.find(Telefone.class, id);
        } catch (NoResultException e) {
            return null;
        } finally {
            session.close();
        }

    }

    @Override
    public List<Telefone> findAll() {
        
        if (!session.isOpen()) {
            session = HibernateUtil.getSession();
        }
        
        try {
            return session.createQuery("FROM " + Telefone.class.getName()).getResultList();
        } catch (NoResultException e) {
            return null;
        } finally {
            session.close();
        }

    }

}
