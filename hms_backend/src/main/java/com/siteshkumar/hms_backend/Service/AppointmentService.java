package com.siteshkumar.hms_backend.Service;

import java.util.List;
import com.siteshkumar.hms_backend.Model.AppointmentModel;

public interface AppointmentService {
    public List<AppointmentModel> getAllAppointments();
    public boolean createAppointments(AppointmentModel appointmentModel);
}
