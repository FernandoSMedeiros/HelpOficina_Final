/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import model.dao.ClienteDao;
import model.dao.interfaces.Dao;
import model.entity.Cliente;
import model.interfaces.InterfaceModel;

/**
 *
 * @author Fernando
 */
public class ClienteModel  implements InterfaceModel<Cliente>{
    
    private Dao<Cliente> dao = ClienteDao.getInstance();

    @Override
    public void inserir(Cliente t) {
        dao.insert(t);
    }

    @Override
    public void deletar(Cliente t) {
        dao.delete(t);
    }

    @Override
    public Cliente recuperar(int id) {
       return dao.findById(id);
    }

    @Override
    public List<Cliente> recuperarTodos() {
       return dao.findAll();
    }
    
    
    
    
}
