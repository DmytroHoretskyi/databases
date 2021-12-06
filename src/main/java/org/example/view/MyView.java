package org.example.view;

import org.example.controller.implementation.*;
import org.example.model.entity.*;

import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MyView {

    private final Map<String, Printable> menu = new LinkedHashMap<>();
    private static final Scanner SCANNER = new Scanner(System.in);

    private final CarController carController = new CarController();
    private final DriverController driverController = new DriverController();
    private final RatingController ratingController = new RatingController();
    private final RouteController routeController = new RouteController();
    private final UserController userController = new UserController();


    public MyView() {
        menu.put("11", this::getAllCars);
        menu.put("12", this::getCarById);
        menu.put("13", this::createCar);
        menu.put("14", this::updateCar);
        menu.put("15", this::deleteCar);

        menu.put("21", this::getAllDrivers);
        menu.put("22", this::getDriverById);
        menu.put("23", this::createDriver);
        menu.put("24", this::updateDriver);
        menu.put("25", this::deleteDriver);

        menu.put("31", this::getAllRatings);
        menu.put("32", this::getRatingById);
        menu.put("33", this::createRating);
        menu.put("34", this::updateRating);
        menu.put("35", this::deleteRating);

        menu.put("41", this::getAllRoutes);
        menu.put("42", this::getRouteById);
        menu.put("43", this::createRoute);
        menu.put("44", this::updateRoute);
        menu.put("45", this::deleteRoute);

        menu.put("51", this::getAllUsers);
        menu.put("52", this::getUserById);
        menu.put("53", this::createUser);
        menu.put("54", this::updateUser);
        menu.put("55", this::deleteUser);


    }


    //#########################################################################

    private void outputMenu() {
        System.out.println("\nMENU:");
        for (Printable str : menu.values()) {
            System.out.println(str);
        }
    }

    public final void show() {
        String input;
        Menu showMenu = new Menu();
        showMenu.displayMenu();
        System.out.println("\nEnter numbers:\n");
        do {
            try {
                input = SCANNER.next();
                menu.get(input).print();
            } catch (Exception ignored) {
            }
        } while (SCANNER.hasNext());
    }

    //#########################################################################

    private void getAllCars() throws SQLException {
        System.out.println(carController.findAll() + "\n");
    }

    private void getCarById() throws SQLException {
        System.out.println("Enter ID: ");
        Integer id = SCANNER.nextInt();
        System.out.println(carController.findById(id) + "\n");
    }

    private Car getCarInputs() {
        System.out.println("\nEnter car model: ");
        String carModel = SCANNER.next();
        System.out.println("Enter car mark: ");
        String carMark = SCANNER.next();
        System.out.println("Enter car color ");
        String carColor = SCANNER.next();
        System.out.println("Enter car_number ");
        String carNumber = SCANNER.next();
        return new Car(0,carModel, carMark, carColor, carNumber);
    }

    private void createCar() throws SQLException {
        Car car = getCarInputs();
        carController.create(car);
        System.out.println("Car was successfully created!\n");
    }

    private void updateCar() throws SQLException {
        System.out.println("\nEnter ID to update: ");
        Integer id = SCANNER.nextInt();
        Car car = getCarInputs();
        car.setId(id);
        carController.update(car.getId(), car);
        System.out.println("Car with ID = " + id + "was updated\n");
    }

    private void deleteCar() throws SQLException {
        System.out.println("\nEnter ID to delete the car: ");
        Integer id = SCANNER.nextInt();
        carController.delete(id);
        System.out.println("Car with ID = " + id + "was deleted\n");
    }

    //########################################################################


    private void getAllDrivers() throws SQLException {
        System.out.println(driverController.findAll() + "\n");
    }

    private void getDriverById() throws SQLException {
        System.out.println("Enter ID: ");
        Integer id = SCANNER.nextInt();
        System.out.println(driverController.findById(id) + "\n");
    }

    private Driver getDriverInputs() {
        System.out.println("\nEnter driver name: ");
        String driverName = SCANNER.next();
        System.out.println("Enter driver surname: ");
        String driverSurname = SCANNER.next();
        System.out.println("Enter driver age ");
        Integer driverAge = SCANNER.nextInt();
        System.out.println("Enter number_of_cars ");
        Integer driverNumberOfCars = SCANNER.nextInt();
        System.out.println("Enter experience ");
        Integer driverExperience = SCANNER.nextInt();
        System.out.println("Enter rating_idrating ");
        Integer idrating = SCANNER.nextInt();
        Rating rating = ratingController.findById(idrating);
        return new Driver(0,driverName,driverSurname,driverAge,driverNumberOfCars,driverExperience,rating);

    }

    private void createDriver() throws SQLException {
        Driver driver = getDriverInputs();
        driverController.create(driver);
        System.out.println("Driver was successfully created!\n");
    }

    private void updateDriver() throws SQLException {
        System.out.println("\nEnter ID to update: ");
        Integer id = SCANNER.nextInt();
        Driver driver = getDriverInputs();
        driver.setId(id);
        driverController.update(driver.getId(), driver);
        System.out.println("Driver with ID = " + id + "was updated\n");
    }

    private void deleteDriver() throws SQLException {
        System.out.println("\nEnter ID to delete the driver: ");
        Integer id = SCANNER.nextInt();
        driverController.delete(id);
        System.out.println("Driver with ID = " + id + "was deleted\n");
    }

    //########################################################################

    private void getAllRatings() throws SQLException {
        System.out.println(ratingController.findAll() + "\n");
    }

    private void getRatingById() throws SQLException {
        System.out.println("Enter ID: ");
        Integer id = SCANNER.nextInt();
        System.out.println(ratingController.findById(id) + "\n");
    }

    private Rating getRatingInputs() {
        System.out.println("\nEnter stars: ");
        Integer ratingStars = SCANNER.nextInt();
        return new Rating(ratingStars);
    }

    private void createRating() throws SQLException {
        Rating rating = getRatingInputs();
        ratingController.create(rating);
        System.out.println("Rating was successfully created!\n");
    }

    private void updateRating() throws SQLException {
        System.out.println("\nEnter ID to update: ");
        Integer id = SCANNER.nextInt();
        Rating rating = getRatingInputs();
        rating.setId(id);
        ratingController.update(rating.getId(), rating);
        System.out.println("Rating with ID = " + id + "was updated\n");
    }

    private void deleteRating() throws SQLException {
        System.out.println("\nEnter ID to delete the rating: ");
        Integer id = SCANNER.nextInt();
        ratingController.delete(id);
        System.out.println("Rating with ID = " + id + "was deleted\n");
    }

    //########################################################################

    private void getAllRoutes() throws SQLException {
        System.out.println(routeController.findAll() + "\n");
    }

    private void getRouteById() throws SQLException {
        System.out.println("Enter ID: ");
        Integer id = SCANNER.nextInt();
        System.out.println(routeController.findById(id) + "\n");
    }

    private Route getRouteInputs() {
        System.out.println("\nEnter start: ");
        String routeStart = SCANNER.next();
        System.out.println("\nEnter end: ");
        String routeEnd = SCANNER.next();
        System.out.println("\nEnter data: ");
        String routeData = SCANNER.next();
        System.out.println("\nEnter price: ");
        Integer routePrice = SCANNER.nextInt();
        System.out.println("\nEnter User_iduser: ");
        Integer iduser = SCANNER.nextInt();
        User user = userController.findById(iduser);
        System.out.println("\nEnter driver_iddriver: ");
        Integer iddriver = SCANNER.nextInt();
        Driver driver = driverController.findById(iddriver);
        return new Route(0,routeStart,routeEnd,routeData,routePrice,user,driver);
    }

    private void createRoute() throws SQLException {
        Route route = getRouteInputs();
        routeController.create(route);
        System.out.println("Route was successfully created!\n");
    }

    private void updateRoute() throws SQLException {
        System.out.println("\nEnter ID to update: ");
        Integer id = SCANNER.nextInt();
        Route route = getRouteInputs();
        route.setId(id);
        routeController.update(route.getId(), route);
        System.out.println("Route with ID = " + id + "was updated\n");
    }

    private void deleteRoute() throws SQLException {
        System.out.println("\nEnter ID to delete the route: ");
        Integer id = SCANNER.nextInt();
        routeController.delete(id);
        System.out.println("Route with ID = " + id + "was deleted\n");
    }

    //########################################################################

    private void getAllUsers() throws SQLException {
        System.out.println(userController.findAll() + "\n");
    }

    private void getUserById() throws SQLException {
        System.out.println("Enter ID: ");
        Integer id = SCANNER.nextInt();
        System.out.println(userController.findById(id) + "\n");
    }

    private User getUserInputs() {
        System.out.println("\nEnter name: ");
        String userName = SCANNER.next();
        System.out.println("\nEnter surname: ");
        String userSurname = SCANNER.next();
        System.out.println("\nEnter age: ");
        Integer userAge = SCANNER.nextInt();
        System.out.println("\nEnter gender: ");
        String userGender = SCANNER.next();
        return new User(0,userName, userSurname, userAge,userGender);
    }

    private void createUser() throws SQLException {
        User user = getUserInputs();
        userController.create(user);
        System.out.println("User was successfully created!\n");
    }

    private void updateUser() throws SQLException {
        System.out.println("\nEnter ID to update: ");
        Integer id = SCANNER.nextInt();
        User user = getUserInputs();
        user.setId(id);
        userController.update(user.getId(), user);
        System.out.println("User with ID = " + id + "was updated\n");
    }

    private void deleteUser() throws SQLException {
        System.out.println("\nEnter ID to delete the user: ");
        Integer id = SCANNER.nextInt();
        userController.delete(id);
        System.out.println("User with ID = " + id + "was deleted\n");
    }

    //########################################################################
}
