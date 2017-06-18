/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;

/**
 *
 * @author Fernando
 * @param <T>
 */
public interface Dao <T> {
    
    public void insert(T t);
    public void delete(T t);
    public T findById(int id);
    public List<T> findAll();
    
}
