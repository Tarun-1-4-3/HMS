
package com.apollo.hms.repository;

import com.apollo.hms.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {


}
