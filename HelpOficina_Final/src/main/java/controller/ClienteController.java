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
import util.FacesMessageUtil;

/**
 *
 * @author Fernando
 */
@ManagedBean
@RequestScoped
public class ClienteController implements InterfaceController<Cliente> {

    private ClienteModel model;
    private FacesMessageUtil message;

    public ClienteController() {
        this.model = new ClienteModel();
        this.message = new FacesMessageUtil();
    }

    private Cliente selectedCliente;

    @Override
    public void inserirAction(Cliente t) {
        model.inserir(t);
        message.msgInfo("Cliente cadastrado com sucesso");
    }

    @Override
    public void deletarAction(Cliente t) {
        model.deletar(t);
        message.msgWarn("Cliente deletado com sucesso");
    }

    @Override
    public Cliente recuperarAction(int i) {
        return model.recuperar(i);
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

    public Cliente infoCliente(Cliente cliente) {
        return this.model.infoCliente(cliente);
    }

}
