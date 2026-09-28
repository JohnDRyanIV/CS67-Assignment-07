public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Alice", 30, 5);
        Driver driver2 = new Driver("Bob", 40, 3);
        CommercialDriver driver3 = new CommercialDriver("Charlie", 35, 5, "DeliveryCo", 1.5);

        driver3.setInsuranceRate(3);     // Inherited one-argument method
        System.out.println(driver3);     // Overridden toString()

        Car car1 = new Car("2016 Toyota Prius", "ABC123", "InsureCo");
        Car car2 = new Car("2020 Honda Civic", "XYZ789", "SafeGuard");
        Car car3 = new Car("2022 Ford F-150", "DEF456", "SecureComp");

        car1.recordAccident("2024-01-15", car2, 2000, driver1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(driver1);
        System.out.println(driver2);

        car1.recordAccident("2024-01-15", car3,2000, driver3);

        System.out.println(car1);
        System.out.println(car3);
        System.out.println(driver3);
        System.out.println(driver2);

    }
}
