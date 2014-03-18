package br.edu.ifpb.dac.business;

import javax.ejb.Local;

/**
 *
 * @author filipe
 */
@Local
public interface Management<T> {

    public void register(T person);
}
