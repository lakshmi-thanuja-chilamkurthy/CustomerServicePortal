import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Customer } from '../customer';
import { CustomerserviceService } from '../customerservice.service';

@Component({
  selector: 'app-updatecustomerdetails',
  templateUrl: './updatecustomerdetails.component.html',
  styleUrls: ['./updatecustomerdetails.component.scss']
})
export class UpdatecustomerdetailsComponent implements OnInit {
  users: Customer=new Customer();
  customerId:number=0;

  constructor(private service :CustomerserviceService,public router:Router) { }

  ngOnInit(): void {
    // console.log(this.users)
  }

  findcustomer(){
    this.service.findcustomer(this.customerId).subscribe((data : any) =>{
      this.users=data;
      console.log(data)
    })
  }
  update(){
    console.log("register started"+this.users);
    
    this.service.update(this.users,this.customerId).subscribe((data) => {
      console.log(data);
      alert("Update Success")
      this.router.navigateByUrl('');
  }
    );
}

}
