package com.sannidhi.springbootdemo2.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sannidhi.springbootdemo2.entities.Idea;
import com.sannidhi.springbootdemo2.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	User findByEmail(String email);
	
	User findByIdeaDetail(Idea ideaDetail);

}
