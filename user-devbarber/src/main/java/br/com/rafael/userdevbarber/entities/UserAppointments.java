package br.com.rafael.userdevbarber.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userappointments")
public class UserAppointments implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "user_id")
	private Long user_id;
	
	@Column(name = "barber_id")
	private Long barber_id;
	
	@Column(name = "ap_datetime")
	private Date ap_datetime;
	
	public UserAppointments() {
		
	}

	public UserAppointments(Long id, Long user_id, Long barber_id, Date ap_datetime) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.barber_id = barber_id;
		this.ap_datetime = ap_datetime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public Long getBarber_id() {
		return barber_id;
	}

	public void setBarber_id(Long barber_id) {
		this.barber_id = barber_id;
	}

	public Date getAp_datetime() {
		return ap_datetime;
	}

	public void setAp_datetime(Date ap_datetime) {
		this.ap_datetime = ap_datetime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		UserAppointments other = (UserAppointments) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
