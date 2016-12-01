package com.rv.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity(name = "user")
public class UserEntity implements Serializable {

	private static final long serialVersionUID = -7178215857273381009L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int id;

	@Size(min = 3, message = "{message.size}")
	@Column(name = "FirstName")
	private String firstName;

	@Size(min = 3, message = "{message.size}")
	@Column(name = "LastName")
	private String lastName;

	@OneToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "user_city", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "city_id"))
	private Set<CityEntity> cities;

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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set<CityEntity> getCities() {
		return cities;
	}

	public void setCities(Set<CityEntity> cities) {
		this.cities = cities;
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
