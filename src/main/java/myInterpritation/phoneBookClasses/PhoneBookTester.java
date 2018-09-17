package myInterpritation.phoneBookClasses;

import java.util.Scanner;

public class PhoneBookTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        PhoneBook pb = new PhoneBook();

        System.out.println("Enter last name: ");
        String lastNameEntry = scan.nextLine();

        System.out.println("Enter first name: ");
        String firstNameEntry = scan.nextLine();

        PhoneEntry entry = pb.search(lastNameEntry, firstNameEntry);

        if (entry != null)
            System.out.println(entry.lastName + ", " + entry.firstName + ": " + entry.phone);
        else
            System.out.println("Name not found");

        System.out.println("Enter last name: ");
        lastNameEntry = scan.nextLine();

        System.out.println("Enter first name: ");
        firstNameEntry = scan.nextLine();

        entry = pb.search(lastNameEntry, firstNameEntry);
    }
}