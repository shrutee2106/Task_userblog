package com.neosoft.tech.controller;

import java.util.List;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.tech.model.Blog;
import com.neosoft.tech.model.User;
import com.neosoft.tech.service.ServiceI;

@RestController
@RequestMapping("/api")
public class Usercontroller {
	
	public static final int pageSize=5;

	@Autowired
	ServiceI si;
	
	//Create user
	@PostMapping("/create")
	public User createuser(@RequestBody User user){
		
		//si.create(user);
		return si.create(user);
		
	}
	
	//update Users
	@PatchMapping("/update")
	public User updateuser(@RequestBody User user) {
		
		return si.updateuser(user);
		
	}
	
/*	@PostMapping("/addblog")
	public Blog addBlog(@RequestBody Blog blog) {
		
		
		return si.addblog(blog);
		
	}
	
	@DeleteMapping("/deleteblog/{id}")
	public void deleteBlog(@PathVariable("id") int id) {
		
		si.deleteblog(id);
		
	}
	
	@PatchMapping("/updateblog/{id}")
	public Blog updateblog(@PathVariable("id") int id, @RequestBody Blog blog) {
		
		
		return si.updateblog(blog);
	}
	
	
	@GetMapping("/readblog")
	public List<Blog> readblog() {
		
		
		return si.readblog();
		
	}
	
	@GetMapping(value = "/blog/page/sort/{pageno}")
	public List<Blog> getPaginatedData(@PathVariable("pageno") int pageno) {
		
		int pagesize = 2;
		 
		return si.getPaginatedData(PageRequest.of(pageno, pagesize, Sort.by("title")
											  .descending())
				);
	*/
	}
