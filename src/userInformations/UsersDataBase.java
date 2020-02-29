package userInformations;

import java.util.*;

public class UsersDataBase {
    Scanner in = new Scanner(System.in);
    private final List<User> userList = new LinkedList<>();

    public void addUser(User userInfo) {
        userList.add(userInfo);
    }

    public void removeUserInfo(User userInfo) {
        userList.remove(Objects.requireNonNull(userInfo));
    }

    public void showUserInfo(User userInfo) {
    }


    public boolean isValidEmailAddress(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }

}
