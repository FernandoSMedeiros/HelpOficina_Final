/*
 Classe responsável por todo o négocio da ordem de serviço
 */
package model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.sql.Timestamp;
import java.util.Calendar;

/**
 *
 * @author Fernando
 */
@Entity
@SequenceGenerator(name = "id_os", sequenceName = "seq_id_os")
public class OrdemServico implements Serializable {

    private Integer id_os;

    private Calendar dataEntrada;
    private Date dataConserto;
    private Date dataEntrega;

    private String defeito;
    private String obs;

    private Cliente cliente;

    private Aparelho aparelho = new Aparelho();

    //private Pedido pedido;

    private List<Acompanhamento> acomp = new ArrayList<>();
    private List<Orcamento> orcamento = new ArrayList<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "id_os")
    public Integer getId_os() {
        return id_os;
    }

    public void setId_os(Integer id_os) {
        this.id_os = id_os;
    }

    @Column(name = "DataEntrada", columnDefinition = "DATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Calendar getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Calendar dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    @Column(name = "DataConserto", columnDefinition = "DATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getDataConserto() {
        return dataConserto;
    }

    public void setDataConserto(Date dataConserto) {
        this.dataConserto = dataConserto;
    }

    @Column(name = "DataEntrega", columnDefinition = "DATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getDefeito() {
        return defeito;
    }

    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    @ManyToOne
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @OneToOne(cascade = CascadeType.ALL)
    public Aparelho getAparelho() {
        return aparelho;
    }

    public void setAparelho(Aparelho aparelho) {
        this.aparelho = aparelho;
    }

//    @OneToMany
//    public Pedido getPedido() {
//        return pedido;
//    }
//
//    public void setPedido(Pedido pedido) {
//        this.pedido = pedido;
//    }

    
    @OneToMany(mappedBy = "ordemServico")
    public List<Acompanhamento> getAcomp() {
        return acomp;
    }

    public void setAcomp(List<Acompanhamento> acomp) {
        this.acomp = acomp;
    }

    
    @OneToMany(mappedBy = "ordemServico")
    public List<Orcamento> getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(List<Orcamento> orcamento) {
        this.orcamento = orcamento;
    }

    

        
    
}
