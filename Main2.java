
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // PILIHAN PERTAMA
        System.out.println("Pilih tipe: Bicycle atau Car?");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("Bicycle")) {
            // Kalo user milih bicycle
            System.out.println("Masukkan info untuk Bicycle:");
            System.out.print("Number of Wheels: ");
            int numWheels = scanner.nextInt();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); 
            System.out.print("Type of Bike: ");
            String bikeType = scanner.nextLine();

            // BUAT DAN PRINT BICYCLE
            Bicycle bicycle = new Bicycle(numWheels, price, bikeType);
            System.out.println("Bicycle info:");
            bicycle.print();
            
        } else if (choice.equalsIgnoreCase("Car")) {
            // Kalo user milih CAR
            System.out.println("Pilih tipe CAR: Convertible atau Non-Convertible?");
            String carType = scanner.nextLine();

            if (carType.equalsIgnoreCase("Non-Convertible")) {
                // Kalo user milih NON-CONVERTIBLE
                System.out.println("Masukkan info untuk Non-Convertible Car:");
                System.out.print("Number of Wheels: ");
                int numWheels = scanner.nextInt();
                System.out.print("Price: ");
                double price = scanner.nextDouble();
                System.out.print("Number of Doors: ");
                int numDoors = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Is Electric (true/false)?: ");
                boolean isElectric = scanner.nextBoolean();

                // BUAT DAN PRINT NON-CONVERTIBLE CAR
                Car car = new Car(numWheels, price, numDoors, isElectric);
                System.out.println("Non-Convertible Car info:");
                car.print();

            } else if (carType.equalsIgnoreCase("Convertible")) {
                // Kalo user milih CONVERTIBLE CAR
                System.out.println("Masukkan info untuk Convertible Car:");
                System.out.print("Number of Wheels: ");
                int numWheels = scanner.nextInt();
                System.out.print("Price: ");
                double price = scanner.nextDouble();
                System.out.print("Number of Doors: ");
                int numDoors = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Is Electric (true/false)?: ");
                boolean isElectric = scanner.nextBoolean();
                scanner.nextLine(); 
                System.out.print("Type of Roof: ");
                String roofType = scanner.nextLine();

                // BUAT DAN PRINT CONVERTIBLE CAR
                Convertible convertible = new Convertible(numWheels, price, numDoors, isElectric, roofType);
                System.out.println("Convertible Car info:");
                convertible.print();
            } else {
                System.out.println("Tipe CAR tidak valid.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close(); 
    }
}