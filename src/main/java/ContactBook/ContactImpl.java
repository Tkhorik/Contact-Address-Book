package ContactBook;

public class ContactImpl implements Contact {
    private String id;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public ContactImpl(String id, String firstName, String lastName, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void writeObject(Object object) {

    }
}
