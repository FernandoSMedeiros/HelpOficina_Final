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
import model.OrdemServicoModel;
import model.entity.OrdemServico;

/**
 *
 * @author Fernando
 */
@ManagedBean
@RequestScoped
public class OrdemServicoController implements InterfaceController<OrdemServico>{

    private OrdemServicoModel os = new OrdemServicoModel();
    
    private OrdemServico selectedOs;
    
    @Override
    public void inserirAction(OrdemServico t) {
        os.inserir(t);
    }

    @Override
    public void deletarAction(OrdemServico t) {
       os.deletar(t);
    }

    @Override
    public OrdemServico recuperarAction(int i) {
       return os.recuperar(i);
    }

    @Override
    public List<OrdemServico> recuperarTodosAction() {
        return os.recuperarTodos();
    }
    
    public OrdemServico getSelectedOs() {
        return selectedOs;
    }

    public void setSelectedOs(OrdemServico selectedOs) {
        this.selectedOs = selectedOs;
    }
    
}
