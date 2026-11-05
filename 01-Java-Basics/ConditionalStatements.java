public class ConditionalStatements {

    public static void main(String[] args) {

        int age = 18;
        int marks = 85;

        
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

        
        if (marks >= 90) {
            System.out.println("Grade A");
        } 
        else if (marks >= 75) {
            System.out.println("Grade B");
        } 
        else if (marks >= 50) {
            System.out.println("Grade C");
        } 
        else {
            System.out.println("Fail");
        }

      
        if (age >= 18) {
            if (marks >= 50) {
                System.out.println("Eligible for admission");
            }
        }
    }
}
