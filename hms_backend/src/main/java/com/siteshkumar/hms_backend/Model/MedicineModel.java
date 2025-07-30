package com.siteshkumar.hms_backend.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicineModel {

    private Long id;
    private String drugName;
    private String stock;
}
