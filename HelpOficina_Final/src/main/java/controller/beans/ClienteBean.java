/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import model.entity.Cliente;

/**
 *
 * @author Fernando
 */
@ManagedBean
@RequestScoped
public class ClienteBean {
    
    private Cliente cliente = new Cliente();
    
    public void novo(){
        this.cliente = new Cliente();
    }    

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
   
}
