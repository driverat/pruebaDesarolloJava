import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AsignaturaService {
	
	private baseUrl = 'http://localhost:10090//prueba/v1/asignaturas';

	//private httpHeaders = new HttpHeaders({ 'ContentType': 'application/json' });

   constructor(private http: HttpClient) { }
  
	getAsignatura(id: number): Observable<Object> {
		return this.http.get(`${this.baseUrl}/${id}`);
	}
	
	getAsignaturasList(): Observable<any> {
    	return this.http.get(`${this.baseUrl}`);
	}

	getAsignaturasProfesor(id: number): Observable<any> {
		return this.http.get(`${this.baseUrl}/profesor/${id}`);
	}

		//return this.http.get(`${this.baseUrl}/profesor/${id}`);
		//return this.http.get(`${this.baseUrl}/profesor/${id}`).subscribe(data => {   // data is already a JSON object
		//	console.log(data['someProperty']);
		//});
		//return this.http.get(`${this.baseUrl}/profesor/${id}`).pipe(
		//	map(estudiantes => estudiantes as Observable<Estudiante[]>));
	//}
}
