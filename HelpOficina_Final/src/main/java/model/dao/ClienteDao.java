/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import model.entity.Cliente;
import model.dao.interfaces.Dao;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Fernando
 */
public class ClienteDao implements Dao<Cliente> {

    private static ClienteDao clienteDao;

    private static Session session;

    public static ClienteDao getInstance() {
        if (clienteDao == null) {
            clienteDao = new ClienteDao();
        }
        return clienteDao;
    }

    private ClienteDao() {
        session = getSession();
    }

    private static Session getSession() {
        if (session == null) {
            session = HibernateUtil.getSession();
        }
        return session;
    }

    @Override
    public void insert(Cliente cliente) {

        if( ! session.isOpen()){
            session = HibernateUtil.getSession();
        }
        
        try {
            session.getTransaction().begin();
            session.save(cliente);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.println(e.toString());
        } finally {
            session.close();
        }

    }

    @Override
    public void delete(Cliente cliente) {

        if( ! session.isOpen()){
            session = HibernateUtil.getSession();
        }
        
        try {
            session.getTransaction().begin();
            cliente = session.find(Cliente.class, cliente.getIdCliente());
            session.delete(cliente);
            session.getTransaction().commit();

        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.println(e.toString());
        } finally {
            session.close();
        }
    }

    @Override
    public Cliente findById(int id) {

       
        if( ! session.isOpen()){
            session = HibernateUtil.getSession();
        }
        
        return session.find(Cliente.class, id);

    }

    @Override
    public List<Cliente> findAll() {
        
        if( ! session.isOpen()){
            session = HibernateUtil.getSession();
        }
        
        return session.createQuery("FROM " + Cliente.class.getName()).getResultList();
    }

}
