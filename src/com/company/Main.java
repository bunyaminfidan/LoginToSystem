package com.company;

import com.company.business.abstracts.UserService;
import com.company.business.concretes.UserManager;
import com.company.dataAccess.concretes.UserDaoHibernate;
import com.company.entitties.concretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        User user = new User(1, "Bunyamin", "FIDAN", "bunyamnfdan@gmail.com", "111111");

        UserService userService = new UserManager(new UserDaoHibernate());
        userService.add(user);
    }
}
