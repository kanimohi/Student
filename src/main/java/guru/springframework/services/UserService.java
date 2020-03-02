package guru.springframework.services;

import guru.springframework.domain.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}


