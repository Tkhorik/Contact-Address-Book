package ContactBook;

public interface ContactsManager {

    void createNewContact(String firstName, String lastName, String phoneNumber);

    void updateMyContact(String firstName, String lastName, String phoneNumber);

    void exportMyContact(String fileFormat,
                         String firstName, String lastName, String phoneNumber);

    void loadMyContact(String format, String fileName);
}
