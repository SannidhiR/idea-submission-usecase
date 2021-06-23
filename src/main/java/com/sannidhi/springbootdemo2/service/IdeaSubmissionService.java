package com.sannidhi.springbootdemo2.service;

import com.sannidhi.springbootdemo2.dto.model.IdeaRequestDto;

public interface IdeaSubmissionService {
	
	//IdeaDto getIdeaById(Long ideaId);
	
	IdeaRequestDto signUp(IdeaRequestDto ideaRequestDto);
	
	
}