import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { FormGroup } from '@angular/forms';
import { HodSignUp } from '../hod-sign-up';
import { HodService } from '../hod.service';
@Component({
  selector: 'app-add-hod-details',
  templateUrl: './add-hod-details.component.html',
  styleUrls: ['./add-hod-details.component.css']
})
export class AddHodDetailsComponent implements OnInit {
  HODSignUpForm=new FormGroup({
    id:new FormControl(''),
    firstName:new FormControl(''),
    lastName:new FormControl(''),
    dateOfBirth:new FormControl(''),
    gender:new FormControl(''),
    qualification:new FormControl(''),
    email:new FormControl(''),
    contactNo:new FormControl(''),
    address:new FormControl(''),
    deptId:new FormControl('')
  });
  
  hodSignUpDetails:HodSignUp=new HodSignUp()
  constructor(private hodService:HodService) { }
  saveHodPersonal()
  {
    this.hodSignUpDetails=new HodSignUp();
    this.hodSignUpDetails.id=this.HODSignUpForm.get('id')?.value;
    console.log(this.hodSignUpDetails.id)
    this.hodSignUpDetails.firstName=this.HODSignUpForm.get('firstName')?.value;
    this.hodSignUpDetails.lastName=this.HODSignUpForm.get('lastName')?.value;
    this.hodSignUpDetails.dateOfBirth=this.HODSignUpForm.get('dateOfBirth')?.value;
    this.hodSignUpDetails.gender=this.HODSignUpForm.get('gender')?.value;
    this.hodSignUpDetails.qualification=this.HODSignUpForm.get('qualification')?.value;
    this.hodSignUpDetails.email=this.HODSignUpForm.get('email')?.value;
    this.hodSignUpDetails.contactNo=this.HODSignUpForm.get('contactNo')?.value;
    this.hodSignUpDetails.address=this.HODSignUpForm.get('address')?.value;
    this.hodSignUpDetails.deptId=this.HODSignUpForm.get('deptId')?.value;
    this.hodService.saveDetails(this.hodSignUpDetails,this.hodSignUpDetails.deptId)
    .subscribe(data=>console.log(data),error=>console.log(error));//.response{window.alert("Added Successfully!")});
    window.alert("HOD Details added successfully!");

  }
  get HodId(){  
    return this.HODSignUpForm.get('id');  
  } 
  get HodFirstName(){  
    return this.HODSignUpForm.get('firstName');  
  }
  get HodLastname(){  
    return this.HODSignUpForm.get('lastName');  
  } 
  get HodDateOfBirth(){  
    return this.HODSignUpForm.get('dateOfBirth');  
  }
  get HodGender(){  
    return this.HODSignUpForm.get('gender');  
  }
  get HodQualification(){  
    return this.HODSignUpForm.get('qualification');  
  }
  get HodEmail(){  
    return this.HODSignUpForm.get('email');  
  }
  get HodContactNo(){  
    return this.HODSignUpForm.get('contactNo');  
  }
  get HodAddress(){  
    return this.HODSignUpForm.get('address');  
  }
  get HodDeptId(){  
    return this.HODSignUpForm.get('deptId');  
  }
  ngOnInit(): void {
  }

}
