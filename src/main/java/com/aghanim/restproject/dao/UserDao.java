package com.aghanim.restproject.dao;

import com.aghanim.restproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao  extends JpaRepository<User, Long> {
}
