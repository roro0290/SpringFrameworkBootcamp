package com.example.practice.debug;

public class Message {
    public static String getMessage(String language){
        if(language.equals("p")){
            return "hola mundo";
        } else if(language.equals("fr")){
            return "Bonjour le monde";
        } else{
            return "Hello World";
        }
    }
}
