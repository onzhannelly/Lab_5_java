package service;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    public PasswordEncoder passwordEncoder;

    public void registerUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    public User findByUsername(String username) {
        return (User) userRepository.findByUsername(username);
    }

    public boolean deleteUser(Long id) {
        return false;
    }

    public Optional<User> updateUser(Long id, User userDetails) {
        return null;
    }

    public Optional<User> getUserById(Long id) {
        return null;
    }
}