package Homework_4;

import Homework_4.repository.RepositoryUser;
import Homework_4.service.ServiceUser;
import Homework_4.users.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Homework4Application {

	public static void main(String[] args) {

		SpringApplication.run(Homework4Application.class, args);

		User user = new User();
		user.setId(10);
		user.setFirstName("Николай");
		user.setLastName("Степанов");

		RepositoryUser repositoryUser = new RepositoryUser();
		repositoryUser.addUser(user);
		System.out.println(repositoryUser.findAllUsers());

		ServiceUser serviceUser = new ServiceUser(repositoryUser);
		User user1 = serviceUser.findUserById(10);
		System.out.println(user1);

	}

}
