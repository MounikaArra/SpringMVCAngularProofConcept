package com.project.backend.service;

import com.project.backend.model.User;
import com.project.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User getUserById(long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User updateUser(User user, long id) {
        User user1 = new User();
        user1.setEmail(user.getEmail());
        user1.setAddress(user.getAddress());
        user1.setNumber(user.getNumber());
        return userRepository.save(user1);
    }
}
