package guru.springframework.services;

import guru.springframework.domain.User;
import guru.springframework.domain.UserRole;
import guru.springframework.repositories.UserRepository;
import guru.springframework.repositories.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserRoleService {
    @Autowired
    UserRoleRepository userRoleRepository;

    public List<UserRole> getAllUserRoles() {
        List<UserRole> userRoles = new ArrayList<>();
        userRoleRepository.findAll().forEach(userRoles::add);
        return userRoles;
    }
    public Optional<UserRole> getUserRoles(Integer id) {
        return userRoleRepository.findById(id);
    }

    public void addUserRole(UserRole userRole) {
        userRoleRepository.save(userRole);
    }

    public void updateUserRole(Integer id, UserRole userRole) {
        userRoleRepository.save(userRole);
    }

    public void deleteUserRole(Integer id) {
        userRoleRepository.deleteById(id);
    }
}

