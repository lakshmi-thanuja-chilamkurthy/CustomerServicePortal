import { Component, OnInit } from '@angular/core';
import { Customer } from '../customer';
import { CustomerserviceService } from '../customerservice.service';

@Component({
  selector: 'app-listofcustomers',
  templateUrl: './listofcustomers.component.html',
  styleUrls: ['./listofcustomers.component.scss']
})
export class ListofcustomersComponent implements OnInit {
  customers: Customer[]=[]
  constructor(private service :CustomerserviceService) { }

  ngOnInit(): void {
    this.service.getCustomers().subscribe((data: Customer[]) => {
      console.log(data);
      this.customers = data;
  });
  }

}
