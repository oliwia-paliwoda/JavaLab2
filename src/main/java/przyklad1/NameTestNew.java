package przyklad1;

import java.util.List;
import java.util.function.Function;

public class NameTestNew {
    public static void main(String[] args){
        System.out.println("\n==== NameTestNew ====");
        List<Person> list1 = Person.createShortList();
        System.out.println("===Custom List===");
        for(Person person:list1){
            System.out.println(
                 person.printCustom(p -> "Name: " +p.getGivenName() + "eMail: " + p.geteMail())
            );
        }

        Function<Person, String> westernStyle = p -> {
            return "\nName: " + p.getGivenName() + " " + p.getSurName() + "\n" +
                    "Age: " + p.getAge() + " Gender: " + p.getGender() + "\n" +
                    "Email: " + p.geteMail() + "\n" +
                    "Phone: " + p.getPhone() + "\n" +
                    "Address: " + p.getAddress();

        };

        Function<Person, String> easternStyle = p -> {
            return "\nName: " + p.getSurName() + " " + p.getGivenName() + "\n" +
                    "Age: " + p.getAge() + " Gender: " + p.getGender() + "\n" +
                    "Email: " + p.geteMail()+ "\n" +
                    "Phone: " + p.getPhone() + "\n" +
                    "Address: " + p.getAddress();
        };

         System.out.println("\n=== Western List===");
         for (Person person: list1){
             person.printCustom(westernStyle);

    }
         System.out.println("\n===Eastern List===");
         for (Person person: list1){
             person.printCustom(easternStyle);
         }
    }

}
