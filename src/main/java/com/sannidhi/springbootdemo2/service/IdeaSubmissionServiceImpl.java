package com.sannidhi.springbootdemo2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sannidhi.springbootdemo2.dto.model.IdeaRequestDto;
import com.sannidhi.springbootdemo2.entities.Idea;
import com.sannidhi.springbootdemo2.entities.User;
import com.sannidhi.springbootdemo2.repos.IdeaRepository;
import com.sannidhi.springbootdemo2.repos.UserRepository;

@Service
public class IdeaSubmissionServiceImpl implements IdeaSubmissionService {


	@Autowired
	private UserRepository userRepository;

	@Autowired
	private IdeaRepository ideaRepository;	

	@Override
	public IdeaRequestDto signUp(IdeaRequestDto ideaRequestDto) {
		
		Idea idea = new Idea();
		idea.setIdeaName(ideaRequestDto.getIdeaName());
		idea.setIdeaDesc(ideaRequestDto.getIdeaDesc());
		Idea ideaSaved = ideaRepository.save(idea);	
		User user= userRepository.findByEmail(ideaRequestDto.getEmail());
		if (user==null) {
			user = new User();		
	 		user.setFirstName(ideaRequestDto.getFirstName());
	 		user.setLastName(ideaRequestDto.getLastName());
	 		user.setEmail(ideaRequestDto.getEmail());
	 		user.setIdeaDetail(ideaSaved);
	 		userRepository.save(user);  
		}
		return convertToIdeaRequestDto(userRepository.save(user)); 
	 }
	
public IdeaRequestDto convertToIdeaRequestDto(User user) {
	
	IdeaRequestDto ideaRequestDto = new IdeaRequestDto();
	System.out.println("User"+user);
	ideaRequestDto.setId(user.getId());
	ideaRequestDto.setIdeaId(user.getIdeaDetail().getId());
	ideaRequestDto.setFirstName(user.getFirstName());
	ideaRequestDto.setLastName(user.getLastName());
	ideaRequestDto.setEmail(user.getEmail());
	ideaRequestDto.setIdeaName(user.getIdeaDetail().getIdeaName());
	ideaRequestDto.setIdeaDesc(user.getIdeaDetail().getIdeaDesc());	
	return ideaRequestDto;	
	}

}

