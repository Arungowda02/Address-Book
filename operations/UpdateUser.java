package address_book_system.operations;


import address_book_system.entity.User;
import address_book_system.interfaces.Update;

import java.util.List;



import static address_book_system.operations.CRUD_Operations.saveUser;

public class UpdateUser implements Update {

    @Override
    public void updateUserById(int id, List<User> users) {
        boolean userFound = false;
        for (User user : users) {
            if (id == user.getId()) {

                String firstName = saveUser.enterUserFirstName();
                String lastName = saveUser.enterUserLastName();
                String mobileNumber = saveUser.enterUserMobileNumber();
                String address = saveUser.enterUserAddress();
                String city = saveUser.enterUserCity();
                String state = saveUser.enterUserState();
                String zipcode = saveUser.enterZipCode();
                String email = saveUser.enterUserEmail();


                user.setFirstName(firstName);
                user.setLastName(lastName);
                user.setMobileNumber(mobileNumber);
                user.setAddress(address);
                user.setCity(city);
                user.setState(state);
                user.setEmail(email);
                user.setZipcode(zipcode);
                System.out.println("\nHey " + firstName + " " + lastName + " Your data has been successfully updated in the address book.");

                userFound = true;
                break;
            }
        }
        if (!userFound) {
            System.out.println("No user found with ID: " + id);
        }
    }

    @Override
    public void updateUserByName(String name, List<User> users) {

        boolean userFound = false;
        for (User user : users) {
            if (name.trim().equalsIgnoreCase(user.getFirstName())) {

                String firstName = saveUser.enterUserFirstName();
                String lastName = saveUser.enterUserLastName();
                String mobileNumber = saveUser.enterUserMobileNumber();
                String address = saveUser.enterUserAddress();
                String city = saveUser.enterUserCity();
                String state = saveUser.enterUserState();
                String zipcode = saveUser.enterZipCode();
                String email = saveUser.enterUserEmail();


                user.setFirstName(firstName);
                user.setLastName(lastName);
                user.setMobileNumber(mobileNumber);
                user.setAddress(address);
                user.setCity(city);
                user.setState(state);
                user.setEmail(email);
                user.setZipcode(zipcode);
                System.out.println("\nHey " + firstName + " " + lastName + " Your data has been successfully updated in the address book.");

                userFound = true;
                break;
            }
        }
        if (!userFound) {
            System.out.println("No user found with FirstName: " + name);
        }

    }


}
