package phonebook;

import java.util.Objects;

public class Contact {
    private final String id;                        // не изменяемая переменная Фамилия Имя
    private String phoneNumber;
    public Contact(String id, String phoneNumber) { // конструктор объекта с номером и телефоном
        this.id = id;
        this.phoneNumber = phoneNumber;
    }
    public String getId() {
        return id;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //++++++++++++++++++++++++++++++++++++++++

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return id + ": " + phoneNumber;
        }

    @Override
    public boolean equals(Object other) {

        if (this.getClass() != other.getClass()) {
            return false;
        }
        Contact c2 = (Contact) other;
        return id.equals(c2.id);
    }

    }
