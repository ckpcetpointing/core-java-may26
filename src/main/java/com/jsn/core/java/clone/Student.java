package com.jsn.core.java.clone;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;


/*/ Create Audit Transaction class  - make it immutable

AuditTransaction  --> id, amount, date[util], description, type (debit/credit)
 --Provide clonning support*/

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Student implements Cloneable {

    private String name; //immutable
    private int age; //primitive
    private String grade; //immutable
    private Date enrollmentDate; //mutable  *************

    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }

    public Date getEnrollmentDate() {
        return (Date) enrollmentDate.clone();
    }
}
