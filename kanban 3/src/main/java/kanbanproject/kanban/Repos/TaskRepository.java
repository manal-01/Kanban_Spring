package kanbanproject.kanban.Repos;

import org.springframework.data.jpa.repository.JpaRepository;


import kanbanproject.kanban.Functions.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {



}