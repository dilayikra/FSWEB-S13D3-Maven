package org.example;

public class Person {
    String firstname;
    String lastName;
    int age;
    // Eklediğimiz 3 extra değişken
    double salary;
    boolean isMarried;
    String job;

    // Temel Constructor
    public Person(String firstname, String lastName, int age) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
    }

    // Overloading & Chaining
    public Person(String firstname, String lastName, int age, double salary, boolean isMarried, String job) {
        this(firstname, lastName, age); // Diğer constructor'ı çağırır
        this.salary = salary;
        this.isMarried = isMarried;
        this.job = job;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}