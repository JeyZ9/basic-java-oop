package model;

public class Person {
    private String name;
    private Integer age;
    private Address address;

    public Person(String name, Integer age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" + "\n" +
                "name : " + name + "," + "\n" +
                "age : " + age + "," + "\n" +
                "address : " + address + "\n" +
                "}";
    }
}
