import { Observable } from "rxjs";
import { AsignaturaService } from "../../services/asignatura.service";
import { Asignatura } from "../../entities/asignatura";
import { Component, OnInit } from "@angular/core";
import { Profesor } from "src/app/entities/profesor";
import { ProfesorService } from "src/app/services/profesor.service";
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-asignatura',
  templateUrl: './asignatura.component.html',
  styleUrls: ['./asignatura.component.css']
})
export class AsignaturaComponent implements OnInit {
	
	form: FormGroup;
	asignaturasList: Observable<Asignatura[]> | undefined;
	profesoresList: Observable<Profesor[]> | undefined;
	//estudiantes:any[];

	constructor(private formBuilder: FormBuilder, private asignaturaService: AsignaturaService, private profesorService: ProfesorService) {
		this.form = this.formBuilder.group({
			profSeleccionado: ['', [Validators.required]]
		});

	  }
	  
	  ngOnInit() {
		this.reloadData();
	}
	
	reloadData() {
		this.profesoresList = this.profesorService.getProfesoresList();
	  }

	  get profSeleccionado() {
		return this.form.get('profSeleccionado');
	  }

	submit() { 


		this.asignaturasList = this.asignaturaService.getAsignaturasProfesor(this.profSeleccionado?.value);

	 }




	 




}
