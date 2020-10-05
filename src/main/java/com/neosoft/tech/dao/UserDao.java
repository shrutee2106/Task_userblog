package com.neosoft.tech.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.tech.model.User;

@Repository
public interface UserDao extends PagingAndSortingRepository<User, Integer> {

}
