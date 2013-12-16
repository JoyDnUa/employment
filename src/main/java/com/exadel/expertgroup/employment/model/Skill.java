package com.exadel.expertgroup.employment.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.apache.commons.lang.builder.ToStringBuilder;

@Entity
@Table(name="skills")
public class Skill implements Serializable {

	private static final long serialVersionUID = 2561085458824722663L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", length = 100)
    private String name;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_time", nullable = false)
    private Date creationTime;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modification_time", nullable = false)
    private Date modificationTime;
    
    @Version
    private Integer version = 0;

	public Skill() {
	}

    public static Skill create(String name) {
    	Skill skill = new Skill();
    	skill.setName(name);
        return skill;
    }

    @PreUpdate
    public void preUpdate() {
    	this.modificationTime = new Date();
    }
    
    @PrePersist
    public void prePersist() {
        Date now = new Date();
        this.creationTime = now;
        this.modificationTime = now;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
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

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public Date getModificationTime() {
		return modificationTime;
	}

	public void setModificationTime(Date modificationTime) {
		this.modificationTime = modificationTime;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	
}
