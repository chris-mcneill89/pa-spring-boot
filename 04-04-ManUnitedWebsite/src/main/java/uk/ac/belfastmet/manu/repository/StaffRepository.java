package uk.ac.belfastmet.manu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import uk.ac.belfastmet.manu.domain.Staff;

/**
 * repository interface that communicates with database
 * @author MCN17134884
 *
 */
@Repository
public interface StaffRepository extends CrudRepository<Staff, Long>{

}
