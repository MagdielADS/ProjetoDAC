/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.dac.interfaces;

import br.edu.ifpb.dac.entities.Missionary;
import br.edu.ifpb.dac.entities.Tithe;
import br.edu.ifpb.dac.entities.Tither;
import java.util.List;

/**
 *
 * @author Magdiel Bruno
 */
public interface SearchControlLocal {
    public List<Tither> getTithers();
    public List<Missionary> getMissionaries();
    public List<Tithe> getTithe();
}
