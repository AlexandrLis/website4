package Homework_4.repository;

import Homework_4.users.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RepositoryUser {

    private List<User> users = new ArrayList<>();


    public List<User> findAllUsers(){


        return List.copyOf(users);
    }

    public User findUserById(int id){
        for (User user : users) {
            return user;
        }
        return null;
    }


    public void addUser(User user){
        users.add(user);
    }


}
