package firstProgram;

import java.util.Scanner;

public class casePercabangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Nilai: ");
        int nilai = scanner.nextInt();

        String grade;

        if (true == nilai > 90) {
            grade = "A";
        } else if (true == nilai > 80) {
            grade = "B+";
        } else if (true == nilai > 70) {
            grade = "B";
        } else {
            grade = "F";
        }


//        switch () {
//            case nilai > 90:
//                grade = "A";
//                break;
//
//            case nilai > 80:
//                grade = "B+";
//                break;
//
//            case nilai > 70:
//                grade = "B";
//                break;
//
//            default:
//                grade = "F";
//        }

        System.out.println("Grade adalah = " + grade);
    }
}
