/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.usuarioModel;
import controller.interfaces.InterfaceUsuarioController;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.NoResultException;
import model.entity.Usuario;
import org.omnifaces.util.Faces;
import util.FacesMessageUtil;
import util.SessionUtil;

/**
 *
 * @author Fernando
 */
@ManagedBean
@RequestScoped
public class UsuarioController implements InterfaceUsuarioController{
    
    private usuarioModel usuario = null;
    
     FacesMessageUtil message;
    
    public UsuarioController(){
        this.usuario = new usuarioModel();
        this.message = new FacesMessageUtil();
    }

    @Override
    public void loginAction(String cpf, String senha) {
              
       Usuario rec = null;

        try {

            rec = usuario.login(cpf, senha);

        } catch (NoResultException e) {

           
            message.msgInfo("Não foi possivel logar"+e.getMessage());

        }

        if (rec != null) {
            SessionUtil.setParam("UsuarioLogado", rec);
           
           try {
               Faces.redirect("home.xhtml");
           } catch (IOException ex) {
               Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
           }

        } else {

           try {
               Faces.redirect("index.xhtml");
           } catch (IOException ex) {
               Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
           }

        }
    }
    
    @Override
    public void inserirAction(Usuario t) {
       usuario.inserir(t);
       message.msgInfo("Usuario cadastrado com sucesso");
    }

    @Override
    public void deletarAction(Usuario t) {
       usuario.deletar(t);
       message.msgInfo("Usuario deletado com Sucesso");
    }

    @Override
    public Usuario recuperarAction(int i) {
        return usuario.recuperar(i);
    }

    @Override
    public List<Usuario> recuperarTodosAction() {
        return usuario.recuperarTodos();
    }

    
    
}
