package com.siteshkumar.hms_backend.Service;

import java.util.List;
import com.siteshkumar.hms_backend.Model.MedicineModel;

public interface MedicineService {
    public List<MedicineModel> getAllMedicine();
    public boolean createMedicine(MedicineModel medicineModel);
}
