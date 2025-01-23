
package com.apollo.hms.entity;

import com.apollo.hms.enums.Gender;
import com.apollo.hms.enums.Symptoms;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String name;

    @Enumerated(EnumType.STRING)
    public Symptoms symptom;

     @Enumerated(EnumType.STRING)
     public Gender gender;
}