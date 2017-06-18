/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.HashMap;
import java.util.Map;
import org.primefaces.context.RequestContext;

/**
 *
 * @author Fernando
 */
public class FacesDialogUtil {
    
    public  static void abrirDialogo(String page) {
        Map<String, Object> opcoes = new HashMap<>();
        opcoes.put("modal", true);
        opcoes.put("resizable", false);
        opcoes.put("contentHeight", 470);

        RequestContext.getCurrentInstance().openDialog(page, opcoes, null);        
    }
    
    public static void fecharDialogo(Object obj) {
        RequestContext.getCurrentInstance().closeDialog(obj);        
    } 
    
}
