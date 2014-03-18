package br.edu.ifpb.dac.beans;

import br.edu.ifpb.dac.business.Management;
import br.edu.ifpb.dac.entities.Missionary;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author filipe
 */
@ManagedBean(name = "missionaryBean")
public class MissionaryBean {
    
    private String nome;
    private String contato;
    private String cpf;
    private String rua;
    private String bairro;
    
    @EJB
    Management<Missionary> management;
    
    public void persist() {
        Missionary missionary = new Missionary();
        missionary.setName(nome);
        missionary.setContact(contato);
        missionary.getAddress().setStreet(rua);
        missionary.getAddress().setDistrict(bairro);
        missionary.setCpf(cpf);
        
        management.register(missionary);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
