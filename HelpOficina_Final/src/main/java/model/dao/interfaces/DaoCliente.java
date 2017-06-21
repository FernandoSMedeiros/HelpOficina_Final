/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import model.entity.Cliente;

/**
 *
 * @author Fernando
 */
public interface DaoCliente extends Dao<Cliente>{
    
    public Cliente infoCliente(Cliente cliente);
    
}
