package ThreeAmigosCoding.TimiFix_be.service;

import ThreeAmigosCoding.TimiFix_be.domain.User;
import ThreeAmigosCoding.TimiFix_be.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
@Autowired
public UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {

        return userRepository.findAll();
    }

    @Override
    public User findUserById(Integer userId) {
        return userRepository.findById(userId).orElseThrow(
                () -> new IllegalStateException(String.format("User doesn t exist", userId))
        );
    }

    @Override
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public User updateUser(User user, Integer id) {
        User user1 = userRepository.findById(id).orElseThrow(
                () -> new IllegalStateException(String.format("User doesn t exist"))
        );
        user1.setEmail(user.getEmail());
        user1.setFirstName(user.getFirstName());
        user1.setLastName(user.getLastName());
        user1.setRole(user.getRole());
        user1.setPhoneNumber(user.getPhoneNumber());
        user1.setBirthdate(user.getBirthdate());
        return userRepository.save(user1);
    }

}
