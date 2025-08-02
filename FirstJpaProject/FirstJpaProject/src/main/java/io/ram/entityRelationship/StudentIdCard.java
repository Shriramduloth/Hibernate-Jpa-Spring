package io.ram.entityRelationship;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class StudentIdCard {
	@Override
	public String toString() {
		return "StudentIdCard [cardNumber=" + cardNumber + ", softVersion=" + softVersion + ", student=" + student
				+ "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cardNumber;
	private String softVersion;
	@OneToOne
	private Student student;

	public int getCardNumber() {
		return cardNumber;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getSoftVersion() {
		return softVersion;
	}

	public void setSoftVersion(String softVersion) {
		this.softVersion = softVersion;
	}


}
