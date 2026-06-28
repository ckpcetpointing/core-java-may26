package com.jsn.core.java.clone;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class EngStudent extends Student {

     private String major;

     //I want one Has Class for EngStudent and one for MedicalStudent
    private Subjects subjects;

    public EngStudent(String name, int age, String grade, Date enrollmentDate) {
        super(name, age, grade, enrollmentDate);
    }

    public EngStudent(String name, int age, String grade, Date enrollmentDate, String major, Subjects subjects) {
        super(name, age, grade, enrollmentDate);
        this.major = major;
        this.subjects = subjects;
    }


    @Override
    public EngStudent clone() throws CloneNotSupportedException {
        EngStudent cloned = (EngStudent) super.clone();
        cloned.setSubjects(subjects.clone());
        // No need to clone 'major' as it's a String (immutable)
        return cloned;
    }
}
