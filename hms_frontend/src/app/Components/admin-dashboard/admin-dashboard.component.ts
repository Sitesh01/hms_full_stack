import { Component } from '@angular/core';
import { Patient } from 'src/app/Class/patient';
import { PatientServiceService } from 'src/app/Services/patient-service.service';

@Component({
  selector: 'app-admin-dashboard',
  templateUrl: './admin-dashboard.component.html',
  styleUrls: ['./admin-dashboard.component.css']
})
export class AdminDashboardComponent {

  patients:Patient[]=[];

  constructor(private patService : PatientServiceService) {}

  ngOnInit():void{
    this.getPatients();
  }

  getPatients(){
    this.patService.getPatientList().subscribe((data) => {
      this.patients = data;
    });
  }
}
