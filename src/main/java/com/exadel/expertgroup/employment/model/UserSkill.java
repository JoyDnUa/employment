package com.exadel.expertgroup.employment.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="users_skills")
public class UserSkill implements Serializable  {

	private static final long serialVersionUID = -5684961788537787545L;
	
	public static UserSkill create(User user, Skill skill, Date added){
		UserSkill userSkill = new UserSkill();
		userSkill.setUser(user);
		userSkill.setSkill(skill);
		userSkill.setAdded(added);
		return userSkill;
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_skill", nullable = false)
    private Skill skill;
    
    @Column(name = "level")
    private int level;
    
    @Column(name = "time_in_use")
    private float timeInUse;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "added")
    private Date added;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_update")
    private Date lastUpdate;

    @Column(name = "wish")
    private boolean wish;

	public UserSkill() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public float getTimeInUse() {
		return timeInUse;
	}

	public void setTimeInUse(float timeInUse) {
		this.timeInUse = timeInUse;
	}

	public Date getAdded() {
		return added;
	}

	public void setAdded(Date added) {
		this.added = added;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public boolean isWish() {
		return wish;
	}

	public void setWish(boolean wish) {
		this.wish = wish;
	}


}

