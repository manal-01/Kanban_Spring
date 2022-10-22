package kanbanproject.kanban.Repos;


import org.springframework.data.jpa.repository.JpaRepository;



import kanbanproject.kanban.Functions.ChangeLog;

public interface ChangeLogRepository extends JpaRepository<ChangeLog, Long> {

}