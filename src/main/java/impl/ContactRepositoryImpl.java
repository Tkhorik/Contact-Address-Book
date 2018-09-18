package impl;

import myInterpritation.Repositry;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContactRepositoryImpl implements Repositry<Contact> {

    private List<Contact> phoneList;
    private Set<Integer> indexs = new HashSet<>();

    ContactRepositoryImpl(List<Contact> phoneList) {
        this.phoneList = phoneList;
    }

    @Override
    public List<Contact> findAll() {
        return phoneList;
    }

    @Override
    public Contact save(Contact contact) {
        int i = 0;
        while (!indexs.isEmpty() && indexs.contains(++i)){
            i++;   //todo: index does not incrementa\
            indexs.add(i);
        }
        contact.setId(String.valueOf(i));
        if (phoneList.add(contact)) {
            indexs.add(i);
            return contact;
        } else {
            throw new RuntimeException("Не удалось добавить элемент");
        }
    }

    @Override
    public Contact findById(String id) {
        for (Contact contact : phoneList) {
            if (contact.getId().equals(id))
                return contact;
        }
        return null;
    }

    @Override
    public void delete(Contact contact) {
        if (phoneList.remove(contact)) {
            indexs.remove(contact.getId());
        }else {
            throw new RuntimeException("Нет такого контакта " + contact);

        }
    }
}