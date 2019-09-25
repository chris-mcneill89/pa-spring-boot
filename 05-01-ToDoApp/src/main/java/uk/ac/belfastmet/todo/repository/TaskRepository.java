package uk.ac.belfastmet.todo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import uk.ac.belfastmet.todo.domain.Task;

/**
 * repository interface that communicates with database
 * @author MCN17134884
 *
 */
@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {

}
