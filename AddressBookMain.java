package address_book_system;


import static address_book_system.operations.CRUD_Operations.crudOperation;
import static address_book_system.operations.CRUD_Operations.printWelcomeMessage;


public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("\nWel-Come to ADDRESS BOOK....");

        int i = printWelcomeMessage();
        crudOperation(i);
    }
}
