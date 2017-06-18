/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import javax.persistence.NoResultException;
import model.entity.Usuario;
import model.dao.interfaces.DaoUsuario;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Fernando
 */
public class UsuarioDao implements DaoUsuario {

    private static UsuarioDao usuarioDao;

    private static Session session;

    private UsuarioDao() {
        session = getSession();
    }

    private static Session getSession() {
        if (session == null) {
            session = HibernateUtil.getSession();
        }
        return session;
    }

    public static UsuarioDao getInstance() {
        if (usuarioDao == null) {
            usuarioDao = new UsuarioDao();
        }
        return usuarioDao;
    }

    @Override
    public void insert(Usuario usuario) {

        if( ! session.isOpen()){
            session = HibernateUtil.getSession();
        }
       
        try {
            session.getTransaction().begin();
            session.save(usuario);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.println(e.toString());
        } finally {
            session.close();
        }

    }

    @Override
    public void delete(Usuario usuario) {

         if( ! session.isOpen()){
            session = HibernateUtil.getSession();
        }
         
        try {
            session.getTransaction().begin();
            usuario = session.find(Usuario.class, usuario.getId_usuario());
            session.delete(usuario);
            session.getTransaction().commit();

        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.println(e.toString());
        } finally {
            session.close();
        }
    }

    @Override
    public Usuario findById(int id) {

        if( ! session.isOpen()){
            session = HibernateUtil.getSession();
        }
        
        try {
            return session.find(Usuario.class, id);
        } catch (NoResultException e) {
            return null;
        } finally {
            session.close();
        }

    }

    @Override
    public List<Usuario> findAll() {
        
        if( ! session.isOpen()){
            session = HibernateUtil.getSession();
        }
        
        try {
            return session.createQuery("FROM " + Usuario.class.getName()).getResultList();
        } catch (NoResultException e) {
            return null;
        } finally {
            session.close();
        }

    }

    @Override
    public Usuario login(String cpf, String senha) {

         if( ! session.isOpen()){
            session = HibernateUtil.getSession();
        }
        
        try {
            
            Usuario result = (Usuario) session.createQuery("FROM Usuario AS user WHERE user.cpf = '" + cpf + "' AND user.senha = '" + senha + "'").getSingleResult();
            return result;
            
        } catch (NoResultException e) {
            
            return null;
            
        } finally {
            session.close();
        }
        

    }

}
