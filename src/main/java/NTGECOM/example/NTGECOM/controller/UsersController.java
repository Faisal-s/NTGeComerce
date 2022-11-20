package NTGECOM.example.NTGECOM.controller;


import NTGECOM.example.NTGECOM.entity.Users;
import NTGECOM.example.NTGECOM.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import javax.validation.Valid;

@RestController
public class UsersController {
    @Autowired
    private UserRepository userRepository;

    //Register User
    @PostMapping("/Register")
    public Users CreateUser(@RequestBody Users user){

        return userRepository.save(user);
    }

}

