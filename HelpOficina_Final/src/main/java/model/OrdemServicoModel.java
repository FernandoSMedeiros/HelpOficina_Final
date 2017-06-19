/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import model.dao.OrdemServicoDao;
import model.dao.interfaces.Dao;
import model.entity.OrdemServico;
import model.interfaces.InterfaceModel;

/**
 *
 * @author Fernando
 */
public class OrdemServicoModel implements InterfaceModel<OrdemServico>{

    private final Dao<OrdemServico> dao = OrdemServicoDao.getInstance();
    
    @Override
    public void inserir(OrdemServico t) {
        dao.insert(t);
    }

    @Override
    public void deletar(OrdemServico t) {
       dao.delete(t);
    }

    @Override
    public OrdemServico recuperar(int id) {
        return dao.findById(id);
    }

    @Override
    public List<OrdemServico> recuperarTodos() {
        return dao.findAll();
    }
    
    
    
}
