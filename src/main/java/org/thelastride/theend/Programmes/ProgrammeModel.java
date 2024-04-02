package org.thelastride.theend.Programmes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "programmes")
public class ProgrammeModel {
    @Id
     private String programmeId;
    @Column
    private String ProgrammeName;
    @Column private String Department;
    @Column private String Chairperson;
    @Column private int numberOfStudents;

    public String getId() {
        return programmeId;
    }

    public void setId(String programmeId) {
        this.programmeId = programmeId;
    }

    public String getProgrammeId() {
        return programmeId;
    }

    public void setProgrammeId(String programmeId) {
        this.programmeId = programmeId;
    }

    public String getProgrammeName() {
        return ProgrammeName;
    }

    public void setProgrammeName(String programmeName) {
        ProgrammeName = programmeName;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getChairperson() {
        return Chairperson;
    }

    public void setChairperson(String chairperson) {
        Chairperson = chairperson;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
}
