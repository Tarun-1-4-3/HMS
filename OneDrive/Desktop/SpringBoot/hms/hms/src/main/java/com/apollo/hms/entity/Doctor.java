
package com.apollo.hms.entity;

import com.apollo.hms.enums.Gender;
import com.apollo.hms.enums.Specialisation;
import lombok.Data;

@Data
public class Doctor {
    public Long id;
    public String name;
    public Specialisation specialisation;
    public Gender gender;
    public Long salary;

}