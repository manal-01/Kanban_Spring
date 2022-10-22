package kanbanproject.kanban.Functions;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TaskStatus {
	private @Id long id;
	private String label;
	
	public TaskStatus(long id, String label) {
		super();
		this.id = id;
		this.label = label;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, label);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaskStatus other = (TaskStatus) obj;
		return id == other.id && Objects.equals(label, other.label);
	}

	@Override
	public String toString() {
		return "TaskStatus [id=" + id + ", label=" + label + "]";
	}
	
	

}

