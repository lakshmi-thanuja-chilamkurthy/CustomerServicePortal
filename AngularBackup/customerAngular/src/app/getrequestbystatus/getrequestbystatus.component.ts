import { Component, OnInit } from '@angular/core';
import { CustomerserviceService } from '../customerservice.service';
import { Servicerequest } from '../servicerequest';

@Component({
  selector: 'app-getrequestbystatus',
  templateUrl: './getrequestbystatus.component.html',
  styleUrls: ['./getrequestbystatus.component.scss']
})
export class GetrequestbystatusComponent implements OnInit {
  request:Servicerequest[]=[];
  status:String="";
  customerId:number=0;
  constructor(private service:CustomerserviceService) { }

  ngOnInit(): void {
  }

  getrequest(){
    console.log(this.customerId,this.status);
    this.service.getrequest(this.status,this.customerId).subscribe((data: Servicerequest[]) => {
      console.log(data);
     
      this.request=data;
      
      console.log(this.request);
      //this.router.navigate(["/SearchResponse"]);
  });
  }

}
