import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }
    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName())>=0) {
            System.out.println("Contact already exists");
            return false;
        }
        this.myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int findPosition = findContact(oldContact.getName());
        if(findPosition>=0) {
            this.myContacts.set(findPosition, newContact);
            return true;
        }
        System.out.println("Contact doesn't exist");
        return false;
    }

    public boolean removeContact(Contact contact) {
        int findPosition = findContact(contact.getName());
        if(findPosition>=0) {
            this.myContacts.remove(contact);
            return true;
        }
        return false;
    }
    private int findContact(String name) {
        for(int i=0;i<myContacts.size();i++) {
            Contact contact = myContacts.get(i);
            if(name.equals(contact.getName())) {
                return i;
            }
        }
        return -1;
    }
    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    public Contact queryContact(String name) {
        if(findContact(name)>=0) {
            return this.myContacts.get(findContact(name));
        }
        return null;
    }
    public void printContacts() {
        for(int i=0;i<this.myContacts.size();i++) {
            Contact contact = this.myContacts.get(i);
            System.out.println(i+1 + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}
