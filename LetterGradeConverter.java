// Name:Noelle Dacayo
// Date:February 22, 2023
// App Name: Letter Grade Converter
// Description: An app that converts the percentage of the user's grades into a letter grade.
//              ie. 90-100 = A+

// Helloo ^^/


import java.util.Scanner;

class LetterGradeConverter
{
    // CONSTANTS
    static final String SET_TITLE = "\033]0;%s\007";
    static final String CLEAR_TERMINAL = "\033c"; 

    // Scanner - used for getting user input
    static Scanner scanner = new Scanner(System.in);    

    public static void main(String[] args) 
    {
         // Only use this fix if your title doesn't work
         try 
         {
             new ProcessBuilder("cmd", "/c").inheritIO().start().waitFor();
         } catch (Exception exception) {}

         //Set Title
        System.out.printf(SET_TITLE, "Letter Grade Converter - Noelle Dacayo");

        // Variables
        boolean restart = false;

        // Executes app at least once
        do
        {   
            // Clears the terminal and prints the banner
            System.out.println(CLEAR_TERMINAL);
            System.out.printf("%s%s%s", Aesthetics.LIGHT_PINK, Aesthetics.INTRO_BANNER, Aesthetics.RESET);

            // Calls the gradePercentage method from the class Grade so the program would actually run
            float grade = Grade.gradePercentage();

            // Clears the terminal and prints the banner
            System.out.println(CLEAR_TERMINAL);
            System.out.printf("%s%s%s", Aesthetics.LIGHT_PINK, Aesthetics.INTRO_BANNER, Aesthetics.RESET);

            // For aesthetic purposes, this is just to space things out better
            System.out.printf("\n%s_____________________________________________________________________________________%s\n\n\n", Aesthetics.CYAN, Aesthetics.RESET);
            
            // Prints out the result in a formatted string with colours :))))
            // I tried to learn how the colorama class we made in class work but I couldn't figure it out so I just made a new one ^^'
            System.out.printf("\nA grade of %s%s%%%s is equivalent to %s%s%s which is considered \"%s%s!%s\"", Aesthetics.LIGHT_PINK, grade, Aesthetics.RESET, Aesthetics.LIGHT_PINK, Grade.letterGrade(grade), Aesthetics.RESET, Aesthetics.LIGHT_PINK, Grade.gradeFeedback(Grade.letterGrade(grade)), Aesthetics.RESET);

            //Exit prompt
            System.out.printf("\n\n\n%s_____________________________________________________________________________________\n", Aesthetics.CYAN);
            System.out.printf("Enter 'r' to restart or 'Enter' to exit: %s", Aesthetics.RESET);
            restart = scanner.nextLine().equals("r");

        } while(restart);
        scanner.close();
    }

// BYEEEEEE ^^/
// Okay, I know the it says to match it as close as possible but I had fun with this. Hopefully I actually send all the files this time haha.

}