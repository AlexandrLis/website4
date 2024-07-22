package Homework_4.service;

import Homework_4.repository.RepositoryUser;
import Homework_4.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceUser {

    private RepositoryUser repositoryUser;
    private List<User> users = new ArrayList<>();

    @Autowired
    public ServiceUser(RepositoryUser repositoryUser) {
        this.repositoryUser = repositoryUser;
    }

    public List<User> findAllUsers(){
        return repositoryUser.findAllUsers();
    }

    public User findUserById(int id){
        return repositoryUser.findUserById(id);
    }

}
