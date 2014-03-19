package br.edu.ifpb.dac.interfaces;

import br.edu.ifpb.dac.entities.Missionary;
import br.edu.ifpb.dac.entities.Tither;
import javax.ejb.Local;

/**
 *
 * @author filipe
 */
@Local
public interface Management<T> {

    public void register(T person);
    
    public Missionary searchMissionaryForId(Long id);
    
    public Tither searchTitherForId(Long id);
}
