package ThreeAmigosCoding.TimiFix_be.service;

import ThreeAmigosCoding.TimiFix_be.domain.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);

    public List<User> getUsers();

    public User findUserById(Integer userId);

    public void deleteUser(Integer id);

    public User  updateUser(User user,Integer id);
}
