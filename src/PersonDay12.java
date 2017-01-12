import java.util.Scanner;

/*
 * Created by Артем on 12.01.2017.
 */
class PersonDay12 {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    PersonDay12(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}

class Student extends PersonDay12{
    private int[] testScores;

    Student(String firstName, String lastName, int id, int[] testScores)
    {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }

    char calculate()
    {
        int sum = 0;

        for (int s : testScores)
            sum += s;

        if (sum/testScores.length >= 90)
            return 'O';
        else if (sum/testScores.length >= 80)
            return 'E';
        else if (sum/testScores.length >= 70)
            return 'A';
        else if (sum/testScores.length >= 55)
            return 'P';
        else if (sum/testScores.length >= 40)
            return 'D';
        else
            return 'T';

    }

}

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
