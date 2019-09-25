package uk.ac.belfastmet.dwarfs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;

/**
 * repository interface that communicates with database
 * @author MCN17134884
 *
 */
@Repository
public interface DwarfRepository extends CrudRepository<Dwarf, Long> {

}
