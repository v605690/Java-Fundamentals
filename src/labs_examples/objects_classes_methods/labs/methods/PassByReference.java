package labs_examples.objects_classes_methods.labs.methods;

import videos_source_code.classes.Person;

public class PassByReference {
   public static void changePerson(Person person) {
       person.name = "Tom";
       person.age = 56;
       System.out.println("Inside method: " + person.name + ", age " + person.age);
   }

    public static void main(String[] args) {
        Person newPerson = new Person("Larry", 30);
        System.out.println("Before method: " + newPerson.name + ", age " + newPerson.age);
        changePerson(newPerson);
        System.out.println("After method: " + newPerson.name + ", age " + newPerson.age);
    }
}
