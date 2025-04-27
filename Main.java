import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Lamborghini", "Huracan", 2018);
        Car car2 = new Car("Lamborghini", "Huracan", 2018);
        car2.copy(car);

        System.out.println(car);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Change the values to your liking in the order: make, model, year.");

        boolean game = true;
        while(game){
            String newMake = scanner.nextLine();
            car2.setMake(newMake);
            System.out.println(car2);
            System.out.println("Original info: "+car);
            System.out.println("----------------");

            String newModel = scanner.nextLine();
            car2.setModel(newModel);
            System.out.println(car2);
            System.out.println("Original info: "+car);
            System.out.println("----------------");
            
            int newYear = scanner.nextInt();
            car2.setYear(newYear);
            System.out.println(car2);
            scanner.nextLine();
            System.out.println("Original info: "+car);
            System.out.println("----------------");
        }
        scanner.close();
        
    }
}
