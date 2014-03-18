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

    Missionary missionary = new Missionary();
//    private String nome;
//    private String contato;
//    private String cpf;
//    private String rua;
//    private String numero;
//    private String bairro;
    @EJB
    Management<Missionary> management;

    public void persist() {
//        Missionary missionary = new Missionary();
//        missionary.setName(nome);
//        missionary.setContact(contato);
//        missionary.getAddress().setStreet(rua);
//        missionary.getAddress().setDistrict(bairro);
//        missionary.setCpf(cpf);
//        missionary.getAddress().setNumber(numero);

        management.register(missionary);
    }

    public String getNome() {
//        return nome;
        return missionary.getName();
    }

    public void setNome(String nome) {
//        this.nome = nome;
        missionary.setName(nome);
    }

    public String getContato() {
//        return contato;
        return missionary.getContact();
    }

    public void setContato(String contato) {
//        this.contato = contato;
        missionary.setContact(contato);
    }

    public String getRua() {
//        return rua;
        return missionary.getAddress().getStreet();
    }

    public void setRua(String rua) {
//        this.rua = rua;
        missionary.getAddress().setStreet(rua);
    }

    public String getNumero() {
//        return numero;
        return missionary.getAddress().getNumber();
    }

    public void setNumero(String numero) {
//        this.numero = numero;
        missionary.getAddress().setNumber(numero);
    }

    public String getBairro() {
//        return bairro;
        return missionary.getAddress().getDistrict();
    }

    public void setBairro(String bairro) {
//        this.bairro = bairro;
        missionary.getAddress().setDistrict(bairro);
    }

    public String getCpf() {
//        return cpf;
        return missionary.getCpf();
    }

    public void setCpf(String cpf) {
//        this.cpf = cpf;
        missionary.setCpf(cpf);
    }
}
