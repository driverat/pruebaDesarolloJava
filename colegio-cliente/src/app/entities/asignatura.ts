import { Estudiante } from "./estudiante";
import { Observable } from "rxjs";

export class Asignatura {
    constructor(public id:number, public nombre:string, public estudiantes: any[]) {
    }

}