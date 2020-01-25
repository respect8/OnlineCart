package collections.shoppingcart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserUI{
    public UserUI() {
    }

    public void userDetails(){
        String name;                         //to nie powinno tu byc, zrobic klase i  liste ktora bedzie zawierala infoID tak jak w przypadku itemow w carcie w klasie Product
        String surname;
        String email = "";
        String city;
        String street;
        int buildingNumber;
        int flatNumber;
        int phoneNumber;

        Scanner in = new Scanner(System.in);
        System.out.println("Name: ");

        name = in.nextLine();
        System.out.println("Surname: ");
        surname=in.nextLine();

        while(isValidEmailAddress(email)==false){
            System.out.println("email adress: ");
            email = in.nextLine();
        }
        System.out.println("City: ");
        city=in.nextLine();
        System.out.println("Street: ");
        street=in.nextLine();
        System.out.println("building number: ");
        buildingNumber=in.nextInt();
        System.out.println("flat number: ");
        flatNumber=in.nextInt();
        System.out.println("phone number:");
        phoneNumber=in.nextInt();

    }
    public boolean isValidEmailAddress(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }

}
