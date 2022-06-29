package Exam.Part3.Person;

public class Person {

    public Person(String s1, int age) {

    }

    public static void main(String[] args) {
        String s1 = "Van Darkholme";
        int age = 48;
        PersonFunc p1 = new PersonFunc();
        PersonFunc p2 = new PersonFunc();
        p1.move();
        p2.talk();
    }
}