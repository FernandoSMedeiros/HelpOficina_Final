/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import model.dao.AparelhoDao;
import model.dao.interfaces.Dao;
import model.entity.Aparelho;
import model.interfaces.InterfaceModel;

/**
 *
 * @author Fernando
 */
public class AparelhoModel implements InterfaceModel<Aparelho>{

    private Dao<Aparelho> dao = AparelhoDao.getInstance();
    
    @Override
    public void inserir(Aparelho t) {
        dao.insert(t);
    }

    @Override
    public void deletar(Aparelho t) {
        dao.delete(t);
    }

    @Override
    public Aparelho recuperar(int id) {
       return dao.findById(id);
    }

    @Override
    public List<Aparelho> recuperarTodos() {
       return dao.findAll();
    }
    
}
