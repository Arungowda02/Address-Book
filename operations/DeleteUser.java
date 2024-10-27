package address_book_system.operations;

import address_book_system.entity.User;
import address_book_system.interfaces.Delete;

import java.util.Iterator;
import java.util.List;

public class DeleteUser implements Delete {

    @Override
    public void deleteUserById(int id, List<User> users) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User u = iterator.next();
            if (u.getId() == id) {
                iterator.remove();
                System.out.println("User with id " + id + " is deleted from the address book.");
                return;
            }
        }
        System.out.println("User with id " + id + " not found.");

    }

    @Override
    public void deleteUserByName(String name, List<User> users) {

        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User u = iterator.next();
            if (u.getFirstName().equalsIgnoreCase(name.trim())) {
                iterator.remove();
                System.out.println("User with FirstName " + name + " is deleted from the address book.");
                return;
            }
        }
        System.out.println("User with id " + name + " not found.");

    }
}
