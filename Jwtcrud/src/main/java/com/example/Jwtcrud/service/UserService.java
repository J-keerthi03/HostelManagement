package com.example.Jwtcrud.service;

import com.example.Jwtcrud.model.User;
import com.example.Jwtcrud.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public List<User> getUserByRoomNo(Long roomNo) {
        return userRepository.findByRoomNo(roomNo);
    }

    public Optional<User> getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public List<User> searchUsersByIdAndRoomNo(List<Long> id, List<Integer> roomNo) {
        return userRepository.findUserByIdAndRoomNo(id, roomNo);
    }

    @Transactional
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(Math.toIntExact(id));
    }

}
