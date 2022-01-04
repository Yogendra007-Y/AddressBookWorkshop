package com.example.demo.bridgelabz.dto;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;

public @Data class AddressBookDTO {
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{2,}$", message = "Address Book name Invalid") //REGEX PATTERN FOR ADDRESSBOOK
	@NotNull(message = "address Book Name can not be null")
	public String addressBookName;
}


