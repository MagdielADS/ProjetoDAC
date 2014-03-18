package br.edu.ifpb.dac.beans;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author filipe
 */
@ManagedBean(name = "missionaryBean")
public class MissionaryBean {

//    @EJB
//    Management management;
    
    private String nome;
    private String contato;
    private String rua;
    private String bairro;
    private String cpf;
    
    public void persist(){
  //      management.register(this);
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
