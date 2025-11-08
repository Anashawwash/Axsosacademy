package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	private ArrayList<String> patientNotes;
	// TO DO: Constructor that takes an IDcopy
    public Physician(Integer id){
        this.setId(id);
        this.PatientNotes = new ArrayList<String>();
    }
    // TO DO: Implement HIPAACompliantUser!
    boolean assignPin(int pin){
        int length = String.valueOf(pin).length();
        if (length == 4){
            this.pin = pin;
            return true;

        }
        else
            return false;

    }

    boolean accessAuthorized(Integer confirmedAuthID){
        Integer id = this.getId();
        if (id == confirmedAuthID)
            return true;
        else
        return false;


    }


	public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }
	
    // TO DO: Setters & Getters
}
