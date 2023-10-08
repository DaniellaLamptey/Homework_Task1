import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CarService {

    public static void saveCarsByMake(List<Car> cars, String make, String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (Car car : cars) {
                if (car.getMake().equalsIgnoreCase(make)) {
                    bw.write(car.toString());
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveCarsByModelAndUsage(List<Car> cars, String model, int nYears, String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
            for (Car car : cars) {
                if (car.getModel().equalsIgnoreCase(model) && (currentYear - car.getYearOfManufacture()) > nYears) {
                    bw.write(car.toString());
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveCarsByYearAndPrice(List<Car> cars, int year, double minPrice, String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (Car car : cars) {
                if (car.getYearOfManufacture() == year && car.getPrice() > minPrice) {
                    bw.write(car.toString());
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
