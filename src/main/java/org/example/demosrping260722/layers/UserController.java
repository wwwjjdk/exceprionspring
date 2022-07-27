package org.example.demosrping260722.layers;

import org.example.demosrping260722.enumDir.Authorities;
import org.example.demosrping260722.exceprion.InvalidCredentials;
import org.example.demosrping260722.exceprion.UnauthorizedUser;
import org.example.demosrping260722.user.MyUserSpringTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {

    UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@Valid MyUserSpringTest user){
        return userService.getAuthorities(user);
    }

    /*@ExceptionHandler(InvalidCredentials.class)
    ResponseEntity<String> ex1(InvalidCredentials invalidCredentials){
        return new ResponseEntity<>(invalidCredentials.getMessage(), HttpStatus.BAD_REQUEST);
    }*/
    /*@ExceptionHandler(InvalidCredentials.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String ex1(InvalidCredentials e){
        System.out.println(e.getMessage());
        return e.getMessage();
    }
    @ExceptionHandler(UnauthorizedUser.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    String ex2(UnauthorizedUser unauthorizedUser){
        System.err.println(unauthorizedUser.getMessage());
        return unauthorizedUser.getMessage();
    }*/


}
