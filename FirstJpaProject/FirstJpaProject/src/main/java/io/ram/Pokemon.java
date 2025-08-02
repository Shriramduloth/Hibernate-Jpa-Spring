package io.ram;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Pokemon_Table")
public class Pokemon {
	@Id
	@Column(name="Pokemon_name")
	private String name;
	@Column(nullable=false)
	private String type;
	
	private int power;
	
	private String color;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
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
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
	@Override
	public String toString() {
		return  this.name+" "+this.type+" "+this.power+" "+this.color;
	}
	
}
