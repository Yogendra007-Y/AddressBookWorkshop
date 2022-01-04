package com.example.demo.bridgelabz.dto;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.Data;

/**
 * @Data : Auto Generate getters and setters, constructor, toString
 *
 */
public @Data class PersonDTO {

	/**
	 * REGEX PATTERN FOR FIRST NAME
	 */
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\$]{2,}$", message = "First name Invalid")
	@NotBlank(message = "First name can not be null")
	public String fName;
	
	/**
	 * REGEX PATTERN FOR LAST NAME
	 */
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\$]{2,}$", message = "Last name Invalid")
	@NotBlank(message = "Last name can not be null")
	public String lName;
	
	/**
	 * REGEX FOR GENDER
	 */
	@Pattern(regexp = "male|female", message = "Gender needs to either male or female")
	@NotBlank(message = "Gender can not be null")
	public String gender;

	/**
	 * REGEX PATTERN FOR PHONE NUMBER
	 */
	@Pattern(regexp = "^((0091)|(\\+91)|0?)[789]{1}\\d{9}$", message = "phone Number is invalid")
	@NotBlank(message = "phone Number can not be null")
	public String phoneNumber;

	/**
	 * REGEX PATTERN FOR EMAIL ADDRESS
	 */
	@Pattern(regexp = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", message = "email is invalid")
	@NotBlank(message = "email can not be null")
	public String email;

	@NotBlank(message = "Address can not be null")
	public String address;

	@NotBlank(message = "city can not be null")
	public String city;

	@NotBlank(message = "State can not be null")
	public String state;

	
	@NotBlank(message = "Country can not be null")
	public String country;

	
	@NotBlank(message = "profilePic can not be null")
	public String profilePic;
	

}