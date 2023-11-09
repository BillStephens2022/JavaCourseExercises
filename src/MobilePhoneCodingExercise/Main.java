package MobilePhoneCodingExercise;

public class Main {
    public static void main(String[] args) {
        MobilePhone myMobile = new MobilePhone("5556667777");
        Contact contact1 = new Contact("John", "5551112222");
        myMobile.addNewContact(contact1);
        Contact contact2 = new Contact("Sarah", "5552223333");
        myMobile.addNewContact(contact2);
        Contact contact3 = new Contact("Sarah", "5552223333");
        myMobile.addNewContact(contact3);
        myMobile.printContacts();
    }
}
