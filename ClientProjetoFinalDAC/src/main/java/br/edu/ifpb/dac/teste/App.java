/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.dac.teste;

import br.edu.ifpb.dac.interfaces.SearchControl;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Magdiel Bruno
 */
public class App {
    public static void main(String[] args){
        try{
            InitialContext ic = new InitialContext();
            SearchControl control = (SearchControl)ic.lookup("java:global/ProjetoFinalDAC-ear/ProjetoFinalDAC-ejb-1.0-SNAPSHOT/SearchControlImpl!br.edu.ifpb.dac.interfaces.SearchControl");
            
            System.out.println("Nome do missionario: "+control.searchNameMissionaryById(2));
            System.out.println("Total de missionários: "+control.searchQtdeMissionary());
            System.out.println("Bairro do misionario: "+control.searchDistrictMissionary("733.333.333-33"));
            
        }catch(NamingException ex){
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
