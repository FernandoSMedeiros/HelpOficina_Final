/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.interfaces.InterfaceController;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import model.TelefoneModel;
import model.entity.Telefone;

/**
 *
 * @author Fernando
 */
@ManagedBean
@RequestScoped
public class TelefoneController implements InterfaceController<Telefone>{

    private final TelefoneModel telefoneModel = new TelefoneModel();
    
    @Override
    public void inserirAction(Telefone t) {
        telefoneModel.inserir(t);
    }

    @Override
    public void deletarAction(Telefone t) {
       telefoneModel.deletar(t);
    }

    @Override
    public Telefone recuperarAction(int i) {
        return telefoneModel.recuperar(i);
    }

    @Override
    public List<Telefone> recuperarTodosAction() {
        return telefoneModel.recuperarTodos();
    }
    
    
    
}
