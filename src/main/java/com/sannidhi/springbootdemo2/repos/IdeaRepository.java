package com.sannidhi.springbootdemo2.repos;

import org.springframework.data.repository.CrudRepository;

import com.sannidhi.springbootdemo2.entities.Idea;

public interface IdeaRepository extends CrudRepository<Idea, Long> {

}
