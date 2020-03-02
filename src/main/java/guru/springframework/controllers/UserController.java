package guru.springframework.controllers;

import Validator.UserValidator;
import guru.springframework.domain.User;
import guru.springframework.services.SecurityService;
import guru.springframework.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {


   // @RequestMapping(value = "/users",method = RequestMethod.GET )
   // public List<User> getAllUsers() {
    //    return userService.getAllUsers();
   // }

   // @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
   // public Optional<User> getUsers(@PathVariable Integer id){
     //   return userService.getUsers(id);
    //}


    //@RequestMapping(value = "/users", method = RequestMethod.POST)
   // public Object addUser(@RequestBody User user) {
     //   userService.addUser(user);
     //   return "Inserted Successfully";
   // }

    //@RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
   // public Object updateUser(@RequestBody User user, @PathVariable Integer id) {
       // userService.updateUser(id, user);
       // return "Updated Successfully";
    //}

    //@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    //public Object deleteUser(@PathVariable Integer id) {
       // userService.deleteUser(id);
       // return "Deleted Successfully";
   // }
    //@RequestMapping(value = "/login",method = RequestMethod.POST)
    //public Object login(@RequestBody User user){

      //  userService.login(user.getUsername(),user.getPassword());
       // return "login";

    //}

    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;

    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("userForm", new User());
        return "registration";
    }

    @PostMapping("/registration")
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult) {
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);

        securityService.autoLogin(userForm.getUsername(), userForm.getPasswordConfirm());

        return "redirect:/welcome";
    }

    @GetMapping("/login")
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login";
    }

    }



