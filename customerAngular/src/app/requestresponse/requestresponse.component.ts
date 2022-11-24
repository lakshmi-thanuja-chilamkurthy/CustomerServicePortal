import { Component, Input, OnInit } from '@angular/core';
import { CustomerserviceService } from '../customerservice.service';
import { Servicerequest } from '../servicerequest';

@Component({
  selector: 'app-requestresponse',
  templateUrl: './requestresponse.component.html',
  styleUrls: ['./requestresponse.component.scss']
})
export class RequestresponseComponent implements OnInit {
  @Input() requests:Servicerequest[]=[];
  constructor(private service:CustomerserviceService) { }

  ngOnInit(): void {
  }

  

}
