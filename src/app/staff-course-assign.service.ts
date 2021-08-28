import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StaffCourseAssignService {
  private baseUrl='http://localhost:8081/staffCourseAssign'
  constructor(private http:HttpClient) { }
  saveStaffCourseAssignDetails(staffId:any,courseCode:any,staffCourseAssignDetails:object):Observable<any>
  {
    return this.http.post(`${this.baseUrl}`+'/addStaffAssign/'+`${staffId}`+'/addCourse/'+`${courseCode}`,staffCourseAssignDetails);
  }
}
