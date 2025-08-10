import { Component } from '@angular/core';
import { Appointment } from 'src/app/Class/appointment';
import { AppointmentService } from 'src/app/Services/appointment.service';

@Component({
  selector: 'app-appointment',
  templateUrl: './appointment.component.html',
  styleUrls: ['./appointment.component.css']
})
export class AppointmentComponent {

  appointment:Appointment[]=[];

  constructor(private appService : AppointmentService) {}

  ngOnInit():void {
    this.getAppointments();
  }

  getAppointments(){
    this.appService.getAllAppointments().subscribe((data) => {
      this.appointment = data;
    });
  }
}
