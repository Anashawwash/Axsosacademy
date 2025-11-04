package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    
    // TO DO: Implement a constructor that takes an ID and a role
    public AdminUser(Integer id,String role){
        this.setId(id);
        this.employeeID =id;
        this.role = role;

    }
    // TO DO: Implement HIPAACompliantUser!
        boolean assignPin(int pin){
        int length = String.valueOf(pin).length();
        if (length >= 6)
            return true;
        else
            return false;
    }

    boolean accessAuthorized(Integer confirmedAuthID){
        Integer id = this.getId();
        if (id == confirmedAuthID)
            return true;
        else
        authIncident();
        return false;
    }

    // TO DO: Implement HIPAACompliantAdmin!
        public default void printSecurityIncidents() {
                System.out.println(reportSecurityIncidents());
            }
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }           
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    
    // TO DO: Setters & Getters
}
