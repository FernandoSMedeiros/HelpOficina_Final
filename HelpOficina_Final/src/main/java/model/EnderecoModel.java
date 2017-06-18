/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import model.dao.EnderecoDao;
import model.dao.interfaces.Dao;
import model.entity.Endereco;
import model.interfaces.InterfaceModel;

/**
 *
 * @author Fernando
 */
public class EnderecoModel implements InterfaceModel<Endereco>{

    private Dao<Endereco> dao = EnderecoDao.getInstance();
    
    @Override
    public void inserir(Endereco t) {
        dao.insert(t);
    }

    @Override
    public void deletar(Endereco t) {
        dao.delete(t);
    }

    @Override
    public Endereco recuperar(int id) {
       return dao.findById(id);
    }

    @Override
    public List<Endereco> recuperarTodos() {
        return dao.findAll();
    }
    
    
    
}
