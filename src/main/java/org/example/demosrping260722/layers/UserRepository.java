package org.example.demosrping260722.layers;

import org.example.demosrping260722.enumDir.Authorities;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserRepository {
    Map<String,String> map = Map.of("user1","password1","user2","password2");

    public List<Authorities> getUserAuthorities(String user, String password){
        if(map.containsKey(user) && map.get(user).equals(password)){
            return Arrays.asList(Authorities.READ,Authorities.DELETE,Authorities.WRITE);
        }else{
            return Collections.EMPTY_LIST;
        }
    }
}
