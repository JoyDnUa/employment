package com.exadel.expertgroup.employment.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="skills")
public class Skill implements Serializable {

	private static final long serialVersionUID = 2561085458824722663L;
	
    public static Skill create(String name) {
    	Skill skill = new Skill();
    	skill.setName(name);
        return skill;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", length = 100)
    private String name;

	public Skill() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
