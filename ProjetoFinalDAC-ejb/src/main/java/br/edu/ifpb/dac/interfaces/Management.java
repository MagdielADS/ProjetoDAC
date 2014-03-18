package br.edu.ifpb.dac.interfaces;

import javax.ejb.Remote;


/**
 *
 * @author Magdiel Bruno
 */
@Remote
public interface Management<T> {
    public void register(T person);
    public void update(T person);
    public void remove(T person);
    public T search(T person);
}
