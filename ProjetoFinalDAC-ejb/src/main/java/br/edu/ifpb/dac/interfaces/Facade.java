/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.dac.interfaces;

import br.edu.ifpb.dac.entities.Tithe;

/**
 *
 * @author Magdiel Bruno
 */
public interface Facade {
    public String authUser(String login, String password);
    public void launchTithing(Tithe tithe);
    public void logout();
}
