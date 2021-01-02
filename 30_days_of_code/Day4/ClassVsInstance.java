import java.io.*;
import java.util.*;
/*
 * Create a class Person with an instance variable called age,
 * a constructor which receives an initialAge and initialises the age variable,
 * a method amIOld which says "You are young." is your age is lower than 13, 
 * "You are teenager" is your age is between 13 included and 18 and "You are old." if your age is geater than 18 included,
 * another
 */ 
public class ClassVsInstance {
    public static class Person {
        private int age;  // class variable
      
        public Person(int initialAge) {
              // Add some more code to run some checks on initialAge, constructor
            if (initialAge < 0) {  // constraint initialAge is negative
                System.out.println("Age is not valid, setting age to 0.");
            } else {
                this.age = initialAge;
            }
        }
    
        public void amIOld() {
              // Write code determining if this person's age is old and print the correct statement:
           if (this.age < 13) {
                System.out.println("You are young.");
           } else {
               if (18 <= this.age) {
                   System.out.println("You are old.");
               } else {
                   System.out.println("You are a teenager.");
               }
           }
        }
    
        public void yearPasses() {
              // Increment this person's age.
            this.age++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}