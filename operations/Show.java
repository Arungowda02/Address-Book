package address_book_system.operations;

import address_book_system.entity.User;
import address_book_system.interfaces.Read;

import java.util.List;

public class Show implements Read {
    @Override
    public void showUserById(int id, List<User> userList) {
        if (id == 0){
            System.out.println("Showing all users data : ");
            for (User u : userList){
                System.out.println(u.toString()+"\n____________________________________");
            }
        }
        else {
            for (User user : userList) {
                if (user.getId() == id) {
                    System.out.println("Showing user detail who having id "+id);
                    System.out.println(user+"\n");
                }
            }
        }
        System.out.println("-------------------------------------------------------------------");

    }
    public void showUserByName(String name,List<User> users){
        for (User user : users){
            if(user.getFirstName().equalsIgnoreCase(name.trim())){
                System.out.println("Showing user detail who having First "+name);
                System.out.println(user+"\n");
            }
        }
    }

}
