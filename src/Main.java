import entities.Person;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will you enter? ");
        int n = sc.nextInt();
        sc.nextLine();

        Person[] people = new Person[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Data for person %d:%n", i + 1);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            people[i] = new Person(name, age);
        }

        int maxAge = -1;
        String oldestName = "";

        for (Person p : people) {
            if (p.getAge() > maxAge) {
                maxAge = p.getAge();
                oldestName = p.getName();
            }
        }

        System.out.println("OLDEST PERSON: " + oldestName);

        sc.close();
    }
}