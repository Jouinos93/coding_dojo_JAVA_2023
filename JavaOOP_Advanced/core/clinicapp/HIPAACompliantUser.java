package com.mariem.clinicapp;

public interface HIPAACompliantUser {
    boolean assignPin(int pin);
    boolean accessAuthorized(Integer confirmedAuthID);
}
