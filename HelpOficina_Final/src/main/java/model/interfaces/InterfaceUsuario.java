/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.interfaces;

import model.entity.Usuario;

/**
 *
 * @author Fernando
 */
public interface InterfaceUsuario extends InterfaceModel<Usuario>{
    
    public Usuario login(String cpf, String senha);
    
}
