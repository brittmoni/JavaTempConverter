import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select from the following menu:\n" +
                "0 - convert entered temperature to Fahrenheit\n" +
                "1 - convert entered temperature to Celsius\n" +
                "2 - exit program");

        boolean quit = false;
        int action = scanner.nextInt();

        while(quit) {
           switch(action) {
               case 0:
                   toFahrenheit();
                   quit = false;
                   break;
               case 1:
                   toCelsius();
                   quit = false;
                   break;
               case 2:
                   quit = true;
                   break;
            }
        }
    }

    public static void toFahrenheit() {

    }

    public static void toCelsius() {

    }
}

/*
1. Create new properties for temp in celsius, temp in fahrenheit, and string for user selection
2. Set up scanner and constructor
3. Create menu that responds to user input
4. Menu should run different methods based on user input
5. Menu will display as follows:
    Hello, please review the below menu options to convert the temperature
    0 - convert from F to C
    1 - convert from C to F
    2 - exit
6. Switch statement
    switch(userInput) {
        case 0:
            method that calculates C from F entered
            break;
        case 1:
            method that calculates F from C entered
            break;
        case 2:
            exit program
            break;
    }
7. C from F method
    C =  (F - 32) * (5/9)
8. F from C method
    F = C * (9/5) + 32
9. Test
 */
