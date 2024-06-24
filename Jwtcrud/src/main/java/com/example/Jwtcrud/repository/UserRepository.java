package com.example.Jwtcrud.repository;

import com.example.Jwtcrud.model.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("SELECT u FROM User u WHERE u.username = :username")
    Optional<User> findByUsername(String username);

    @Query("SELECT u FROM User u WHERE u.roomNo = :roomNo")
    List<User> findByRoomNo(Long roomNo);

    @Query("SELECT u FROM User u WHERE u.id IN :id AND u.roomNo IN :roomNo")
    List<User> findUserByIdAndRoomNo(@Param("id") List<Long> id, @Param ("roomNo") List<Integer> roomNo);

    @Query("SELECT u FROM User u WHERE u.id = :id")
    Optional<User> findById(Long id);
}