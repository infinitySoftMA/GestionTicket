package ma.infinitysof.teammanagement.auth.service;

import ma.infinitysof.teammanagement.auth.entities.Role;
import ma.infinitysof.teammanagement.auth.entities.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String firstName, String roleName);
    User getUser(String firstName);
    List<User> getUsers(); // TODO : Page instead of List
}
