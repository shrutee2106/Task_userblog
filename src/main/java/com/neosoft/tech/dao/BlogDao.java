package com.neosoft.tech.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.tech.model.Blog;

@Repository
public interface BlogDao extends PagingAndSortingRepository<Blog, Integer> {
	
	Page<Blog> findAll(Pageable pageable);

}
