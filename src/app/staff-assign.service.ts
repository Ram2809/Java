import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StaffAssignService {
  private baseUrl='http://localhost:8081/staffAssign'
  constructor(private http:HttpClient) { }
  getStaffByDept(deptId:any):Observable<any>
  {
    return this.http.get(`${this.baseUrl}`+'/departmentInsertion/'+`${deptId}`+'/getAllStaffsAssign')
  }
}
