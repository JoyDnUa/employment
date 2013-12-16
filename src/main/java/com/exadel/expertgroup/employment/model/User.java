package com.exadel.expertgroup.employment.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="users")
public class User implements Serializable {

	private static final long serialVersionUID = -3530976446812840890L;
	
    public static User create(String username, Date lastUpdate) {
        User user = new User();
        user.setUsername(username);
        user.setLastUpdate(lastUpdate);
        return user;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "username", length = 30)
    private String username;

    @Column(name = "firstname", length = 30)
    private String firstname;

    @Column(name = "lastname", length = 30)
    private String lastname;

    @Column(name = "mail", length = 50)
    private String mail;

    @Column(name = "workload")
    private int workload;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_update")
    private Date lastUpdate;

	public User() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getWorkload() {
		return workload;
	}

	public void setWorkload(int workload) {
		this.workload = workload;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
    

}
