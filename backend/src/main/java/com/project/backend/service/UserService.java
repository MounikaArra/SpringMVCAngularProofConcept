package com.project.backend.service;

import com.project.backend.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
        //create User
        public User createUser(User user);

        //getUsers
        public List<User> getUsers();

        //get user by id
        public User getUserById(long id);

        //delete user
        public void deleteUser(long id);

        //update user by id
        public User updateUser(User user,long id);
}
