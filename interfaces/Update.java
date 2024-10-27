package address_book_system.interfaces;

import address_book_system.entity.User;

import java.util.List;

public interface Update {

    void updateUserById(int i, List<User> u);
    void updateUserByName(String name, List<User> users);
}
