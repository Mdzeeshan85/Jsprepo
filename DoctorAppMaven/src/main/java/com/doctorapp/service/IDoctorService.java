package com.doctorapp.service;

import com.doctorapp.exception.DoctorNotFoundException;
import com.doctorapp.exception.IdNotFoundException;
import com.doctorapp.model.Doctor;

import java.util.List;

public interface IDoctorService {
    void addDoctor(Doctor doctor);
    void updateDoctor(int doctorId,double fees);
    void deleteDoctor(int doctorId);

    Doctor getById(int doctorId)throws IdNotFoundException;
    List<Doctor> getAll();
    List<Doctor>getBySpeciality(String speciality) throws DoctorNotFoundException;
    List<Doctor>getBySpecAndExp(String speciality,int experience) throws DoctorNotFoundException;
    List<Doctor>getBySpecAndLessFees(String speciality,double fees) throws DoctorNotFoundException;
    List<Doctor>getBySpecAndRatings(String speciality,int ratings) throws DoctorNotFoundException;
    List<Doctor>getBySpecAndNameContains(String speciality,String  doctorName) throws DoctorNotFoundException;
}
