package api.servlet;

import api.model.User;

public class UserModel {

    public User getUser() {
        return new User(1, "Karthik", "karthik@example.com");
    }
}
