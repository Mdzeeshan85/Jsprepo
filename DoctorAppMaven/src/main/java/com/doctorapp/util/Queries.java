package com.doctorapp.util;

public class Queries {
    public static final String INSERTQUERY="insert into doctor(doctor_name,speciality,experience,ratings,fees)values(?,?,?,?,?)";
    public static final String UPDATEQUERY="update doctor set fees=? where doctor_id=?";
    public static final String DELETEQUERY="delete from doctor where doctor_id=?";
    public static final String FINDALLQUERY="select * from doctor";
    public static final String FINDBYSPECIALITYQUERY="select * from doctor where speciality=?";
    public static final String FINDBYSPECIALITYANDEXPQUERY="select * from doctor where speciality=? and experience=?";
    public static final String FINDBYSPECIALITYANDRATINGQUERY="select * from doctor where speciality=? and ratings=?";
    public static final String FINDBYSPECIALITYANDFEESQUERY="select * from doctor where speciality=? and fees=?";
    public static final String FINDBYSPECIALITYANDNAMEQUERY="select * from doctor where speciality=? and doctor_name=?";
    public static final String FINDBYIDQUERY="select * from doctor where doctor_id=? ";
}
