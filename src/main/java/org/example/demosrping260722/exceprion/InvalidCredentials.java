package org.example.demosrping260722.exceprion;

public class InvalidCredentials extends RuntimeException{
    public InvalidCredentials(String str){
        super(str);
    }
}
