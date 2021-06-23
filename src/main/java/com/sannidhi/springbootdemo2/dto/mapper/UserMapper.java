package com.sannidhi.springbootdemo2.dto.mapper;

import com.sannidhi.springbootdemo2.dto.model.IdeaRequestDto;
import com.sannidhi.springbootdemo2.entities.Idea;
import com.sannidhi.springbootdemo2.entities.User;

public class UserMapper {
	
	//Converting User Layer to UserDto Layer
	//For One To One Mapping we are using ideaDetail and using the get method of ideaDetail to fetch the details of another class.[ideaName,ideaDesc].
	public IdeaRequestDto convertToUserDto(User user) {
		
		IdeaRequestDto userDto = new IdeaRequestDto();
		Idea ideaDetail = user.getIdeaDetail();
		userDto.setId(user.getId());
		userDto.setIdeaId(ideaDetail.getId());
		userDto.setFirstName(user.getFirstName());
		userDto.setLastName(user.getLastName());
		userDto.setEmail(user.getEmail());
		userDto.setIdeaName(ideaDetail.getIdeaName());
		userDto.setIdeaDesc(ideaDetail.getIdeaDesc());	
		return userDto;
		
	}

}
