package address_book_system.interfaces;

import address_book_system.entity.User;

import java.util.List;

public interface Delete {
    void deleteUserById(int id, List<User> users);
    void deleteUserByName(String name, List<User> users);
}
