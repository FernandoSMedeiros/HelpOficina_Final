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
import model.ClienteModel;
import model.entity.Cliente;

/**
 *
 * @author Fernando
 */
@ManagedBean
@RequestScoped
public class ClienteController implements InterfaceController<Cliente>{

    private ClienteModel model = new ClienteModel();
    
    private Cliente selectedCliente;
    
    @Override
    public void inserirAction(Cliente t) {
        model.inserir(t);
    }

    @Override
    public void deletarAction(Cliente t) {
       model.deletar(t);
    }

    @Override
    public Cliente recuperarAction(int i) {
       return  model.recuperar(i);
    }

    @Override
    public List<Cliente> recuperarTodosAction() {
        return model.recuperarTodos();
    }
        
    
    public Cliente getSelectedCliente() {
        return selectedCliente;
    }

    public void setSelectedCliente(Cliente selectedCliente) {
        this.selectedCliente = selectedCliente;
    }
    
}
