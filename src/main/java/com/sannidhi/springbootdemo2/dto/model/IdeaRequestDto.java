package com.sannidhi.springbootdemo2.dto.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IdeaRequestDto{
	
	private Long id;
	
	private Long ideaId;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
    private String ideaName;

    private String ideaDesc;
	

}
