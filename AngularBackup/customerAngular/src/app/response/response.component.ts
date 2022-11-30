import { Component, Input, OnInit } from '@angular/core';
import { Servicerequest } from '../servicerequest';

@Component({
  selector: 'app-response',
  templateUrl: './response.component.html',
  styleUrls: ['./response.component.scss']
})
export class ResponseComponent implements OnInit {
  @Input() 
  requests:Servicerequest[]=[];
  constructor() { }

  ngOnInit(): void {
  }

}
