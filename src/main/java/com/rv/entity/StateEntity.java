package com.rv.entity;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

@Entity(name = "state")
public class StateEntity implements Serializable {

	
	private static final long serialVersionUID = -4148190483582270038L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int id;

	@Size(min = 3, message = "{message.size}")
	@Column(name = "Name")
	private String name;

	@Size(min = 2, max = 2, message = "{message.size}")
	@Column(name = "Abbreviation")
	private String abbreviation;

	@NotEmpty
	@Column(name = "DateAdded")
	private Date dateAdded;

	@NotEmpty
	@Column(name = "DateTimeAdded")
	private Date dateTimeAdded;

	@NotEmpty
	@Column(name = "LastUpdated")
	private Date lastUpdated;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public Date getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public Date getDateTimeAdded() {
		return dateTimeAdded;
	}

	public void setDateTimeAdded(Date dateTimeAdded) {
		this.dateTimeAdded = dateTimeAdded;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

}
