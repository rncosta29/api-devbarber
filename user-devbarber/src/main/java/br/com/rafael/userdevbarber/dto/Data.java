package br.com.rafael.userdevbarber.dto;

import java.io.Serializable;

public class Data implements Serializable {

	private static final long serialVersionUID = 1L;

	private String errors;
	
	private Object data;

	private String token;
	
	public Data() {
		
	}

	public Data(String errors, Object data, String token) {
		super();
		this.errors = errors;
		this.data = data;
		this.token = token;
	}


	public String getErrors() {
		return errors;
	}

	public void setErrors(String errors) {
		this.errors = errors;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
