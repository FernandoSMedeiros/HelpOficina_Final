/*
 * Entidade básica cliente
 */
package model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;


@Entity
@SequenceGenerator(name = "idCliente", sequenceName = "idCliente_Sequence", allocationSize = 1)
public class Cliente implements Serializable {

    private int idCliente;
    private String nome;
    private Long cpf;
    private Long rg;
    private String expedidor;

    private Endereco endereco = new Endereco();
    private List<Telefone> tel = new ArrayList<>();    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "idCliente")
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Column
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column
    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    @Column
    public Long getRg() {
        return rg;
    }

    public void setRg(Long rg) {
        this.rg = rg;
    }

    @Column
    public String getExpedidor() {
        return expedidor;
    }

    public void setExpedidor(String expedidor) {
        this.expedidor = expedidor;
    }

    
    @JoinColumn(name = "endereco")
    @OneToOne(mappedBy = "cliente", cascade = CascadeType.ALL)
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    
    @OneToMany(mappedBy = "cliente")
    public List<Telefone> getTel() {
        return tel;
    }

    public void setTel(List<Telefone> tel) {
        this.tel = tel;
    }
    
    

}
