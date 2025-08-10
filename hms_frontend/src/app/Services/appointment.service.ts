import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Appointment } from '../Class/appointment';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AppointmentService {
  constructor(private http : HttpClient) { }

  private baseUrl = "http://localhost:8080/api/v1";

  ngOnInit(): void {

  }

  getAllAppointments():Observable<Appointment[]>{
    return this.http.get<Appointment[]>(`${this.baseUrl}/appointments`);
  }
}
