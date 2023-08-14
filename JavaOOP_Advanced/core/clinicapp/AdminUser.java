package com.mariem.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {

    private String role;
    private ArrayList<String> securityIncidents = new ArrayList<>();

    public AdminUser(Integer id, String role) {
        super(id);
        this.role = role;
    }

    @Override
    public ArrayList<String> reportSecurityIncidents() {
        return securityIncidents;
    }

    @Override
    public boolean assignPin(int pin) {
        if (pin >= 100000) {
            setPin(pin);
            return true;
        }
        return false;
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        if (!getId().equals(confirmedAuthID)) {
            authIncident();
            return false;
        }
        return true;
    }

    public void newIncident(String notes) {
        String report = String.format("Datetime Submitted: %s\nReported By ID: %s\nNotes: %s\n",
                new Date(), getId(), notes);
        securityIncidents.add(report);
    }

    public void authIncident() {
        String report = String.format("Datetime Submitted: %s\nID: %s\nNotes: %s\n",
                new Date(), getId(), "AUTHORIZATION ATTEMPT FAILED FOR THIS USER");
        securityIncidents.add(report);
    }
}

