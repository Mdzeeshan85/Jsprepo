package com.doctorapp.repository;

import com.doctorapp.exception.IdNotFoundException;
import com.doctorapp.model.Doctor;

import java.util.List;

public interface IDoctorRepository {
    void addDoctor(Doctor doctor);
    void updateDoctor(int doctorId,double fees);
    void deleteDoctor(int doctorId);

    Doctor findById(int doctorId)throws IdNotFoundException;
    List<Doctor> findAll();
    List<Doctor>findBySpeciality(String speciality);
    List<Doctor>findBySpecAndExp(String speciality,int experience);
    List<Doctor>findBySpecAndLessFees(String speciality,double fees);
    List<Doctor>findBySpecAndRatings(String speciality,int ratings);
    List<Doctor>findBySpecAndNameContains(String speciality,String  doctorName);

}
