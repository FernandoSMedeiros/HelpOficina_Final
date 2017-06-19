/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import model.entity.OrdemServico;

/**
 *
 * @author Fernando
 */
@ManagedBean
@SessionScoped
public class OrdemDeServicoBean {
    
    private OrdemServico os = new OrdemServico();
    
    public void novo(){
        this.os = new OrdemServico();
    }

    public OrdemServico getOs() {
        return os;
    }

    public void setOs(OrdemServico os) {
        this.os = os;
    }
    
    
}
