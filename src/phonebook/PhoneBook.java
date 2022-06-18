package phonebook;

public class PhoneBook {
    private final Contact[] contacts;
    private int size;
    public PhoneBook() {                                          // конструктор сборки телефонной книги экземпляра класа PhoneBook()
        this.contacts = new Contact[10];                          // идет предача массива из десяти экземпляров класса Contact
    }
    public void addContact(String contactId, String phoneNumber) {// метод передачи экземплятров класса Contact в
        if (size >= contacts.length) {                            // если массив меньше равен 0 то
            System.out.println("Phone book is full. Adding a new contact is restricted.");
        } else{
        Contact newContact = new Contact(contactId, phoneNumber); // создаем экземпляр класса Contact
        contacts[size++] = newContact;    }                        // передаем экземпляр класса Contact в ячейку массива под индексом size
    }
    public void removeContact(String contactId) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].getId().equals(contactId)) {
                contacts[i] = null;
                if (i != contacts.length - 1) {
                    System.arraycopy(contacts, i + 1, contacts, i, size - i);
// Этот метод сдвигает массив влево на одну ячейку, затирая ячейку под номером i путем смещения всех элементов справа на одну ячейку влево
                }
                size--;
                System.out.println("Contact " + contactId + " is removed.");
                return;
            }
        }
        System.out.println("Contact " + contactId + " is not found.");
    }
    public void findContact(String contactId) {
        for (int i = 0; i < size; i++) {
            Contact contact = contacts[i];
            if (contact.getId().equals(contactId)) {
                System.out.println(contact.getId() + ": " + contact.getPhoneNumber());
                return;
            }
        }
        System.out.println("Contact " + contactId + " is not found.");
    }
    public void printAllContacts() {
        for (int i = 0; i < size; i++) {
            Contact contact = contacts[i];
            System.out.println(contact.getId() + ": " + contact.getPhoneNumber());
        }
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        return super.equals(other);
    }

    public int getCurrentSize() {
        return size;
    }

}
