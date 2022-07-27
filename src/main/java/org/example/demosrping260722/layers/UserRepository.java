package org.example.demosrping260722.layers;

import org.example.demosrping260722.enumDir.Authorities;
import org.example.demosrping260722.user.MyUserSpringTest;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserRepository {
    Map<String, MyUserSpringTest> map = Map.of("user1@yandex.ru",new MyUserSpringTest("user1@yandex.ru",
                    "password1"), "user2@yandex.ru",new MyUserSpringTest("user2@yandex.ru","password2"));

    public List<Authorities> getUserAuthorities(MyUserSpringTest user){
        if(map.containsKey(user.getUser()) && map.get(user.getUser()).getPassword().equals(user.getPassword())){
            return Arrays.asList(Authorities.READ,Authorities.DELETE,Authorities.WRITE);
        }else{
            return Collections.EMPTY_LIST;
        }
    }
}
