package com.sannidhi.springbootdemo2.dto.mapper;

import com.sannidhi.springbootdemo2.dto.model.IdeaDto;
import com.sannidhi.springbootdemo2.dto.model.IdeaRequestDto;
import com.sannidhi.springbootdemo2.entities.Idea;
import com.sannidhi.springbootdemo2.entities.User;

public class IdeaMapper {
	
	public static IdeaDto convertToIdeaDto(Idea idea) {
		
		IdeaDto ideaDto =new IdeaDto();
			ideaDto.setId(idea.getId());
			ideaDto.setIdeaName(idea.getIdeaName());
			ideaDto.setIdeaDesc(idea.getIdeaDesc());
		return ideaDto;
	
		
		
	}

}



