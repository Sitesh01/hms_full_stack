import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Patient } from '../Class/patient';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PatientServiceService {

  constructor(private http : HttpClient) { }

  private baseUrl = "http://localhost:8080/api/v1";

  getPatientList() : Observable<Patient[]>{
    return this.http.get<Patient[]>(`${this.baseUrl}/patients`);
  }

}
