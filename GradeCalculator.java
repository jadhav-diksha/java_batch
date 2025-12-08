
class InvalidMarksException extends Exception {

    InvalidMarksException(String msg) {
        super(msg);
    }
}

public class GradeCalculator {

    public static void main(String args[]) {

        try {
            int m1 = 82;
            int m2 = 90;
            int m3 = 76;

            if (m1 < 0 || m1 > 100) throw new InvalidMarksException("Invalid Marks!");
            if (m2 < 0 || m2 > 100) throw new InvalidMarksException("Invalid Marks!");
            if (m3 < 0 || m3 > 100) throw new InvalidMarksException("Invalid Marks!");

            double avg = (m1 + m2 + m3) / 3.0;

            char grade;
            if (avg >= 90) grade = 'A';
            else if (avg >= 75) grade = 'B';
            else if (avg >= 60) grade = 'C';
            else if (avg >= 40) grade = 'D';
            else grade = 'F';

            System.out.println("Average: " + String.format("%.2f", avg));

            System.out.println("Grade: " + grade);

        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }
}
