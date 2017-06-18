/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import model.entity.Telefone;

/**
 *
 * @author Fernando
 */
@ManagedBean
@RequestScoped
public class TelefoneBean {
    
    private Telefone telefone = new Telefone();
    
    public void novo(){
        telefone = new Telefone();
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
    
    
    
}
