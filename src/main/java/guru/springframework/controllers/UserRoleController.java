package guru.springframework.controllers;

import guru.springframework.domain.UserRole;
import guru.springframework.services.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserRoleController {
    @Autowired
    private UserRoleService userRoleService;

    @RequestMapping("/userroles")
    public List<UserRole> getAllUserRoles() {
        return userRoleService.getAllUserRoles();
    }

    @RequestMapping(value = "/userroles/{id}", method = RequestMethod.GET)
    public Optional<UserRole> getUserRoles(@PathVariable Integer id){
        return userRoleService.getUserRoles(id);
    }


    @RequestMapping(value = "/userroles", method = RequestMethod.POST)
    public Object addUserRole(@RequestBody UserRole userRole) {
        userRoleService.addUserRole(userRole);
        return "Inserted Successfully";
    }

    @RequestMapping(value = "/userroles/{id}", method = RequestMethod.PUT)
    public Object updateUserRole(@RequestBody UserRole userRole, @PathVariable Integer id) {
        userRoleService.updateUserRole(id, userRole);
        return "Updated Successfully";
    }

    @RequestMapping(value = "/userroles/{id}", method = RequestMethod.DELETE)
    public Object deleteUserRole(@PathVariable Integer id) {
        userRoleService.deleteUserRole(id);
        return "Deleted Successfully";
    }

}
