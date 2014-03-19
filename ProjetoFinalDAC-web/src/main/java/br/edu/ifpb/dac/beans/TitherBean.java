package br.edu.ifpb.dac.beans;

import br.edu.ifpb.dac.interfaces.Management;
import br.edu.ifpb.dac.entities.Missionary;
import br.edu.ifpb.dac.entities.Tither;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author filipe
 */
@ManagedBean(name = "titherBean")
public class TitherBean {

    @EJB
    Management<Tither> management;
    private Tither tither = new Tither();
    private List<Missionary> missionarys = new ArrayList<>();
    private Long m1;
    private Long m2;
    private Long m3;

//    private String nome;
//    private String cpf;
//    private String rua;
//    private String numero;
//    private String bairro;
//    private String contato;
    public String getNome() {
        return tither.getName();
    }

    public void setNome(String nome) {
        tither.setName(nome);
    }

    public String getCpf() {
        return tither.getCpf();
    }

    public void setCpf(String cpf) {
        tither.setCpf(cpf);
    }

    public String getRua() {
        return tither.getAddress().getStreet();
    }

    public void setRua(String rua) {
        tither.getAddress().setStreet(rua);
    }

    public String getNumero() {
        return tither.getAddress().getNumber();
    }

    public void setNumero(String numero) {
        tither.getAddress().setNumber(numero);
    }

    public String getBairro() {
        return tither.getAddress().getDistrict();
    }

    public void setBairro(String bairro) {
        tither.getAddress().setDistrict(bairro);
    }

    public void addMissionary () {
        missionarys.add(missionary1());
        missionarys.add(missionary1());
        missionarys.add(missionary1());
        //tither.setMissionary(missionarys);
    }
    public void persist() {
        tither.setName("TESTE");
        tither.setCpf("444");
        tither.getAddress().setStreet("RUA");
        tither.getAddress().setDistrict("BAIRRO");
        tither.getAddress().setNumber("101");
        missionarys.add(missionary1());
        missionarys.add(missionary1());
        missionarys.add(missionary1());
        tither.setMissionary(missionarys);
        management.register(tither);
    }

    public Missionary missionary1(){
        return management.searchMissionaryForId(m1);
    }
    public Missionary missionary2(){
        return management.searchMissionaryForId(m2);
    }
    
    public Missionary missionary3(){
        return management.searchMissionaryForId(m3);
    }
    
//    public void missionary1() {
//        tither.addMissionary(management.searchMissionaryForId(m1));
//    }
//
//    public void missionary2() {
//        tither.addMissionary(management.searchMissionaryForId(m1));
//    }
//
//    public void missionary3() {
//        tither.addMissionary(management.searchMissionaryForId(m1));
//    }

    public Long getM1() {
        return m1;
    }

    public void setM1(Long m1) {
        this.m1 = m1;
    }

    public Long getM2() {
        return m2;
    }

    public void setM2(Long m2) {
        this.m2 = m2;
    }

    public Long getM3() {
        return m3;
    }

    public void setM3(Long m3) {
        this.m3 = m3;
    }
}
