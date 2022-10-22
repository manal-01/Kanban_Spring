package kanbanproject.kanban.Repos;


import org.springframework.data.jpa.repository.JpaRepository;


import kanbanproject.kanban.Functions.TaskStatus;

public interface TaskStatusRepository extends JpaRepository<TaskStatus, Long> {

}
