package com.siteshkumar.hms_backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.siteshkumar.hms_backend.Entity.PatientEntity;

@Repository
public interface PatientRepository extends JpaRepository<PatientEntity, Long>{

}
