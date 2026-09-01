package com.example.my_maven_project;
import com.google.gson.Gson;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Gson gson = new Gson();

        String json = gson.toJson("Hello Maven");

        System.out.println(json);
    }
}
