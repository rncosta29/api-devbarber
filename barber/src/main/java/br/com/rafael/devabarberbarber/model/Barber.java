package br.com.rafael.devabarberbarber.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "barbers")
public class Barber implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String avatar;
	private Double stars;
	private String latitude;
	private String longitude;
	
	public Barber() {

	}

	public Barber(Long id, String name, String avatar, Double stars, String latitude, String longitude) {
		this.id = id;
		this.name = name;
		this.avatar = avatar;
		this.stars = stars;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public Barber(String name, String avatar, Double stars, String latitude, String longitude) {
		this.name = name;
		this.avatar = avatar;
		this.stars = stars;
		this.latitude = latitude;
		this.longitude = longitude;
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

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Double getStars() {
		return stars;
	}

	public void setStars(Double stars) {
		this.stars = stars;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Barber other = (Barber) obj;
		if (id != other.id)
			return false;
		return true;
	}
}
