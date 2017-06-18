/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author Fernando
 */
@Entity
public class Peca implements Serializable {
    
    private Integer id_peca;
    private String codPeca;
    private String descricao;
    private double preco;
    
    
}
