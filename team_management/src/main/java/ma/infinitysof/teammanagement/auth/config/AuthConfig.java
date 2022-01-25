package ma.infinitysof.teammanagement.auth.config;

import lombok.RequiredArgsConstructor;
import ma.infinitysof.teammanagement.auth.entities.Role;
import ma.infinitysof.teammanagement.auth.repo.UserRepository;
import ma.infinitysof.teammanagement.auth.entities.User;
import ma.infinitysof.teammanagement.auth.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration @RequiredArgsConstructor
public class AuthConfig {

    private final UserService userService;


    public CommandLineRunner initAuth() {
        return args -> {
            userService.saveRole(new Role(null,"ROLE_ADMIN"));
            userService.saveRole(new Role(null,"ROLE_TECH"));
            userService.saveRole(new Role(null,"ROLE_MANAGER"));
            userService.saveRole(new Role(null,"ROLE_SUPER_ADMIN"));

            userService.saveUser(new User(null, "admin", "admin", "1234", "093893", "f.chebihi@gmail.com", "casablanca",new ArrayList<>()));
            userService.saveUser(new User(null, "tech", "tech", "1234", "093893", "f.chebihi@gmail.com", "casablanca",new ArrayList<>()));
            userService.saveUser(new User(null, "manager", "manager", "1234", "093893", "f.chebihi@gmail.com", "casablanca",new ArrayList<>()));

            userService.addRoleToUser("admin", "ROLE_ADMIN");
            userService.addRoleToUser("tech", "ROLE_TECH");
            userService.addRoleToUser("manager", "ROLE_MANAGER");
        } ;
    }
}
