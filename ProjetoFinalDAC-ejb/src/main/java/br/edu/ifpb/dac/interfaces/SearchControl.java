/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.interfaces;

import br.edu.ifpb.dac.entities.Missionary;
import br.edu.ifpb.dac.entities.Tither;
import java.util.List;

/**
 *
 * @author filipe
 */
public interface SearchControl {
    public long searchQtdeMissionary();
    public long searchQtdeTither();
    public String searchNameMissionaryById(long id);
    public String searchNameTitherById(long id);
    public String searchDistrictMissionary(String name);
}
