package uk.ac.belfastmet.manu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import uk.ac.belfastmet.manu.domain.Player;

/**
 * player repository interface that communicates with database
 * @author MCN17134884
 *
 */
@Repository
public interface PlayerRepository extends CrudRepository<Player, Long>{

}