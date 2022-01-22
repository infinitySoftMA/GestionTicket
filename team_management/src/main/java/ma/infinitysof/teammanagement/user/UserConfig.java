package ma.infinitysof.teammanagement.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    private final UserRepository userRepository;

    public UserConfig(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Bean
    public CommandLineRunner initUser() {
        return args -> userRepository.save(new User(
                null,
                "chebihi",
                "fayçal",
                "0666666",
                "f.chebihi@gmail.com",
                "Casablanca"
        ));
    }
}
