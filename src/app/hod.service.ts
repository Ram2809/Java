import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {HttpClient} from "@angular/common/http"
@Injectable({
  providedIn: 'root'
})
export class HodService {
  private baseUrl = 'http://localhost:8081/hod';  
  constructor(private http:HttpClient) { }
  getDetails():Observable<any>
  { 
      return this.http.get(`$(this.baseUrl)`+'/getHodDetails)');
  }
  saveDetails(hodSignupDetails:object,deptId:any):Observable<any>{
    console.log("add method");
    return this.http.post(`${this.baseUrl}`+'/department/'+`${deptId}`+'/hodInsertion',hodSignupDetails);
  }
  
}
