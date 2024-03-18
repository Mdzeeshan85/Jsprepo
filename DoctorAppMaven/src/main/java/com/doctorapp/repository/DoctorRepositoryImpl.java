package com.doctorapp.repository;

import com.doctorapp.exception.IdNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.util.DoctorDB;
import com.doctorapp.util.Queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DoctorRepositoryImpl implements IDoctorRepository {
    @Override
    public void addDoctor(Doctor doctor) {
        try(Connection connection= DoctorDB.openConnection();
            PreparedStatement statement=connection.prepareStatement(Queries.INSERTQUERY);){
            statement.setString(1, doctor.getDoctorName());
            statement.setString(2, doctor.getSpeciality());
            statement.setInt(3,doctor.getExperience());
            statement.setInt(4,doctor.getRatings());
            statement.setDouble(5,doctor.getFees());
            boolean result=statement.execute();
            System.out.println("one row ins"+!result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateDoctor(int doctorId, double fees) {
        try(Connection connection= DoctorDB.openConnection();
            PreparedStatement statement=connection.prepareStatement(Queries.UPDATEQUERY);){
            statement.setInt(1,doctorId);
            statement.setDouble(2,fees);
            int result=statement.executeUpdate();
            System.out.println("one row ins"+result);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void deleteDoctor(int doctorId) {
        try(Connection connection= DoctorDB.openConnection();
            PreparedStatement statement=connection.prepareStatement(Queries.DELETEQUERY);){
            statement.setInt(1,doctorId);
            int result=statement.executeUpdate();
            System.out.println("one row deleted"+result);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public Doctor findById(int doctorId) throws IdNotFoundException {
        Doctor doctor=null;
        try(Connection connection=DoctorDB.openConnection();
        PreparedStatement statement=connection.prepareStatement(Queries.FINDBYIDQUERY);){
           statement.setInt(1,doctorId);
            ResultSet resultSet=statement.executeQuery();
            while(resultSet.next()){
                Integer doctor_id=resultSet.getInt("doctor_id");
                String doctorName=resultSet.getString("doctor_name");
                String speciality=resultSet.getString("speciality");
                double fees=resultSet.getDouble("fees");
                int ratings=resultSet.getInt("ratings");
                int experience=resultSet.getInt("experience");
                doctor=new Doctor(doctor_id,doctorName,speciality,fees,ratings,experience);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return doctor;
    }

    @Override
    public List<Doctor> findAll() {
        List<Doctor>doctorList=new ArrayList<>();
        try(Connection connection=DoctorDB.openConnection();
            PreparedStatement statement=connection.prepareStatement(Queries.FINDALLQUERY);){
            ResultSet resultSet=statement.executeQuery();
            while(resultSet.next()){
                Integer doctor_id=resultSet.getInt("doctor_id");
                String doctorName=resultSet.getString("doctor_name");
                String speciality=resultSet.getString("speciality");
                double fees=resultSet.getDouble("fees");
                int ratings=resultSet.getInt("ratings");
                int experience=resultSet.getInt("experience");
                Doctor doctor=new Doctor(doctor_id,doctorName,speciality,fees,ratings,experience);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return doctorList;
    }

    @Override
    public List<Doctor> findBySpeciality(String speciality) {
        List<Doctor>doctorList=new ArrayList<>();
        try(Connection connection=DoctorDB.openConnection();
            PreparedStatement statement=connection.prepareStatement(Queries.FINDBYSPECIALITYQUERY);){
            statement.setString(1,speciality);
           try( ResultSet resultSet=statement.executeQuery();) {
               while (resultSet.next()) {
                   Integer doctor_id = resultSet.getInt("doctor_id");
                   String doctorName = resultSet.getString("doctor_name");
                   double fees = resultSet.getDouble("fees");
                   int ratings = resultSet.getInt("ratings");
                   int experience = resultSet.getInt("experience");
                   Doctor doctor = new Doctor();
                   doctor.setDoctorName(doctorName);
                   doctor.setDoctorId(doctor_id);
                   doctor.setFees(fees);
                   doctor.setSpeciality(speciality);
                   doctor.setRatings(ratings);
                   doctor.setExperience(experience);
               }
           }
        }catch(Exception e){
            e.printStackTrace();
        }
        return doctorList;
    }

    @Override
    public List<Doctor> findBySpecAndExp(String speciality, int experience) {
        List<Doctor>doctorList=new ArrayList<>();
        try(Connection connection=DoctorDB.openConnection();
            PreparedStatement statement=connection.prepareStatement(Queries.FINDBYSPECIALITYANDEXPQUERY);){
            statement.setString(1,speciality);
            statement.setInt(2,experience);
            try(ResultSet resultSet=statement.executeQuery();) {
                while (resultSet.next()) {
                    Doctor doctor=new Doctor();
                    doctor.setDoctorName(resultSet.getString("doctor_name"));
                    doctor.setDoctorId(resultSet.getInt("doctor_Id"));
                    doctor.setSpeciality(resultSet.getString("speciality"));
                    doctor.setFees(resultSet.getDouble("fees"));
                    doctor.setRatings(resultSet.getInt("ratings"));
                    doctor.setExperience(resultSet.getInt("experience"));
                    doctorList.add(doctor);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return doctorList;
    }

    @Override
    public List<Doctor> findBySpecAndLessFees(String speciality, double fees) {
        List<Doctor>doctorList=new ArrayList<>();
        try(Connection connection=DoctorDB.openConnection();
            PreparedStatement statement=connection.prepareStatement(Queries.FINDBYSPECIALITYANDFEESQUERY);){
            statement.setString(1,speciality);
            statement.setDouble(2,fees);
            try(ResultSet resultSet=statement.executeQuery();) {
                while (resultSet.next()) {
                    Doctor doctor=new Doctor();
                    doctor.setDoctorName(resultSet.getString("doctor_name"));
                    doctor.setDoctorId(resultSet.getInt("doctor_Id"));
                    doctor.setSpeciality(resultSet.getString("speciality"));
                    doctor.setFees(resultSet.getDouble("fees"));
                    doctor.setRatings(resultSet.getInt("ratings"));
                    doctor.setExperience(resultSet.getInt("experience"));
                    doctorList.add(doctor);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return doctorList;
    }

    @Override
    public List<Doctor> findBySpecAndRatings(String speciality, int ratings) {
        List<Doctor>doctorList=new ArrayList<>();
        try(Connection connection=DoctorDB.openConnection();
            PreparedStatement statement=connection.prepareStatement(Queries.FINDBYSPECIALITYANDRATINGQUERY);){
            statement.setString(1,speciality);
            statement.setInt(2,ratings);
            try(ResultSet resultSet=statement.executeQuery();) {
                while (resultSet.next()) {
                    Doctor doctor=new Doctor();
                    doctor.setDoctorName(resultSet.getString("doctor_name"));
                    doctor.setDoctorId(resultSet.getInt("doctor_Id"));
                    doctor.setSpeciality(resultSet.getString("speciality"));
                    doctor.setFees(resultSet.getDouble("fees"));
                    doctor.setRatings(resultSet.getInt("ratings"));
                    doctor.setExperience(resultSet.getInt("experience"));
                    doctorList.add(doctor);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return doctorList;
    }

    @Override
    public List<Doctor> findBySpecAndNameContains(String speciality, String doctorName) {
        List<Doctor>doctorList=new ArrayList<>();
        try(Connection connection=DoctorDB.openConnection();
            PreparedStatement statement=connection.prepareStatement(Queries.FINDBYSPECIALITYANDNAMEQUERY);){
            statement.setString(1,speciality);
            statement.setString(2,"%"+doctorName+"%");
            try(ResultSet resultSet=statement.executeQuery();) {
                while (resultSet.next()) {
                    Doctor doctor=new Doctor();
                    doctor.setDoctorName(resultSet.getString("doctor_name"));
                    doctor.setDoctorId(resultSet.getInt("doctor_Id"));
                    doctor.setSpeciality(resultSet.getString("speciality"));
                    doctor.setFees(resultSet.getDouble("fees"));
                    doctor.setRatings(resultSet.getInt("ratings"));
                    doctor.setExperience(resultSet.getInt("experience"));
                    doctorList.add(doctor);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return doctorList;
    }
}
