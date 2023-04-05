package przyklad1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Person {

    private String givenName;
    private String surName;
    private int age;
    private Gender gender;
    private String eMail;
    private String phone;
    private String address;

    public static class Builder {

        private String givenName = "";

        private String surName = "";

        private int age = 0;

        private Gender gender = Gender.FEMALE;

        private String eMail = "";

        private String phone = "";
        private String address = "";


        public Person.Builder givenName(String givenName) {
            this.givenName = givenName;
            return this;
        }

        public Person.Builder surName(String surName) {
            this.surName = surName;
            return this;
        }

        public Person.Builder age(int val) {
            age = val;
            return this;
        }

        public Person.Builder gender(Gender val) {
            gender = val;
            return this;
        }

        public Person.Builder eMail(String val) {
            eMail = val;
            return this;
        }

        public Person.Builder phone(String val) {
            phone = val;
            return this;
        }

        public Person.Builder address(String val) {
            address = val;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    public Person build(){
        return new Person(this);
    }

    private Person(Person person) {
        super();
    }

    private Person(Person.Builder builder) {
        givenName = builder.givenName;
        surName = builder.surName;
        age = builder.age;
        gender = builder.gender;
        eMail = builder.eMail;
        phone = builder.phone;
        address = builder.address;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender(){
        return gender;
    }

    public String geteMail(){
        return eMail;
    }

    public String getPhone(){
        return phone;
    }

    public String getAddress(){
        return address;
    }

    public void print() {
        System.out.println(
                "\nName: " + givenName + " " + surName + "\n" +
                        "Age: " + age + "\n" +
                        "Gender: " + gender + "\n" +
                        "eMail: " + eMail + "\n" +
                        "Phone: " + phone + "\n" +
                        "Address: " + address + "\n"
        );
    }

    public void printName() {
        System.out.println(
                "Name: " + givenName + " " + surName
        );

    }

    @Override
    public String toString() {
        return "Name: " + givenName + " " + surName + "\n" + "Age: " + age + " Gender: " + gender + "\n" + "eMail: " + eMail + "\n" + "Address: " + address + "\n";
    }

    public static List<Person> createShortList(){
        List<Person> people = new ArrayList<>();

        people.add(
                new Person.Builder()
                        .givenName("Li")
                        .surName("Forrest")
                        .age(21)
                        .gender(Gender.FEMALE)
                        .eMail("li.forrest.baker@example.com")
                        .phone("201-121-4678")
                        .address("44 4th St, Smallville, KS 12333")
                        .build()
        );

        people.add(
                new Person.Builder()
                        .givenName("Hubert")
                        .surName("Burda")
                        .age(25)
                        .gender(Gender.MALE)
                        .eMail("hubert.burda@example.com")
                        .phone("202-121-4678")
                        .address("33 3rd St, Smallville, KS 12333")
                        .build()
        );

        people.add(
                new Person.Builder()
                        .givenName("Gsang")
                        .surName("Ye")
                        .age(25)
                        .gender(Gender.MALE)
                        .eMail("ye.gang.doe@example.com")
                        .phone("202-123-4678")
                        .address("33 3rd St, Smallville, KS 12333")
                        .build()
        );

        people.add(
                new Person.Builder()
                        .givenName("Phil")
                        .surName("Smith")
                        .age(55)
                        .gender(Gender.MALE)
                        .eMail("phil.smith@example.com")
                        .phone("222-33-1234")
                        .address("22 2nd St, New Park, CO 222333")
                        .build()
        );

        people.add(
                new Builder()
                        .givenName("Warren")
                        .surName("Buffet")
                        .age(85)
                        .gender(Gender.FEMALE)
                        .eMail("warren.buffett@example.com")
                        .phone("211-33-1234")
                        .address("22 4th St, New Park, CO 222333")
                        .build()
        );

        return people;

    }

    //printCustom(){};
    //PrintEasterStyle(){};
    //PrintWesternStyle();



}
