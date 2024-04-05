package ThreeAmigosCoding.TimiFix_be.controller;

import ThreeAmigosCoding.TimiFix_be.domain.User;
import ThreeAmigosCoding.TimiFix_be.service.UserService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @PersistenceContext
    EntityManager entityManager;

    @PostMapping("/add")
    public User add(@RequestBody User user) {
        userService.saveUser(user);
        return user;
    }

    @GetMapping("/get-all")
    public List<User> getAll() {
        return userService.getUsers();
    }


    @DeleteMapping("/delete")
    @Transactional
    public String deleteUser(@RequestParam Integer id) {

        userService.deleteUser(id);
        //entityManager.createNativeQuery("ALTER TABLE user AUTO_INCREMENT = 1").executeUpdate();
        return "User deleted";
    }

    @GetMapping("/if-exist")
    public User ifExistUser(@RequestParam Integer userId) {
        return userService.findUserById(userId);
    }

    @PutMapping("/update")
    public User updateUser(@RequestBody User user,@RequestParam Integer id) {
        return userService.updateUser(user,id);
    }
}
