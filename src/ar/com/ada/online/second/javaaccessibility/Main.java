package ar.com.ada.online.second.javaaccessibility;

import ar.com.ada.online.second.javaaccessibility.access.modifiers.Person;
import ar.com.ada.online.second.javaaccessibility.access.modifiers.User;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person p1 = new Person();
        p1.name = "Almendra";
        p1.lastName = "Polezzeli";
        p1.age = 33;

        p1.showAttributeValues();

        User u1 = new User();


    }
}
