package com.instaclustr.jfleming;

/**
 * Dev week 2021 - Library Project
 * @author - Jackson Fleming (jackson.fleming@instaclustr.com)
 * @version 0.0.1
 * @since - 2021-08-24
 */
public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public boolean isStringEmptyOrNull(String input){
        return input == null || input.isEmpty();
    }

    public String greetUser(String username){
        return "Hi there, " + username;
    }
}
