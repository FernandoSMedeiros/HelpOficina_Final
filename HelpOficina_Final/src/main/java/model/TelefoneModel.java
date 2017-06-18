/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import model.dao.TelefoneDao;
import model.dao.interfaces.Dao;
import model.entity.Telefone;
import model.interfaces.InterfaceModel;

/**
 *
 * @author Fernando
 */
public class TelefoneModel  implements InterfaceModel<Telefone>{

    private final Dao<Telefone> dao = TelefoneDao.getInstance();
    
    @Override
    public void inserir(Telefone t) {
        dao.insert(t);
    }

    @Override
    public void deletar(Telefone t) {
        dao.delete(t);
    }

    @Override
    public Telefone recuperar(int id) {
       return dao.findById(id);
    }

    @Override
    public List<Telefone> recuperarTodos() {
        return dao.findAll();
    }
    
    
    
}
