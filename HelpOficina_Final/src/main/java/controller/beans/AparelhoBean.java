/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import model.entity.Aparelho;

/**
 *
 * @author Fernando
 */
@ManagedBean
@RequestScoped
public class AparelhoBean {
    
    private Aparelho aparelho = new Aparelho();
    
    public void novo(){
        this.aparelho = new Aparelho();
    }

    public Aparelho getAparelho() {
        return aparelho;
    }

    public void setAparelho(Aparelho aparelho) {
        this.aparelho = aparelho;
    }
       
}
