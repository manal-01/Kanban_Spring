package kanbanproject.kanban.Functions;


import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TaskType {
	private @Id Long id;
	private String label;
	
	public TaskType(Long id, String label) {
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
		TaskType other = (TaskType) obj;
		return Objects.equals(id, other.id) && Objects.equals(label, other.label);
	}

	@Override
	public String toString() {
		return "TaskType [id=" + id + ", label=" + label + "]";
	}
	
	
	
}


