/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.interfaces.InterfaceController;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import model.AparelhoModel;
import model.entity.Aparelho;

/**
 *
 * @author Fernando
 */
@ManagedBean
@RequestScoped
public class AparelhoController implements InterfaceController<Aparelho>{

    private AparelhoModel aparelhoModel = null;

    public AparelhoController() {
        this.aparelhoModel = new AparelhoModel();
    }

    @Override
    public void inserirAction(Aparelho t) {
        aparelhoModel.inserir(t);
    }

    @Override
    public void deletarAction(Aparelho t) {
        aparelhoModel.deletar(t);
    }

    @Override
    public Aparelho recuperarAction(int i) {
        return aparelhoModel.recuperar(i);
    }

    @Override
    public List<Aparelho> recuperarTodosAction() {
        return aparelhoModel.recuperarTodos();
    }
    
    

    
    
    
}
