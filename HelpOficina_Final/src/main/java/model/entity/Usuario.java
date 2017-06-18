/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;

/**
 *
 * @author Fernando
 */
@Entity
@SequenceGenerator(name = "usuario_id", sequenceName = "seq_id_usuario", allocationSize = 1)
public class Usuario implements Serializable {

    private Integer id_usuario;

    private String nomeUsuario;
    private String senha;
    private String cpf;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "usuario_id")
    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = criptografar(senha);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public static String criptografar(String senha) {
        SimpleHash pass = new SimpleHash("md5", senha);
        return pass.toHex();
    }


}
