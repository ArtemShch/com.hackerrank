package Day12Inheritance;


public class Student extends Person {
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
