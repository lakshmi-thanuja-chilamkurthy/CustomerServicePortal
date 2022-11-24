import { Component, OnInit } from '@angular/core';
import { CustomerserviceService } from '../customerservice.service';
import { Servicerequest } from '../servicerequest';

@Component({
  selector: 'app-requestlist',
  templateUrl: './requestlist.component.html',
  styleUrls: ['./requestlist.component.scss']
})
export class RequestlistComponent implements OnInit {
  requests:Servicerequest[]=[]
  constructor(private service:CustomerserviceService) { }

  ngOnInit(): void {
    this.service.getrequests().subscribe((data: Servicerequest[]) => {
      console.log(data);
      this.requests = data;
  });
  }

}
