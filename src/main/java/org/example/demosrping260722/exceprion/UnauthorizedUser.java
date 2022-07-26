package org.example.demosrping260722.exceprion;

public class UnauthorizedUser extends RuntimeException{
    public UnauthorizedUser(String str){
        super(str);
    }
}
