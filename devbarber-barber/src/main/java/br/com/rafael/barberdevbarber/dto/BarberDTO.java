package br.com.rafael.barberdevbarber.dto;

import java.io.Serializable;

import br.com.rafael.barberdevbarber.entities.Barber;

public class BarberDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String avatar;
	private Float stars;
	private String latitude;
	private String longitude;
	
	public BarberDTO() {
		super();
	}

	public BarberDTO(Barber barber) {
		this.name = barber.getName();
		this.avatar = barber.getAvatar();
		this.stars = barber.getStars();
		this.latitude = barber.getLatitude();
		this.longitude = barber.getLongitude();
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

	public Float getStars() {
		return stars;
	}

	public void setStars(Float stars) {
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
}
