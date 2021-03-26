import { Observable } from "rxjs";
import { ProfesorService } from "../../services/profesor.service";
import { Profesor } from "../../entities/profesor";
import { Component, OnInit } from "@angular/core";

@Component({
  selector: 'app-profesor',
  templateUrl: './profesor.component.html',
  styleUrls: ['./profesor.component.css']
})
export class ProfesorComponent implements OnInit {
	
	profesores: Observable<Profesor[]> | undefined;

	constructor(private profesorService: ProfesorService) {}

	ngOnInit() {
		this.reloadData();
	}
	
	reloadData() {
		this.profesores = this.profesorService.getProfesoresList();
	  }

}