package com.user.user.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	private int id;
	private String name;
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
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

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int i, String name) {
		super();
		this.id = i;
		this.name = name;
	
	}
	//private Date barrowDate;
	
	


}
