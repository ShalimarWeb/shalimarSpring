package com.shalimar.web.spring.Entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PolicyCodes {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String type;
	private String link;
	private int year;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, link, name, type, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PolicyCodes other = (PolicyCodes) obj;
		return id == other.id && Objects.equals(link, other.link) && Objects.equals(name, other.name)
				&& Objects.equals(type, other.type) && year == other.year;
	}
	public PolicyCodes(int id, String name, String type, String link, int year) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.link = link;
		this.year = year;
	}
	public PolicyCodes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
