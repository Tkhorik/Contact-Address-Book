package impl;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ContactRepositoryImpl contactRepository = new ContactRepositoryImpl(new ArrayList<>());
        contactRepository.save(new Contact("lastname", "firstname"));
        contactRepository.save(new Contact("lastname2", "firstname2"));
        contactRepository.save(new Contact("lastName", "firstName", "address", "phoneNumber", "12345678"));
        contactRepository.findAll().forEach(System.out::println);
    }
}
