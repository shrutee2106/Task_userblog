package com.neosoft.tech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
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
import com.neosoft.tech.service.ServiceI;
@RestController
@RequestMapping("/api")
public class Blogcontroller {
	@Autowired
	ServiceI si;
	
	//Add blogs
	@PostMapping("/addblog")
	public Blog addBlog(@RequestBody Blog blog) {
		
		
		return si.addblog(blog);
		
	}
	
	//Delete Blogs
	@DeleteMapping("/deleteblog/{id}")
	public void deleteBlog(@PathVariable("id") int id) {
		
		si.deleteblog(id);
		
	}
	
	//Update Blogs
	@PatchMapping("/updateblog/{id}")
	public Blog updateblog(@PathVariable("id") int id, @RequestBody Blog blog) {
		
		
		return si.updateblog(blog);
	}
	
	//Read Blogs
	@GetMapping("/readblog")
	public List<Blog> readblog() {
		
		
		return si.readblog();
		
	}
	
	//Paging & sorting blogs
	@GetMapping(value = "/blog/page/sort/{pageno}")
	public List<Blog> getPaginatedData(@PathVariable("pageno") int pageno) {
		
		int pagesize = 2;
		 
		return si.getPaginatedData(PageRequest.of(pageno, pagesize, Sort.by("title")
											  .descending())
				);
	}

}
