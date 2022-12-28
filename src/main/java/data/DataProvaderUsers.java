package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataProvaderUsers {
    private static List<User> usersList=new ArrayList<>();

    static {
        usersList.add(new User());

    }

    public static User getValidUser() {
        return new User("Elena", "Ivanova", "kdkjdjd", "78996556", "Female");
    }

    public static User getRandomUser() {
        return usersList.get(new Random().nextInt(usersList.size() - 1));
    }
}
