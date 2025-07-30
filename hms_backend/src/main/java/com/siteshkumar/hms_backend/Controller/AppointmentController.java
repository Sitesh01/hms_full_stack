package com.siteshkumar.hms_backend.Controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.siteshkumar.hms_backend.Model.AppointmentModel;
import com.siteshkumar.hms_backend.Service.AppointmentService;

@RestController
@RequestMapping("/api/v1")
public class AppointmentController {
    
    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService){
        this.appointmentService = appointmentService;
    }

    @GetMapping("/appointments")
    public List<AppointmentModel> getAllAppointments(){
        return appointmentService.getAllAppointments();
    }

    @PostMapping("/appointments")
    public ResponseEntity<String> createAppointments(@RequestBody AppointmentModel appointmentModel){
        boolean success = appointmentService.createAppointments(appointmentModel);
        if(success)
            return ResponseEntity.status(HttpStatus.ACCEPTED).body("Appointments created Successfully!");
        else
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Appointments not created!");
    }
}
