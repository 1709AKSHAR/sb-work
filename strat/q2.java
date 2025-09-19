package strat;

public class q2 {
    public static void main(String[] args) {
        int maths = 59, english = 91, physics = 85, hindi = 75;
        String grade;

        if (maths >= 90) {
            grade = "A";
        } else if (maths >= 80) {
            grade = "B";
        } else if (maths >= 70) {
            grade = "C";
        } else if (maths >= 60) {
            grade = "D";
        } else {
            grade = "Fail";
        }
        System.out.println("Maths:" +grade);
        if (english >= 90) {
            grade = "A";
        } else if (english >= 80) {
            grade = "B";
        } else if (english >= 70) {
            grade = "C";
        } else if (english >= 60) {
            grade = "D";
        } else {
            grade = "Fail";
        }
        System.out.println("English:" +grade);
        if (physics >= 90) {
            grade = "A";
        } else if (physics >= 80) {
            grade = "B";
        } else if (physics >= 70) {
            grade = "C";
        } else if (physics >= 60) {
            grade = "D";
        } else {
            grade = "Fail";
        }
        System.out.println("Physics:" +grade);
        if (hindi >= 90) {
            grade = "A";
        } else if (hindi >= 80) {
            grade = "B";
        } else if (hindi >= 70) {
            grade = "C";
        } else if (hindi >= 60) {
            grade = "D";
        } else {
            grade = "Fail";
        }
        System.out.println("Hindi:" +grade);
    }
}
