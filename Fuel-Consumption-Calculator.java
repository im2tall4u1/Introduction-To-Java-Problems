import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        int fuel;
        int distance;

        double miles, gallons, litersPerKilo, milesPerGallon;

        Scanner inPut = new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank ");
        fuel = inPut.nextInt();
        
        if (fuel<=0){
            System.out.println(fuel + " is an Invalid Input");
            return;
        }

        System.out.println("Enter the distance covered ");
        distance = inPut.nextInt();

        if (distance<=0){
            System.out.println(distance + " is an Invalid Input");
            return;
        } else {
            litersPerKilo = (fuel/distance)*100;
            miles = (distance*0.6214);
            gallons = (fuel*0.2642);
            milesPerGallon = miles/gallons;

            System.out.println("Liters/100KM");
            System.out.println(String.format("%.2f", litersPerKilo));
            System.out.println("Miles/gallons");
            System.out.println(String.format("%.2f", milesPerGallon));

        }

    }
}
