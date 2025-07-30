package com.siteshkumar.hms_backend.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientModel {

    private Long id;
    private String fullName;
    private int age;
    private String bloodGroup;
    private String prescription;
    private String dose;
    private int fees;
    private String urgency;
}
