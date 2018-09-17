package realization;

import myInterpritation.Repositry;

import java.util.List;

public class ContactRepository implements Repositry<Contact> {
    @Override
    public List<Contact> findAll() {
        return null;
    }

    @Override
    public Contact save(Contact contact) {
        return null;
    }

    @Override
    public Contact findById(int id) {
        return null;
    }

    @Override
    public void delete(Contact contact) {

    }
}
