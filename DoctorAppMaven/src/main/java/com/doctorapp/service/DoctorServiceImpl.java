package com.doctorapp.service;

import com.doctorapp.exception.DoctorNotFoundException;
import com.doctorapp.exception.IdNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.repository.DoctorRepositoryImpl;
import com.doctorapp.repository.IDoctorRepository;

import java.util.Collections;
import java.util.List;

public class DoctorServiceImpl implements IDoctorService {
    private IDoctorRepository doctorRepository=new DoctorRepositoryImpl();
    @Override
    public void addDoctor(Doctor doctor) {
        doctorRepository.addDoctor(doctor);

    }

    @Override
    public void updateDoctor(int doctorId, double fees) {
        doctorRepository.updateDoctor(doctorId,fees);

    }

    @Override
    public void deleteDoctor(int doctorId) {
        doctorRepository.deleteDoctor(doctorId);

    }

    @Override
    public Doctor getById(int doctorId) throws IdNotFoundException {
        Doctor doctor=doctorRepository.findById(doctorId);
        if(doctor==null)
            throw new IdNotFoundException("invalid id");
        return doctor;
    }

    @Override
    public List<Doctor> getAll() {
        List<Doctor>doctorList=doctorRepository.findAll();
        return doctorList;
    }

    @Override
    public List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundException {
        List<Doctor>doctorList=doctorRepository.findBySpeciality(speciality);
        if(doctorList.isEmpty())
            throw new DoctorNotFoundException("doc not found");
        Collections.sort(doctorList,(d1,d2)->d1.getDoctorName().compareTo(d2.getDoctorName()));
        return doctorList;
    }

    @Override
    public List<Doctor> getBySpecAndExp(String speciality, int experience) throws DoctorNotFoundException {
        List<Doctor>doctorList=doctorRepository.findBySpecAndExp(speciality,experience);
        if(doctorList.isEmpty())
            throw new DoctorNotFoundException("doc not found");
        Collections.sort(doctorList,(d1,d2)->((Integer)(d2.getExperience())).compareTo(d1.getExperience()));
        return doctorList;
    }

    @Override
    public List<Doctor> getBySpecAndLessFees(String speciality, double fees) throws DoctorNotFoundException {
        List<Doctor>doctorList=doctorRepository.findBySpecAndLessFees(speciality,fees);
        if(doctorList.isEmpty())
            throw new DoctorNotFoundException("doc not found");
        Collections.sort(doctorList,(d1,d2)->((Double)(d1.getFees())).compareTo(d2.getFees()));
        return doctorList;
    }

    @Override
    public List<Doctor> getBySpecAndRatings(String speciality, int ratings) throws DoctorNotFoundException {
        List<Doctor>doctorList=doctorRepository.findBySpecAndRatings(speciality,ratings);
        if(doctorList.isEmpty())
            throw new DoctorNotFoundException("doc not found");
        Collections.sort(doctorList,(d1, d2) ->((Integer)(d2.getRatings())).compareTo(d1.getRatings()));
        return doctorList;
    }

    @Override
    public List<Doctor> getBySpecAndNameContains(String speciality, String doctorName) throws DoctorNotFoundException {
        List<Doctor>doctorList=doctorRepository.findBySpecAndNameContains(speciality,doctorName);
        if(doctorList.isEmpty())
            throw new DoctorNotFoundException("doc not found by name");
        Collections.sort(doctorList,(d1,d2)->((String)(d2.getDoctorName())).compareTo(d1.getDoctorName()));
        return doctorList;
    }
}
