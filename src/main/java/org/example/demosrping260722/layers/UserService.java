package org.example.demosrping260722.layers;

import org.example.demosrping260722.enumDir.Authorities;
import org.example.demosrping260722.exceprion.InvalidCredentials;
import org.example.demosrping260722.exceprion.UnauthorizedUser;
import org.example.demosrping260722.user.MyUserSpringTest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<Authorities> getAuthorities(MyUserSpringTest user){
        if(isEmpty(user.getUser()) || isEmpty(user.getPassword())){
            throw  new InvalidCredentials("param is null");
        }
        List<Authorities> array = userRepository.getUserAuthorities(user);
        if(isEmpty(array)){
            throw  new UnauthorizedUser("collection must not be empty");
        }
        return array;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    private boolean isEmpty(List<?> str) {
        return str == null || str.isEmpty();
    }
}
