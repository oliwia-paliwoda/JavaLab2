package przyklad1;

import java.util.List;

public class NameTestOld {

    public static void main(String[] args) {

        System.out.println("\n==== NameTestOld ====");

        List<Person> list1 = Person.createShortList();

        System.out.println("\n=== Print Western Names===");
        for (Person person: list1){
            person.printWesternName();
        }

        System.out.println("\n===Print Eastern Names===");
        for (Person person:list1){
            person.printEasterName();
        }

    }
}
