package kanbanproject.kanban.Functions;

import java.time.LocalDate;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Task {
	@GeneratedValue(strategy = GenerationType.AUTO)
	private @Id Long id;
	private String title;
	private Integer nbHoursForecast;
	private Integer nbHoursReal;
	private LocalDate created;
	private TaskType type;
	private TaskStatus status;
	
	@ManyToMany(fetch=FetchType.EAGER)
	private Set<Developer> developers;
	
	@OneToMany(mappedBy="task", cascade= {CascadeType.ALL}, orphanRemoval=true)
	private Set<ChangeLog> changeLogs;
	

	public Task() {
		this.developers = new HashSet<>();
		this.changeLogs = new HashSet<>();
	}

	public Task(Long id, String title, Integer nbHoursForecast, Integer nbHoursReal, LocalDate created, TaskType type,
			TaskStatus status) {
		super();
		this.id = id;
		this.title = title;
		this.nbHoursForecast = nbHoursForecast;
		this.nbHoursReal = nbHoursReal;
		this.created = created;
		this.type = type;
		this.status = status;
	}
	
	
	
	public void addDeveloper(Developer developer) {
		this.developers.add(developer);
	}
	
	


	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getNbHoursForecast() {
		return nbHoursForecast;
	}

	public void setNbHoursForecast(Integer nbHoursForecast) {
		this.nbHoursForecast = nbHoursForecast;
	}

	public Integer getNbHoursReal() {
		return nbHoursReal;
	}

	public void setNbHoursReal(Integer nbHoursReal) {
		this.nbHoursReal = nbHoursReal;
	}

	public LocalDate getCreated() {
		return created;
	}

	public void setCreated(LocalDate created) {
		this.created = created;
	}

	public TaskType getType() {
		return type;
	}

	public void setType(TaskType type) {
		this.type = type;
	}

	public TaskStatus getStatus() {
		return status;
	}

	public void setStatus(TaskStatus status) {
		this.status = status;
	}

	public Set<Developer> getDevelopers() {
		return developers;
	}

	public void setDevelopers(Set<Developer> developers) {
		this.developers = developers;
	}

	public Set<ChangeLog> getChangeLogs() {
		return changeLogs;
	}

	public void setChangeLogs(Set<ChangeLog> changeLogs) {
		this.changeLogs = changeLogs;
	}

	@Override
	public int hashCode() {
		return Objects.hash(created, id, nbHoursForecast, nbHoursReal, status, title, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return Objects.equals(created, other.created) && Objects.equals(id, other.id)
				&& Objects.equals(nbHoursForecast, other.nbHoursForecast)
				&& Objects.equals(nbHoursReal, other.nbHoursReal) && Objects.equals(status, other.status)
				&& Objects.equals(title, other.title) && Objects.equals(type, other.type);
	}



	@Override
	public String toString() {
		return "Task [id=" + id + ", title=" + title + ", nbHoursForecast=" + nbHoursForecast + ", nbHoursReal="
				+ nbHoursReal + ", created=" + created + ", type=" + type + ", status=" + status + "]";
	}

	
	
	
}

