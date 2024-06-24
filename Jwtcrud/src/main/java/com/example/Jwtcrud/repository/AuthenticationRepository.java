package com.example.Jwtcrud.repository;

import com.example.Jwtcrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthenticationRepository extends JpaRepository<User,Long > {


}
