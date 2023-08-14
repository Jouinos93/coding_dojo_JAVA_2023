package com.caresoft.clinicapp;

public class Test {

    public static void main(String[] args) {
        // Physician and AdminUser instances
        Physician doctor10 = new Physician(1);
        AdminUser roseTyler = new AdminUser(2, "Companion");
        AdminUser donnaNoble = new AdminUser(3, "Companion");

        // Physician Implementation Tests
        System.out.println("\n======= Physician Tests =======\n");
        testPinAssignment(doctor10, 42, false);
        testPinAssignment(doctor10, 4000, true);
        testAccessAuthorization(doctor10, 1234, false);
        testAccessAuthorization(doctor10, 1, true);

        // AdminUser Implementation Tests
        System.out.println("\n======= AdminUser Tests =======\n");
        testPinAssignment(roseTyler, 42, false);
        testPinAssignment(roseTyler, 424242, true);
        testAccessAuthorization(roseTyler, 1234, false);
        testAccessAuthorization(roseTyler, 1234, false);
        testAccessAuthorization(roseTyler, 2, true);

        donnaNoble.accessAuthorized(42);
        donnaNoble.accessAuthorized(4321);
        donnaNoble.accessAuthorized(7);
        donnaNoble.accessAuthorized(28);

        System.out.println(donnaNoble.reportSecurityIncidents());
    }

    private static void testPinAssignment(HIPAACompliantUser user, int pin, boolean expected) {
        String result = user.assignPin(pin) == expected ? "PASS" : "FAIL";
        System.out.printf("%s pin assign test: %s%n", user.getClass().getSimpleName(), result);
    }

    private static void testAccessAuthorization(HIPAACompliantUser user, Integer authID, boolean expected) {
        String result = user.accessAuthorized(authID) == expected ? "PASS" : "FAIL";
        System.out.printf("%s auth test: %s%n", user.getClass().getSimpleName(), result);
    }
}
