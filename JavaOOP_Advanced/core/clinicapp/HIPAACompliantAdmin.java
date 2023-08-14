package com.mariem.clinicapp;
import java.util.ArrayList;

public interface HIPAACompliantAdmin {
    ArrayList<String> reportSecurityIncidents();

    default void printSecurityIncidents() {
        System.out.println(reportSecurityIncidents());
    }

    default boolean adminQATest(ArrayList<String> expectedIncidents) {
        boolean pass = reportSecurityIncidents().equals(expectedIncidents);
        System.out.println(pass ? "PASS" : "FAIL");
        return pass;
    }
}
