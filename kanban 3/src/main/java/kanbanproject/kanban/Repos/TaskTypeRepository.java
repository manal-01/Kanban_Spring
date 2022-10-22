package kanbanproject.kanban.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import kanbanproject.kanban.Functions.TaskType;

public interface TaskTypeRepository extends JpaRepository<TaskType, Long> {

}

