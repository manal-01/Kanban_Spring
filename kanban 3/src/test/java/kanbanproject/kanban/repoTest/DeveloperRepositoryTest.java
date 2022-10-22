


package kanbanproject.kanban.repoTest;


import java.util.List;

import org.junit.Assert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.util.Assert;

import kanbanproject.kanban.Functions.*;

import kanbanproject.kanban.Repos.DeveloperRepository;


@DataJpaTest
@AutoConfigureTestDatabase()
public class DeveloperRepositoryTest {

 
    @Autowired
    private DeveloperRepository repo;
    @Test
    public void testlistDevelopers() {
        List<Developer> developers = (List<Developer>) repo.findAll();
        Assert.assertEquals(1, developers.size());
    }
	
	
	}



