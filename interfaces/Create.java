package address_book_system.interfaces;

import address_book_system.entity.User;

public interface Create {
    String enterUserState();
    String enterUserCity();
    String enterUserAddress();
    String enterUserEmail();
    String enterZipCode();
    String enterUserMobileNumber();
    String enterUserLastName();
    String enterUserFirstName();
    int enterUserId();
    User saveUser();
}
