package myInterpritation.phoneBookClasses;

public class PhoneBook {
    PhoneEntry[] phoneBook;

    PhoneBook() {
        phoneBook = new PhoneEntry[5];
        phoneBook[0] = new PhoneEntry(
                "Smith", "John", "(418)665-1223");
        phoneBook[1] = new PhoneEntry(
                "Smith", "Grace", "(860)399-3044");
        phoneBook[2] = new PhoneEntry(
                "Delgado", "David", "(815)439-9271");
        phoneBook[3] = new PhoneEntry(
                "Delgado", "Jesse", "(312)223-1937");
        phoneBook[4] = new PhoneEntry(
                "Soong", "Connie", "(913)883-2874");
    }


    PhoneEntry search(String targetLastName, String targetFirstName) {
        for (int j = 0; j < phoneBook.length; j++) {
            if (phoneBook[j].firstName.equals(targetFirstName) || phoneBook[j].lastName.equals(targetLastName))
                return phoneBook[j];
        }
        return null;
    }

}