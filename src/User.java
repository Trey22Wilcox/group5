import java.util.Scanner;
public class User {
    private int UserID = 1000;
    private String username;
    private String passwordHash;
    private String email;
    private String address;
    private String phoneNumber;
    Scanner sc = new Scanner(System.in);

    public void register(){
        UserID++;
        System.out.println("Enter a username: ");
        username = sc.nextLine();
        System.out.println("Enter a password: ");
        passwordHash = sc.nextLine();
        System.out.println("");
    }

    public void login(){

    }

    public void updateProfile(){

    }

    public void logout(){

    }
}
