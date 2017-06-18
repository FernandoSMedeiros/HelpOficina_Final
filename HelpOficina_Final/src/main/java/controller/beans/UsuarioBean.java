/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import model.entity.Usuario;

/**
 *
 * @author Fernando
 */
@ManagedBean
@RequestScoped
public class UsuarioBean {
    
    private Usuario usuario = new Usuario();
    
    public void novo(){
        this.usuario = new Usuario();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
