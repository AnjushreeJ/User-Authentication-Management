package com.palle.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.palle.entity.User;
import com.palle.repository.UserRepository;

@Service
public class UserService {
	 @Autowired
	    private UserRepository repo;

	    public User insertUser(User user) {
	        return repo.save(user);
	    }

	    public List<User> getAllUsers() {
	        return repo.findAll();
	    }

	    public User getUserById(int id) {
	        return repo.findById(id).orElse(null);
	    }
	    
	    public User getUserByUsername(String username) {
	        return repo.findByUsername(username)
	                .orElseThrow(() -> new RuntimeException("User not found"));
	    }

	    public void deleteUser(int id) {
	        repo.deleteById(id);
	    }

}
