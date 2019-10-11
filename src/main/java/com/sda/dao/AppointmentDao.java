package com.sda.dao;

import com.sda.entities.Appointment;
import com.sda.entities.Nurse;
import com.sda.entities.Patient;
import com.sda.entities.Physician;

import java.sql.Timestamp;

public class AppointmentDao extends GenericDao<Appointment> {
    public void addAppointment(Patient patient, Nurse prepnurse, Physician physician, Timestamp startDateTime,Timestamp endDateTime ){
        Appointment appointment = new Appointment();
        appointment.setPatient(patient);
        appointment.setPrepnurse(prepnurse);
        appointment.setPhysician(physician);
        appointment.setStartDateTime(startDateTime);
        appointment.setEndDateTime(endDateTime);
    }
}
