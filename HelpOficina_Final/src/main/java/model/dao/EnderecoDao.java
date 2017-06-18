/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import model.entity.Endereco;
import model.dao.interfaces.Dao;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Fernando
 */
public class EnderecoDao implements Dao<Endereco> {

    private static EnderecoDao enderecoDao;
    
    private static Session session;

    private EnderecoDao() {
    session = getSession();
    }

    private static Session getSession() {
        if (session == null) {
            session = HibernateUtil.getSession();
        }
        return session;
    }

    public static EnderecoDao getInstance() {
        if (enderecoDao == null) {
            enderecoDao = new EnderecoDao();
        }
        return enderecoDao;
    }

    @Override
    public void insert(Endereco endereco) {
      
        if( ! session.isOpen()){
            session = HibernateUtil.getSession();
        }

        try {
            session.getTransaction().begin();
            session.save(endereco);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.println(e.toString());
        } finally {
            session.close();
        }
    }

    @Override
    public void delete(Endereco endereco) {
      
        if( ! session.isOpen()){
            session = HibernateUtil.getSession();
        }

        try {
            session.getTransaction().begin();
            endereco = session.find(Endereco.class, endereco.getIdEnd());
            session.delete(endereco);
            session.getTransaction().commit();

        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.println(e.toString());
        } finally {
            session.close();
        }
    }

    @Override
    public Endereco findById(int id) {
        
        if( ! session.isOpen()){
            session = HibernateUtil.getSession();
        }
        
        return session.find(Endereco.class, id);
    }

    @Override
    public List<Endereco> findAll() {
       
        if( ! session.isOpen()){
            session = HibernateUtil.getSession();
        }
        
        return session.createQuery("FROM " + Endereco.class.getName()).getResultList();
    }

}
