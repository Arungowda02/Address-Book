package address_book_system.operations;


import address_book_system.entity.User;
import address_book_system.interfaces.Create;

import java.util.InputMismatchException;
import java.util.List;
import java.util.regex.Pattern;

import static address_book_system.operations.CRUD_Operations.sc;
import static address_book_system.operations.CRUD_Operations.users;


public class CreateUser implements Create {

    public boolean checkIdIsPresent(int i, List<User> list) {
        for (User u : list) {
            if (u.getId() == i) {
                return true;
            }
        }
        return false;
    }

    public int enterUserId() {
        int id;

        while (true) {
            System.out.println("Enter the Id (Id must contain numeric value):");
            try {
                id = sc.nextInt();

                if (checkIdIsPresent(id, users)) {
                    System.out.println("Id " + id + " is already present in the address book.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a numeric value.");
                sc.next();
            }
        }
        return id;
    }

    public String enterUserFirstName() {
        String firstName;
        while (true) {
            System.out.println("Enter the User First Name : ");
            firstName = sc.next();
            if (Pattern.matches("^[A-Z][a-z]{2,20}$", firstName)) {
                break;
            } else {
                System.out.println("Invalid format! First name must start with a capital letter and contain 3-20 alphabetic characters. ex: Arun");
            }
        }
        return firstName;

    }

    public String enterUserLastName() {
        String lastName;
        while (true) {
            System.out.println("Enter the User Last Name : ");
            lastName = sc.next();
            if (Pattern.matches("^[A-Z][a-z]{2,20}$", lastName)) {
                break;
            } else {
                System.out.println("Invalid format! Last name must start with a capital letter and contain 3-20 alphabetic characters. ex: Gowda");
            }
        }
        return lastName;

    }

    public String enterUserMobileNumber() {
        String mobileNumber;
        while (true) {
            System.out.println("Enter the User mobile Number : ");
            mobileNumber = sc.next();
            if (Pattern.matches("^[9876][0-9]{9}", mobileNumber)) {
                break;
            } else {
                System.out.println("Invalid MobileNumber! it must start with a 9,8,7,6 any one of this number" +
                        " and contain total 10 digit. ex: 9876543210");
            }
        }
        return "+91 " + mobileNumber;
    }

    public String enterZipCode() {
        String zipCode;
        while (true) {
            System.out.println("Enter the User Zip Code Number : ");
            zipCode = sc.next();
            if (Pattern.matches("[0-9]{6}", zipCode)) {
                break;
            } else {
                System.out.println("Invalid Zip Code! it must contain total 6 digit. ex: 654321");
            }
        }
        return zipCode;
    }

    public String enterUserEmail() {
        String email;
        while (true) {
            System.out.println("Enter the User Email Address : ");
            email = sc.next();
            if (Pattern.matches("^[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z]{2,6}$", email)) {
                break;
            } else {
                System.out.println("Invalid email! Please enter valid format email address. ex: arun02@gmail.com");
            }
        }
        return email;
    }

    public String enterUserAddress() {
        String address;
        while (true) {
            System.out.println("Enter the User Address");

            address = sc.next();
            if (Pattern.matches("^[A-Za-z0-9\\s,.'#-]{1,100}$", address)) {
                break;
            } else {
                System.out.println("Invalid Address! " +
                        "Enter the address starting with capital letter. ex: 4th main road, HSR layout");
            }
        }
        return address;
    }

    public String enterUserCity() {
        String city;
        while (true) {
            System.out.println("Enter the User City");

            city = sc.next();
            if (Pattern.matches("^[A-Z][A-Za-z]{1,20}$", city)) {
                break;
            } else {
                System.out.println("Invalid city format! Enter city name starting with Capital letter. ex: Bangalore");
            }
        }
        return city;
    }

    public String enterUserState() {
        String state;
        while (true) {
            System.out.println("Enter the User State");

            state = sc.next();
            if (Pattern.matches("^[A-Z][A-Za-z]{1,20}$", state)) {
                break;
            } else {
                System.out.println("Invalid state format! Enter state name starting with Capital letter. ex: Karnataka ");
            }
        }
        return state;
    }

    public User saveUser() {

        int id = enterUserId();
        String firstName = enterUserFirstName();
        String lastName = enterUserLastName();
        String mobileNumber = enterUserMobileNumber();
        String address = enterUserAddress();
        String city = enterUserCity();
        String state = enterUserState();
        String zipCode = enterZipCode();
        String email = enterUserEmail();

        System.out.println("\nHey " + firstName + " " + lastName + " Your data has been successfully added to the address book.\n");
        return new User(id, firstName, mobileNumber, lastName, address, city, state, email, zipCode);
    }
}

