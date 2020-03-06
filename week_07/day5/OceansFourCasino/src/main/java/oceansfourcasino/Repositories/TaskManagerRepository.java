package oceansfourcasino.Repositories;

import oceansfourcasino.Models.TaskManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskManagerRepository extends JpaRepository<TaskManager, Long> {
}
