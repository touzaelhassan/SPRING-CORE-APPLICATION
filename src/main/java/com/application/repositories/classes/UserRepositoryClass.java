package com.application.repositories.classes;

import com.application.repositories.interfaces.UserRepositoryInterface;

public class UserRepositoryClass implements UserRepositoryInterface {

    @Override
    public String getUser() { return "User From The Repository Bean"; }

}
