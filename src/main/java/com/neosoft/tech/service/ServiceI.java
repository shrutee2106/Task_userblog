package com.neosoft.tech.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.neosoft.tech.model.Blog;
import com.neosoft.tech.model.User;

public interface ServiceI {


	User create(User user);

	User updateuser(User user);

	Blog addblog(Blog blog);

	void deleteblog(int id);

	Blog updateblog(Blog blog);

	List<Blog> readblog();

	Page<Blog> blogPaging(Pageable pageableSortedByCityDesc);

	List<Blog> getPaginatedData(PageRequest pgreq);

}
