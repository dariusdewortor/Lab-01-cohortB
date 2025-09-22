import java.util.Scanner;

public class FootballPlayer {
    public static void main(String[] args) {
        // Task one
        String name;
        int age;
        double height;
        double weight;
        int jerseyNumber;
        String playerStatus = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = input.nextLine();

        System.out.println("Enter your age: ");
        age = input.nextInt();

        System.out.println("Enter your height: ");
        height = input.nextDouble();

        System.out.println("Enter your weight: ");
        weight = input.nextDouble();

        System.out.println("Enter your jersey number: ");
        jerseyNumber = input.nextInt();

        System.out.println("Player details" + "\nName :" + name + "\nAge :" + age + "\nheight :" + height + "m"
                + "\nweight :" + weight + "lbs" + "\nJersey number :" + jerseyNumber);
        // Task two
        final double pound = 0.45359237;
        final int meter = 100;
        weight *= pound;
        height *= meter;
        int weightInKg = (int) weight;
        int heightInCm = (int) height;

        System.out.println("\nNew Player details" + "\nName :" + name + "\nAge :" + age + "\nheight in cm :"
                + heightInCm + "cm" + "\nweight in kg :" + weightInKg + "kg" + "\nJersey number :" + jerseyNumber);
        // Task three
        System.out.println("\n" + name + "'s " + "current age is " + age);
        age = ++age;
        jerseyNumber = --jerseyNumber;
        System.out.println("\n" + name + "'s " + "age after the previous season is " + age + " and jersey number is "
                + jerseyNumber + " due to a penalty");
        // Task four
        if (age >= 18 && age <= 35 && weightInKg < 90) {
            System.out.println("\nEligible");
        } else {
            System.out.println("\nNot Eligible");
        }
        if (age < 18 || weightInKg >= 90) {
            System.out.println("Player has a problem (either too young" +
                    "or too heavy.)");
        }
        if (!(age >= 18) && !(age <= 35) && !(weightInKg < 90)) {
            System.out.println("\nNot Eligible");
        }
        //Task 5
        if (age < 20) {
            playerStatus = "Player is a rising star";
            System.out.println(playerStatus);
        } else if (age >= 20 && age <= 30) {
            playerStatus = "Player is in prime";
            System.out.println(playerStatus);
        } else if (age > 30) {
            playerStatus = "Player is a veteran";
            System.out.println(playerStatus);
        }

        // Task 6
        int playerNumber;
        System.out.println("Enter the player's number: ");
        playerNumber = input.nextInt();

        switch (playerNumber) {
            case 1:
                System.out.println("This player is a goal keeper ");

                break;
            case 2:
                System.out.println("This player is a defender");
                break;
            case 5:
                System.out.println("This player is a defender");
                break;
            case 6:
                System.out.println("This player is a midfielder");
                break;
            case 7:
                System.out.println("This player is a winger");
                break;
            case 8:
                System.out.println("This player is a midfielder");
                break;
            case 9:
                System.out.println("This player is a striker");
                break;
            case 10:
                System.out.println("This player is a playmaker");
                break;
            case 11:
                System.out.println("This player is a winger");
                break;
            default:
                System.out.println("Player position not known");
                // Task 7
                /*
                 * Unwanted fall through
                 * 
                 * case 2:
                 * System.out.println("Defender");
                 * case 6:
                 * System.out.println("Midfielder");
                 * case 7:
                 * System.out.println("Winger");
                 * default:
                 * System.out.println("Player position not known");
                 */

                /*
                 * Grouped case
                 * case 2:
                 * case 5:
                 * System.out.println("Defender");
                 * break;
                 * case 6:
                 * case 8:
                 * System.out.println("Midfielder");
                 * break;
                 * case 7:
                 * case 11:
                 * System.out.println("Winger");
                 * break;
                 * case 9:
                 * System.out.println("Striker");
                 * break;
                 * case 10:
                 * System.out.println("Playmaker");
                 * break;
                 * case 1:
                 * System.out.println("Goalkeeper");
                 * break;
                 * default:
                 * System.out.println("Player position not known");
                 * }
                 * 
                 */
        }
        // Task 8

        if (playerStatus.equals("Player is in prime")) { 
            if (weightInKg < 80) { 
                System.out.println("Starting line up");
            } else { 
                System.out.println("Player on bench");
            }
        } else { 
            System.out.println("Player on bench");
        }
        // Task 9
        String finalStatus = (age >= 18 && age <= 35 && weightInKg < 90) ? "Play" : "Rest";
        System.out.println("Final Status: " + finalStatus);

    }
}
