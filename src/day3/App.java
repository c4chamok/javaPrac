package day3;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws Exception {
        ArrayList<User> users = new ArrayList<>();

        users.add(new User(101, "Mr. X", "a@b.dm", "hello"));
        users.add(new User(101, "Mr. Y", "b@c.dm", "hello"));
        users.forEach(us -> System.out.println(us.email + " | " + us.name));

        System.out.println(users.get(0).password == users.get(1).password);
        // System.out.println(users);
        // int i, max = n[0], min = n[0];
        // for (i = 0; i < n.length; i++) {
        //     if (max < n[i]) {
        //         max = n[i];
        //     } else if (min > n[i]) {
        //         min = n[i];
        //     }
    }
}
