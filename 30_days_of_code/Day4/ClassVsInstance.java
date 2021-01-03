import java.io.*;
import java.util.*;
/*
 * Create a class Person with an instance variable called age,
 * a constructor which receives an initialAge and initialises the age variable,
 * a method amIOld which says "You are young." is your age is lower than 13, 
 * "You are teenager" is your age is between 13 included and 18 and "You are old." if your age is geater than 18 included,
 * another function called yearPasses which increments the age by one.
 * Constraints: 
 */ 
public class ClassVsInstance {
    public static class Person {
        private int age;  // class variable
      
        public Person(int initialAge) {
              // Add some more code to run some checks on initialAge, constructor
            if (initialAge < 0) {  // Constraint initialAge is negative
                System.out.println("Age is not valid, setting age to 0.");  // Advice of age changed
            } else {
                this.age = initialAge;
            }
        }
    
        public void amIOld() {
              // Write code determining if this person's age is old and print the correct statement:
           if (this.age < 13) {  // age is lower than 13
                System.out.println("You are young.");
           } else {
               if (18 <= this.age) {  // age is greater or equal than 18
                   System.out.println("You are old.");
               } else {  // Other cases: if age is between 13 included and 18
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
        int T = sc.nextInt();  // Number of ages which will be read
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();  // Reads new age
            Person p = new Person(age);  // Calls constructor
            p.amIOld();  // Calls amIOld method
            for (int j = 0; j < 3; j++) {  // 3 year passes
                p.yearPasses();  // Calls yearPasses
            }
            p.amIOld();
            System.out.println();  // New line
        }
        sc.close();
    }
}