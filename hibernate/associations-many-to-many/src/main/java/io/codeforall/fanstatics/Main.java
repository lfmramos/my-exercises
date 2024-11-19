package io.codeforall.fanstatics;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        // Persist users and groups
        userService.persistUsersAndGroups();

        // Fetch users and groups
        userService.fetchUsersAndGroups();

        // Close the service
        userService.close();
    }
}