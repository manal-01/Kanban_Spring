package kanbanproject.kanban.Functions;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ChangeLog {
	private @Id Long id;
	private LocalDateTime occured;
	private Task task;
	private TaskStatus sourceStatus;
	private TaskStatus targetStatus;
	
	public ChangeLog(Long id, LocalDateTime occured) {
		super();
		this.id = id;
		this.occured = occured;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((occured == null) ? 0 : occured.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChangeLog other = (ChangeLog) obj;
		return Objects.equals(id, other.id) && Objects.equals(occured, other.occured);
	}

	@Override
	public String toString() {
		return "ChangeLog [id=" + id + ", occured=" + occured + "]";
	}
	

}

