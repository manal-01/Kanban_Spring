package kanbanproject.kanban.Repos;



import org.springframework.data.jpa.repository.JpaRepository;


import kanbanproject.kanban.Functions.Developer;

public interface DeveloperRepository extends JpaRepository<Developer, Long> {

}
