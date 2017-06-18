/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import model.entity.Usuario;

/**
 *
 * @author Fernando
 */
public interface DaoUsuario extends Dao<Usuario>{
    
    public Usuario login(String cpf, String senha);
    
}
