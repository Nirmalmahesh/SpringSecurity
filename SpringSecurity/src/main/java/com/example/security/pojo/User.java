package com.example.security.pojo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="id")
	private int Id;
	private String username;
	private String password;
	private String email;
	private String lastname;
	private int active;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "id"), inverseJoinColumns = @JoinColumn(name = "roleid"))
	private Set<Role> Roles;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		email = email;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		lastname = lastname;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		active = active;
	}
	public Set<Role> getRoles() {
		return Roles;
	}
	public void setRoles(Set<Role> roles) {
		Roles = roles;
	}
	public User(int id, String username, String password, String email, String lastname, int active, Set<Role> roles) {
		super();
		Id = id;
		username = username;
		password = password;
		email = email;
		lastname = lastname;
		active = active;
		roles = roles;
	}
	public User() {
		super();
	}
	
}
