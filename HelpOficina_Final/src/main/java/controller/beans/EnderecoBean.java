/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import model.entity.Endereco;

/**
 *
 * @author Fernando
 */
@ManagedBean
@RequestScoped
public class EnderecoBean {
    
    private Endereco endereco = new Endereco();
    
    public void novo(){
        endereco = new Endereco();
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
}
