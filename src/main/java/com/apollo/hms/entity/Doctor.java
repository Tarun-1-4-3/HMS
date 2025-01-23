
package com.apollo.hms.entity;

import com.apollo.hms.enums.Gender;
import com.apollo.hms.enums.Specialisation;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
//@Table(name=doctors) used for change table name
public class Doctor {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String name;
    @Enumerated(EnumType.STRING)
    public Specialisation specialisation;
    @Enumerated(EnumType.STRING)
    public Gender gender;
    public Long salary;
}