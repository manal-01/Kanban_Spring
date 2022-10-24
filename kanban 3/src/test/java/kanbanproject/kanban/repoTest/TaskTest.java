package kanbanproject.kanban.repoTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import kanbanproject.kanban.Functions.ChangeLog;
import  kanbanproject.kanban.Functions.Developer;
import  kanbanproject.kanban.Functions.Task;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TaskTest {

	@Test
	public void testAddDeveloperToTask() {
		Developer dev = new Developer(null, null, null, null, null, null);
		Task task = new Task();
		task.addDeveloper(dev);
		assertEquals(1, task.getDevelopers().size());
		assertEquals(1, dev.getTasks().size());
	}
	@Test
	public void testAddChangeLog() {
		ChangeLog changeLog = new ChangeLog(null, null);
		Task task = new Task();
		task.addChangeLog(changeLog);
		assertEquals(1, task.getChangeLogs().size());
		
	} 
}
