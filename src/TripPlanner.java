import java.util.Scanner;
public class TripPlanner {
    public static void main(String[] args) {
        greeting();
        budget();
        timediff();
        distance();

    }


    public static void greeting() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + "," +
                " where are you travelling to? ");
        String dest = input.nextLine();
        System.out.println("Great! " + dest +
                " sounds like a great trip.");
        System.out.println("***********************************");
        System.out.println();
    }

    public static void budget() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you going to spend travelling? ");
        int days = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        int money = input.nextInt();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String symbol = input.next();
        System.out.print("How many " + symbol + " are there in 1 USD? ");
        double per = input.nextDouble();
        double hours = days * 24;
        double total = money * per;
        System.out.println();

        System.out.print("If you are travelling for " + days +
                " days that is the same as " + (hours) +
                " hours or " + (hours * 60) + " minutes");
        System.out.print("\nIf you are going to spend $" + money +
                " USD that means per day you can spend up to "
                + (money/days) + " USD");
        System.out.print("\nYour total budget in " + symbol +
                " is " + (int) (total*100) + " " + symbol + ", which per day is "
                + (int) ((total/days)*100) + " " + symbol);
        System.out.println("\n***********************************");
        System.out.println();
    }

    public static void timediff() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between " +
                "your home and your destination? ");
        double difference = input.nextDouble();
        double midnight = (24 + difference) % 24;;
        double noon = (12 + difference) % 24;
        System.out.print("That means that when it is midnight at home " +
                "it will be " + ((int)midnight) + ":00" +
                 " and when it is noon at home it will be " + ((int)noon) + ":00");
        System.out.println("\n***********************************");
        System.out.println();
    }

    public static void distance () {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the square area " +
                "of your destination country in km2? ");
        double area = input.nextDouble();
        System.out.print("In miles2 that is " + (int) ((area/1.609)*100));
    }
}
