package com.rv.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity(name = "city")
public class CityEntity implements Serializable {

	private static final long serialVersionUID = 1991756388751042624L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int id;

	@Size(min = 3, message = "{message.size}")
	@Column(name = "Name")
	private String name;

	@NotEmpty
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "StateID")
	private StateEntity stateEntity;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy="cities")
	private List<UserEntity> users;

	@NotEmpty
	@Column(name = "Status")
	private String status;

	@NotEmpty
	@Column(name = "Latitude")
	private float latitude;

	@NotEmpty
	@Column(name = "Longitude")
	private Float longitude;

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

	public StateEntity getStateEntity() {
		return stateEntity;
	}

	public void setStateEntity(StateEntity stateEntity) {
		this.stateEntity = stateEntity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public Float getLongitude() {
		return longitude;
	}

	public void setLongitude(Float longitude) {
		this.longitude = longitude;
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
