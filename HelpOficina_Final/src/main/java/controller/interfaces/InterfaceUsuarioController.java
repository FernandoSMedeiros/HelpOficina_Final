/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.interfaces;

import model.entity.Usuario;

/**
 *
 * @author Fernando
 */
public interface InterfaceUsuarioController extends InterfaceController<Usuario>{
    
    public void loginAction(String cpf, String senha);
           
}
