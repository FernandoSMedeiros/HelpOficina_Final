/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import javax.persistence.NoResultException;
import model.dao.interfaces.Dao;
import model.entity.OrdemServico;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Fernando
 */
public class OrdemServicoDao implements Dao<OrdemServico>{
    
     private static OrdemServicoDao ordemServico;

    private static Session session;

    private OrdemServicoDao() {
        session = getSession();
    }

    private static Session getSession() {
        if (session == null) {
            session = HibernateUtil.getSession();
        }
        return session;
    }

    public static OrdemServicoDao getInstance() {
        if (ordemServico == null) {
            ordemServico = new OrdemServicoDao();
        }
        return ordemServico;
    }

    @Override
    public void insert(OrdemServico os) {

        if( ! session.isOpen()){
            session = HibernateUtil.getSession();
        }
       
        try {
            session.getTransaction().begin();
            session.save(os);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.println(e.toString());
        } finally {
            session.close();
        }

    }

    @Override
    public void delete(OrdemServico os) {

         if( ! session.isOpen()){
            session = HibernateUtil.getSession();
        }
         
        try {
            session.getTransaction().begin();
            os = session.find(OrdemServico.class, os.getId_os());
            session.delete(os);
            session.getTransaction().commit();

        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.println(e.toString());
        } finally {
            session.close();
        }
    }

    @Override
    public OrdemServico findById(int id) {

        if( ! session.isOpen()){
            session = HibernateUtil.getSession();
        }
        
        try {
            return session.find(OrdemServico.class, id);
        } catch (NoResultException e) {
            return null;
        } finally {
            session.close();
        }

    }

    @Override
    public List<OrdemServico> findAll() {
        
        if( ! session.isOpen()){
            session = HibernateUtil.getSession();
        }
        
        try {
            return session.createQuery("FROM " + OrdemServico.class.getName()).getResultList();
        } catch (NoResultException e) {
            return null;
        } finally {
            session.close();
        }

    }

   
    
}
