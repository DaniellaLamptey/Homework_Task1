import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        // Adding cars to the list
        cars.add(new Car(1, "Toyota", "Camry", 2015, "White", 20000, "ABC123"));
        cars.add(new Car(2, "Honda", "Civic", 2018, "Black", 18000, "XYZ789"));
        cars.add(new Car(3, "Ford", "Mustang", 2017, "Red", 25000, "DEF456"));
        cars.add(new Car(4, "Chevrolet", "Cruze", 2019, "Blue", 17000, "GHI101"));
        cars.add(new Car(5, "Hyundai", "Elantra", 2020, "Yellow", 21000, "JKL112"));
        cars.add(new Car(6, "Nissan", "Altima", 2016, "Green", 18000, "MNO131"));
        cars.add(new Car(7, "Volkswagen", "Jetta", 2021, "Grey", 23000, "PQR141"));
        cars.add(new Car(8, "Subaru", "Impreza", 2022, "Silver", 22000, "STU151"));
        cars.add(new Car(9, "BMW", "X3", 2014, "Black", 27000, "VWX161"));
        cars.add(new Car(10, "Mercedes-Benz", "C-Class", 2015, "White", 30000, "YZA171"));

        // Saving lists of cars to files based on conditions
        CarService.saveCarsByMake(cars, "Toyota", "toyota_cars.txt");
        CarService.saveCarsByModelAndUsage(cars, "Civic", 3, "old_civic_cars.txt");
        CarService.saveCarsByYearAndPrice(cars, 2015, 15000, "expensive_2015_cars.txt");
    }
}