package MobilePhoneCodingExercise;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {

        if (findContact(contact.getName()) >= 0) {
            System.out.println("already contains contact!");
            return false;
        };

        System.out.println("does not contain contact!");
        this.myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {

        int index = this.myContacts.indexOf(oldContact);
        // if contact not found (i.e. index < 0), return false
        if (index < 0) {
            return false;
        }
        // replace with newContact info at same index as found above
        this.myContacts.set(index, newContact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        // find the index of the contact that you want to remove
        int index = this.myContacts.indexOf(contact);
        // if contact not found (i.e. index < 0), return false
        if (index < 0) {
            return false;
        }
        this.myContacts.remove(index);
        return true;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            if (this.myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int index = findContact(name);
        return index < 0 ? null : myContacts.get(index);
    }

    public void printContacts() {
        System.out.println("Contact List:");

        for(int i = 0; i < myContacts.size(); i++) {
            System.out.println((i + 1) + ". " +
                    this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getPhoneNumber());
        }
    }
}
