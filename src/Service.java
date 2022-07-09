import java.util.Random;

public class Service extends Car{
    public static void getCars(Car[]cars){
        System.out.println("~~~~~~~~~~~~~~~~~ * CARS * ~~~~~~~~~~~~~~~~~~~");
        System.out.println("| # |       Car         |  Driver  |  State  |");
        System.out.println("|---+-------------------+----------+---------|");
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    public static void gerDrivers(Driver[]drivers){
        System.out.println("~~~~~~~~~~~ * DRIVERS * ~~~~~~~~~~~~");
        System.out.println("|     #    |   Driver   |   Car    |");
        System.out.println("|----------+------------+----------|");
        for (Driver driver : drivers) {
            System.out.println(driver);
        }
    }
    public static void getDescription(Car car) {
        System.out.println("ID: " + car.getId());
        System.out.println("Name: " + car.getName());
        System.out.println("Driver: " + car.getDriver());
        System.out.println("State: " + car.getState());
        System.out.println("Press to 1 to change driver");
        System.out.println("Press to 2 to start driving");
        System.out.println("Press to 3 to start repair");
        System.out.println("---------------------------");
    }

    public static void changeDriver(Car car, Driver driver) {
        if (car.getState().equals(State.BASE)) {
            car.setDriver(driver.getDriverName());
            driver.setBus(car.getName());
        } else if (car.getState().equals(State.ROUTE)) {
            System.out.println("Driver is already on the route!");
        } else {
            System.out.println("You can't change the driver!");
        }
    }

    public static void startDriving(Car car, Driver driver) {
        if (car.getState().equals(State.BASE)) {
            if (car.getDriver() != null) {
                car.setState(State.ROUTE);
                System.out.println("Driver started his way successfully!");
            } else {
                System.out.println("There is no driver!");
            }
        } else if (car.getState().equals(State.ROUTE)) {
            System.out.println("Driver is already on the route!");
        } else {
            Random random = new Random();
            int rnd = random.nextInt(2);
            if (rnd == 0) {
                car.setState(State.ROUTE);
                System.out.println("Car is on the route!");
            } else {
                car.setState(State.BASE);
                System.out.println("Car is on the base!");
            }
        }
    }

    public static void startRepair(Car car, Driver driver) {
        if (car.getState().equals(State.BASE)) {
            car.setState(State.REPAIR);
            System.out.println("Car is on repairing now!");
        } else if (car.getState().equals(State.ROUTE)) {
            car.setState(State.REPAIR);
        } else {
            System.out.println("Car is already on repair!");
        }
    }





}
