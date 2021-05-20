package com.blog.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {

	private String userName;
	private String email;
	private LocalDateTime createdOn;
	
}
