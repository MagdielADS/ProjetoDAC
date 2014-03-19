/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.dac.interfaces;

/**
 *
 * @author Magdiel Bruno
 */
public interface SearchControl {
    public long searchQtdeMissionary();
    public long searchQtdeTither();
    public String searchNameMissionaryById(long id);
    public String searchNameTitherById(long id);
    public String searchDistrictMissionary(String name);
}
