package com.neosoft.tech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.neosoft.tech.dao.BlogDao;
import com.neosoft.tech.dao.UserDao;
import com.neosoft.tech.model.Blog;
import com.neosoft.tech.model.User;

@Service
public class UserServiceImpl implements ServiceI {

	@Autowired
	UserDao ud;
	@Autowired
	BlogDao bd;
	
	@Override
	public User create(User user) {
		//ud.saveAll(user);
		return ud.save(user);
	}

	@Override
	public User updateuser(User user) {
		
		return ud.save(user);
	}

	@Override
	public Blog addblog(Blog blog) {

		return bd.save(blog);

	}

	@Override
	public void deleteblog(int id) {
		bd.deleteById(id);
		
	}

	@Override
	public Blog updateblog(Blog blog) {
		
		return bd.save(blog);
	}

	@Override
	public List<Blog> readblog() {
		
		List<Blog> l=(List<Blog>) bd.findAll();
		return  l;
	}

	

	@Override
	public List<Blog> getPaginatedData(PageRequest pgreq) {


		 return bd.findAll(pgreq).getContent();
	}

	@Override
	public Page<Blog> blogPaging(Pageable pageableSortedByCityDesc) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
