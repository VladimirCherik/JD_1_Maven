package org.example;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class App {
    public static void main( String[] args ) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonFinally = gson.toJson(new User("Volodymyr", "Cherednichenko"));
        System.out.println(jsonFinally);

    }

    static class User{
        String name;
        String lastName;

        public User (String name, String lastName ){
            this.name = name;
            this.lastName = lastName;
        }
    }
}
