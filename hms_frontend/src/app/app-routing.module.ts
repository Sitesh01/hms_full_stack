import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminDashboardComponent } from './Components/admin-dashboard/admin-dashboard.component';
import { AppointmentComponent } from './Components/appointment/appointment.component';

const routes: Routes = [
  {path:'admin', component:AdminDashboardComponent},
  {path:'appointments', component:AppointmentComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
