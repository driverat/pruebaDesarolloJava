import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProfesorService {
	
	private baseUrl = 'http://localhost:10090//prueba/v1/profesores';

   constructor(private http: HttpClient) { }
  
	getProfesoresList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
}