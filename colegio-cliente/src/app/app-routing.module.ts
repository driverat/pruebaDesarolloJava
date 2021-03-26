import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AsignaturaComponent } from './components/asignaturas/asignatura.component';
import { ProfesorComponent } from './components/profesores/profesor.component';

const routes: Routes = [
  { path: '', redirectTo: 'asignatura', pathMatch: 'full' },
  { path: 'asignaturas', component: AsignaturaComponent },

  { path: '', redirectTo: 'profesor', pathMatch: 'full' },
  { path: 'profesores', component: ProfesorComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
