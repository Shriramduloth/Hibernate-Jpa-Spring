package io.ram.entityRelationship;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rollNo;

	@Column(name = "Student_name", nullable = false)
	private String name;
	
	@OneToOne
	private StudentIdCard card;

	public StudentIdCard getCard() {
		return card;
	}

	public void setCard(StudentIdCard card) {
		this.card = card;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", card=" + card + "]";
	}

	public void setName(String name) {
		this.name = name;
	}
}
