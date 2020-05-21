package risorse;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "registrazione")
public class Autorizzazione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int ID;
	@Column(name = "username")
	private String username;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	
	
	public int getID() {
		return ID;
	}
	public String getUsername() {
		return username;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Autorizzazione(int iD, String username, String email, String password) {
		setID(iD);
		setUsername(username);
		setEmail(email);
		setPassword(password);
	}
	
	@Override
	public String toString() {
		return "Autorizzazione [ID=" + ID + ", username=" + username + ", email=" + email + ", password=" + password
				+ "]";
	}
	
}
