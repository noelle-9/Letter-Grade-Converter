// Name:Noelle Dacayo
// Date:February 22, 2023
// Class Name: Grade
// Description: Contains all the methods for Letter Grade Converter

import java.util.Scanner;
public class Grade 
{
    // Scanner - used for getting user input
    static Scanner scanner = new Scanner(System.in);


    /** 
     * Asks the user for a grade in percentage value
     * @param grade User's grade
     * @return The grade
     */
    public static float gradePercentage()
    {
        float grade = 0;
        boolean numeric = false;

        while(!numeric)
        {
            // Ask for a grade
            System.out.print("\nEnter your grade percentage: ");

            // Try to convert to a number
            try{
                grade = Float.parseFloat(scanner.nextLine());
                numeric = true;
            }
            catch(Exception exception)
            {
                numeric = false;
            }
            // Error in case grade is negative OR greater than 100
            if(grade < 0 || grade > 100)
            {
                System.out.printf("\n\n\n%s_____________________________________________________________________________________\n\n",Aesthetics.RED);
                System.out.printf("\n%s", Aesthetics.ERROR_INVALID_RANGE);
                System.out.printf("_____________________________________________________________________________________%s\n", Aesthetics.RESET);
                // Restarts the method
                return gradePercentage();
            }
            // Errors if anything but a numeric input is entered
            else if(!numeric)
            {
                System.out.printf("\n\n\n%s_____________________________________________________________________________________\n\n",Aesthetics.RED);
                System.out.printf("\n%s", Aesthetics.ERROR_NOT_NUMERIC);
                System.out.printf("_____________________________________________________________________________________%s\n", Aesthetics.RESET);
                // Restarts the method
                return gradePercentage();
            }
        }
        // Once everything is validated, the input is stored intho the variable "grade"
        return grade;
    }

    /**
     * Converts the user input into a the nearest whole number and converts it into a letter grade
     * @param rounded The rounded grade percentage
     * @return The letter grade
     */
    public static String letterGrade(float gradePercentage)
    {
        // Rounds the grade entered to the nearest whole number
        int rounded = Math.round(gradePercentage);

        // If the grade is lower than 50, returns "F"
        if (rounded < 50)
        {
            return "F";
        }
        // If the grade is greater than or equal to 50 and lower than or equal to 54, returns "D-"
        else if (rounded >= 50 && rounded <=54)
        {
            return "D-";
        }
        // If the grade is greater than or equal to 55 and lower than or equal to 59, returns "D+"
        else if (rounded >= 55 && rounded <=59)
        {
            return "D+";
        }
        // If the grade is greater than or equal to 60 and lower than or equal to 64, returns "C"
        else if (rounded >= 60 && rounded <=64)
        {
            return "C";
        }
        // If the grade is greater than or equal to 65 and lower than or equal to 69, returns "B-"
        else if (rounded >= 65 && rounded <=69)
        {
            return "B-";
        }
        // If the grade is greater than or equal to 70 and lower than or equal to 74, returns "B"
        else if (rounded >= 70 && rounded <=74)
        {
            return "B";
        }
        // If the grade is greater than or equal to 75 and lower than or equal to 79, returns "B+"
        else if (rounded >= 75 && rounded <=79)
        {
            return "B+";
        }
        // If the grade is greater than or equal to 80 and lower than or equal to 84, returns "A-"
        else if (rounded >= 80 && rounded <=84)
        {
            return "A-";
        }
        // If the grade is greater than or equal to 85 and lower than or equal to 89, returns "A"
        else if (rounded >= 85 && rounded <=89)
        {
            return "A";
        }
        // Anything greater than 89 returns "A+"
        else
        {
            return "A+";
        }
    }

    /**
     * Coverts the letter grade to the grade feedback provided in the instructions
     * @param letterGrade Uses the converted data from letterGrade
     * @return The grade feedback
     */
    public static String gradeFeedback(String letterGrade)
    {
        switch (letterGrade) 
        {
            case "F":
                return "Fail";
            case "D-":
            case "D+":
                return "Conditional Pass";
            case "C":
                return "Acceptable";
            case "B-":
                return "Satisfactory";
            case "B":
                return "Good";
            case "B+":
                return "Very Good";
            case "A-":
                return "Excellent";
            case "A":
                return "Exemplary";
            default:
                return "Outstanding";
        }
    }
}
