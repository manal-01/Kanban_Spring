package kanbanproject.kanban;



import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import kanbanproject.kanban.Repos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KanbanApplicationTests {
	public class KanbanApplicationTest {

		@Autowired
		private TaskRepository taskRepository;
		
		@Test
		public void contexLoads() throws Exception {
			assertThat(taskRepository).isNotNull();
		}
	}}
