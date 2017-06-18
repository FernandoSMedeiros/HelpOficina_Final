/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.interfaces;

import java.util.List;

/**
 *
 * @author Fernando
 * @param <T>
 */
public interface InterfaceModel<T> {

    public void inserir(T t);
    public void deletar(T t);
    public T recuperar(int id);
    public List<T> recuperarTodos();

}
