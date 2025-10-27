package com.queias.passwordManager.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    @Setter(AccessLevel.NONE)
    private int id;
    private String name;
    private String email;
    private String login;
    private String password;

    public User(String name, String email, String login, String password) {
        this.name = name;
        this.email = email;
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString(){
        return String.format(
                "Id: %d\nname: %s\nEmail: %s\nLogin: %s\nPassword: %s\n",
                id, name, email, login, password
        );
    }
}
