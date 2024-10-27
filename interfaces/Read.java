package address_book_system.interfaces;

import address_book_system.entity.User;

import java.util.List;

public interface Read {
    void showUserById(int id, List<User> userList);
    void showUserByName(String name,List<User> users);
}
