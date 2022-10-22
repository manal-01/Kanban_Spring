package kanbanproject.kanban;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import kanbanproject.kanban.Functions.Developer;
import kanbanproject.kanban.Functions.Task;
import kanbanproject.kanban.Repos.ChangeLogRepository;
import kanbanproject.kanban.Repos.DeveloperRepository;
import kanbanproject.kanban.Repos.TaskRepository;
import kanbanproject.kanban.Repos.TaskStatusRepository;
import kanbanproject.kanban.Repos.TaskTypeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import kanbanproject.kanban.Repos.*;
import kanbanproject.kanban.Functions.*;

@SpringBootApplication
public class KanbanApplication {

	public static void main(String[] args) {
		SpringApplication.run(KanbanApplication.class, args);
	}
	
	@Bean
    public CommandLineRunner LoadDB(DeveloperRepository DeveloperRepository, TaskRepository TaskRepository, TaskStatusRepository TaskStatusRepository, TaskTypeRepository TaskTypeRepository, ChangeLogRepository ChangeLogRepository ) {
        return (args) -> {

        	// create tasks
			TaskRepository.save(new Task(null, "Create different repos, services and entities", null, null, null, null, null));
			TaskRepository.save(new Task(null, "Create a DB for storage", null, null, null, null, null));
			
			// create developers
			DeveloperRepository.save(new Developer(null, "Manal","El Idrissi Lalami", null, null, null));
			DeveloperRepository.save(new Developer(null, "Itachi","Uchiha", null, null, null));

		
			// fetch all Developers
			System.out.println("Developers found with findAll():");
			for (Developer Developer : DeveloperRepository.findAll()) {
				System.out.println(Developer.toString());
			}
			System.out.println();

        };
    }
}


