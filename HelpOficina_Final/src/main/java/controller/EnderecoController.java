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
import model.EnderecoModel;
import model.entity.Endereco;

/**
 *
 * @author Fernando
 */
@ManagedBean
@RequestScoped
public class EnderecoController implements InterfaceController<Endereco>{

    private EnderecoModel enderecoModel= new EnderecoModel();
    
    @Override
    public void inserirAction(Endereco t) {
        enderecoModel.inserir(t);
    }

    @Override
    public void deletarAction(Endereco t) {
        enderecoModel.deletar(t);
    }

    @Override
    public Endereco recuperarAction(int i) {
        return enderecoModel.recuperar(i);
    }

    @Override
    public List<Endereco> recuperarTodosAction() {
        return enderecoModel.recuperarTodos();
    }
    
   
    
}
