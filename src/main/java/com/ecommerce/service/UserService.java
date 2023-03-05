package com.ecommerce.service;

import com.ecommerce.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    public User getUserById(Long id);

    public List<User> getUser();

    public User saveUser(User user);

    public User updateUser(User user);

    public void deleteUser(Long id);
}
