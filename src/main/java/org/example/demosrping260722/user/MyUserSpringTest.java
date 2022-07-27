package org.example.demosrping260722.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@AllArgsConstructor
@Data
@Validated
public class MyUserSpringTest {
    @Email(message = "email must be valid")
    private String user;
    @Size(min = 2,max = 20, message = "password should be between 2 & 10 characters")
    private String password;
}
