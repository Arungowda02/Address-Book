package address_book_system.operations;

import address_book_system.database.UserDatabase;
import address_book_system.entity.User;
import address_book_system.interfaces.Create;
import address_book_system.interfaces.Delete;
import address_book_system.interfaces.Read;
import address_book_system.interfaces.Update;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;


public class CRUD_Operations {

    public static Create saveUser = new CreateUser();
    public static Update updateUser = new UpdateUser();
    public static UserDatabase userDatabase = new UserDatabase();
    public static List<User> users = userDatabase.userData();
    public static Delete deleteUser = new DeleteUser();
    public static Read show = new Show();
    public static Scanner sc = new Scanner(System.in);

    public static int printWelcomeMessage() {
        System.out.println("\nWhich one would you like to do?" +
                "\n1. Add User\n2. Show User details\n3. Update User details" +
                "\n4. Delete User\n( enter related number only)");
        return sc.nextInt();
    }

    public static void crudOperation(int i) {

        //adding users
        if (i == 1) {
            users.add(saveUser.saveUser());
            crudOperation(printWelcomeMessage());
        }

        //updating users
        if (i == 3) {
            System.out.println("Enter the user id or name");
            String idOrName = sc.next();

            if (Pattern.matches("[A-Za-z]+", idOrName)) {
                System.out.println("Your old data is ");
                show.showUserByName(idOrName,users);
                System.out.println("Update your data");
                updateUser.updateUserByName(idOrName, users);
            } else if (Pattern.matches("\\d+", idOrName)) {
                int id = Integer.parseInt(idOrName);
                System.out.println("Your old data is ");
                show.showUserById(id, users);
                System.out.println("Update your data");
                updateUser.updateUserById(id, users);
            }


            int i1 = printWelcomeMessage();
            crudOperation(i1);

        }

        //delete user
        if (i == 4) {
            System.out.println("Enter the user id or name");
            String idOrName = sc.next();
            if (Pattern.matches("[A-Za-z]+", idOrName)) {
                deleteUser.deleteUserByName(idOrName,users);
            } else if (Pattern.matches("\\d+", idOrName)) {
                int id = Integer.parseInt(idOrName);
                deleteUser.deleteUserById(id,users);
            }

            int i1 = printWelcomeMessage();
            crudOperation(i1);

        }


        //showing user data
        if (i == 2) {
            System.out.println("Enter the user id or name (press 0 for showing all user details) ");
            String idOrName = sc.next();

            if (Pattern.matches("[A-Za-z]+", idOrName)) {
                show.showUserByName(idOrName, users);
            } else if (Pattern.matches("\\d+", idOrName)) {
                int id = Integer.parseInt(idOrName);
                show.showUserById(id, users);
            }

            int i1 = printWelcomeMessage();
            crudOperation(i1);
        }

    }
}
