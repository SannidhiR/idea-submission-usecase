package com.sannidhi.springbootdemo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sannidhi.springbootdemo2.dto.model.IdeaRequestDto;
import com.sannidhi.springbootdemo2.service.IdeaSubmissionService;

@RestController
public class UserController {
	@Autowired
	private IdeaSubmissionService ideaSubmissionService;
	
	/* To submit an idea by the user */
	@PostMapping(value = "idea/submit") 
	private IdeaRequestDto submitIdea(@RequestBody IdeaRequestDto ideaRequestDto) { 
		return ideaSubmissionService.signUp(ideaRequestDto);
	} 

}