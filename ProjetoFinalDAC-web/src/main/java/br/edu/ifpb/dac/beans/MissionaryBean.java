package br.edu.ifpb.dac.beans;

import br.edu.ifpb.dac.interfaces.Management;
import br.edu.ifpb.dac.entities.Missionary;
import br.edu.ifpb.dac.entities.Phone;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author filipe
 */
@ManagedBean(name = "missionaryBean")
public class MissionaryBean {
    
    private String f1;
    private String f2;
    private String f3;
    private String d1;
    private String d2;
    private String d3;
    Missionary missionary = new Missionary();
    
    @EJB
    Management<Missionary> management;

    public void persist() {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        
        phone1.setDdd(d1);
        phone1.setNumero(f1);
        phone2.setDdd(d2);
        phone2.setNumero(f2);
        phone3.setDdd(d3);
        phone3.setNumero(f3);
        
        missionary.addPhone(phone1);
        missionary.addPhone(phone2);
        missionary.addPhone(phone3);
        
        management.register(missionary);
    }

    public String getNome() {
        return missionary.getName();
    }

    public void setNome(String nome) {
        missionary.setName(nome);
    }

    public String getRua() {
        return missionary.getAddress().getStreet();
    }

    public void setRua(String rua) {
        missionary.getAddress().setStreet(rua);
    }

    public String getNumero() {
        return missionary.getAddress().getNumber();
    }

    public void setNumero(String numero) {
        missionary.getAddress().setNumber(numero);
    }

    public String getBairro() {
        return missionary.getAddress().getDistrict();
    }

    public void setBairro(String bairro) {
        missionary.getAddress().setDistrict(bairro);
    }

    public String getCpf() {
        return missionary.getCpf();
    }

    public void setCpf(String cpf) {
        missionary.setCpf(cpf);
    }

    public String getF1() {
        return f1;
    }

    public void setF1(String f1) {
        this.f1 = f1;
    }

    public String getF2() {
        return f2;
    }

    public void setF2(String f2) {
        this.f2 = f2;
    }

    public String getF3() {
        return f3;
    }

    public void setF3(String f3) {
        this.f3 = f3;
    }

    public String getD1() {
        return d1;
    }

    public void setD1(String d1) {
        this.d1 = d1;
    }

    public String getD2() {
        return d2;
    }

    public void setD2(String d2) {
        this.d2 = d2;
    }

    public String getD3() {
        return d3;
    }

    public void setD3(String d3) {
        this.d3 = d3;
    }
}
