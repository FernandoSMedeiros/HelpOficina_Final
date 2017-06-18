/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.interfaces;

import java.util.List;

/**
 *
 * @author Fernando
 */
public interface InterfaceController <T>{
    
    public void inserirAction(T t);
    public void deletarAction(T t);
    public T recuperarAction(int i);
    public List<T> recuperarTodosAction();
            
       
    
}
