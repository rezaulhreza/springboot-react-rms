/**
 * 
 */
package com.example.demo.student;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

public class Student {

	private Long id;
	private String name;
	private String email;
	private Gender gender;
	public Student(long id, String name, String email, Gender female) {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
//	public void setId(Long id) {
//		this.id = id;
//	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
//	public void setName(String name) {
//		this.name = name;
//	}

	/**
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
//	public void setGender(Gender gender) {
//		this.gender = gender;
//	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
//	public void setEmail(String email) {
//		this.email = email;
//	}

}



