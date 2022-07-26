package org.example.demosrping260722.layers;

import org.example.demosrping260722.enumDir.Authorities;
import org.example.demosrping260722.exceprion.InvalidCredentials;
import org.example.demosrping260722.exceprion.UnauthorizedUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<Authorities> getAuthorities(String user,String password){
        if(isEmpty(user) || isEmpty(password)){
            throw new InvalidCredentials("params must not be empty");
        }
        List<Authorities> array = userRepository.getUserAuthorities(user,password);
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
