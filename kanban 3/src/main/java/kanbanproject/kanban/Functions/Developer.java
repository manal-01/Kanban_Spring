package kanbanproject.kanban.Functions;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Developer {
	private @Id Long ID;
	private String firstname;
	private String lastname;
	private String email;
	private String pswd;
	private LocalDate startContract;
	
	
	public Developer(Long id, String firstname, String lastname, String password, String email,
			LocalDate startContract) {
		super();
		this.ID = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.pswd = password;
		this.email = email;
		this.startContract = startContract;
	}
	
	



	public void setId(Long id) {
		this.ID = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getPassword() {
		return pswd;
	}


	public void setPassword(String password) {
		this.pswd = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public LocalDate getStartContract() {
		return startContract;
	}


	public void setStartContract(LocalDate startContract) {
		this.startContract = startContract;
	}


	@Override
	public int hashCode() {
		return Objects.hash(email, firstname, ID, lastname, pswd, startContract);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Developer other = (Developer) obj;
		return Objects.equals(email, other.email) && Objects.equals(firstname, other.firstname)
				&& Objects.equals(ID, other.ID) && Objects.equals(lastname, other.lastname)
				&& Objects.equals(pswd, other.pswd) && Objects.equals(startContract, other.startContract);
	}
	
	@Override
	public String toString() {
		return "Developer [id=" + ID + ", firstname=" + firstname + ", lastname=" + lastname + ", password=" + pswd
				+ ", email=" + email + ", startContract=" + startContract + "]";
	}

	
	

}

