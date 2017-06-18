/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import model.dao.UsuarioDao;
import model.entity.Usuario;
import model.interfaces.InterfaceUsuario;

/**
 *
 * @author Fernando
 */
public class usuarioModel implements InterfaceUsuario {

    private final UsuarioDao dao = UsuarioDao.getInstance();
    
    @Override
    public Usuario login(String cpf, String senha) {
       return dao.login(cpf, senha);
    }

    @Override
    public void inserir(Usuario t) {
        dao.insert(t);
    }

    @Override
    public void deletar(Usuario t) {
        dao.delete(t);
    }

    @Override
    public Usuario recuperar(int id) {
        return dao.findById(id);
    }

    @Override
    public List<Usuario> recuperarTodos() {
        return dao.findAll();
    }
    
}
