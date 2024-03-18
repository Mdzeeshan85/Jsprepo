package com.doctorapp.model;

public enum Specialization {
    ORTHO("ORTHOPEDIC"),
    PEDIA("PEDIATRITION"),
    PHYSICIAN("GENERALPHYSICIAN"),
    GYNAEC("GYNACOLOGIST"),
    NEURO("NEUROLOGIST"),
    DERMA("DERMATALOGIST");
    private String speciality;

    Specialization(String speciality) {
        this.speciality = speciality;
    }
    public String getSpeciality()
    {
        return speciality;
    }
}
