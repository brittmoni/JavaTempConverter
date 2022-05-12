import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please select from the following menu:\n" +
                "0 - convert entered temperature to Fahrenheit\n" +
                "1 - convert entered temperature to Celsius\n" +
                "2 - exit program");

        boolean quit = false;

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

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
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * (9/5) + 32);

        System.out.println(celsius + " degrees Celsius equals " + fahrenheit + " degrees Fahrenheit.");
    }

    public static void toCelsius() {
        double fahrenheit = scanner.nextDouble();
        double celsius = ((fahrenheit - 32) * (5/9));

        System.out.println(fahrenheit + " degrees Fahrenheit equals " + celsius + " degrees Celsius.");
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
