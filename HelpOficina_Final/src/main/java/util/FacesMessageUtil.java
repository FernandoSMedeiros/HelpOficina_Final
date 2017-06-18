/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Fernando
 */
public class FacesMessageUtil{
    
    public void msgInfo(String mensagem){
        FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO, mensagem, null);
        FacesContext.getCurrentInstance().addMessage(null, fm);
    }
    
    public void msgErr(String mensagem){
        FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, mensagem, null);
        FacesContext.getCurrentInstance().addMessage(null, fm);
    }
    
    public void msgWarn(String mensagem){
        FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_WARN, mensagem, null);
        FacesContext.getCurrentInstance().addMessage(null, fm);
    }
    
}
