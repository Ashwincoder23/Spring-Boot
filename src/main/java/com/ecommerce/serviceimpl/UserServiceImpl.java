package com.ecommerce.serviceimpl;

import com.ecommerce.entity.User;
import com.ecommerce.repository.UserRepository;
import com.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List<User> getUser() {
        return userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        if(!userRepository.existsById(user.getId())) {
            return userRepository.save(user);
        }
        return null;
    }

    @Override
    public User updateUser(User user) {
        if(userRepository.existsById(user.getId())) {
            return userRepository.save(user);
        }
        return null;
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

}
