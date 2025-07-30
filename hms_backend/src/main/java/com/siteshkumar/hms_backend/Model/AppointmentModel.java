package com.siteshkumar.hms_backend.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentModel {

    private Long id;
    private String name;
    private int age;
    private String symptoms;
    private int tokenNumber;
}
