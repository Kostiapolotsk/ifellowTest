package ru.iFellow;
import java.util.ArrayList;
import java.util.List;
public class Main {
    //its Main origin
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Suzuki("Swift", 2010, true, "Green", 60000));
        cars.add(new Toyota("Camry", 2005, false, "Blue", 120000));
        cars.add(new BMW("X5", 2015, true, "Red", 80000));
        cars.add(new Audi("A4", 2008, false, "Green", 90000));
        cars.add(new Ford("Focus", 2000, true, "Black", 150000));
        cars.add(new Suzuki("Vitara", 2022, true, "White", 20000));
        cars.add(new Toyota("Corolla", 2018, false, "Green", 40000));
        cars.add(new BMW("3 Series", 2004, true, "Blue", 180000));
        cars.add(new Audi("Q7", 2019, true, "Yellow", 25000));
        cars.add(new Ford("Fiesta", 2007, false, "Green", 50000));

        // Вывод информации об автомобилях, выпущенных после 2006 года
        printRecentCars(cars);

        // Изменение цвета зеленых авто на красный
        changeGreenCarsToRed(cars);

        // Показать все автомобили, проехавшие более 100,000 км
        printHighMileageCars(cars);
    }

    public static void printRecentCars(List<Car> cars) {
        for (Car car : cars) {
            if (car.getYear() > 2006) {
                System.out.println(car.getFullInfo());
            } else {
                System.out.println("Устаревший авто: " + car.getBrand() + " " + car.getModel());
            }
        }
    }

    public static void changeGreenCarsToRed(List<Car> cars) {
        for (Car car : cars) {
            if (car.getColor().equalsIgnoreCase("Green")) {
                car.setColor("Red");
                System.out.println("Цвет изменён на красный для: " + car.getBrand() + " " + car.getModel());
            }
        }
    }

    public static void printHighMileageCars(List<Car> cars) {
        for (Car car : cars) {
            if (car.getMileage() > 100000) {
                System.out.println("Автомобиль с большим пробегом: " + car.getFullInfo());
            }
        }
    }
}