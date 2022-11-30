import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer } from './customer';
import { Servicerequest } from './servicerequest';

const RegisterApi="http://localhost:9090/customer/register";
const Login="http://localhost:9090/customer/login";
@Injectable({
  providedIn: 'root'
})
export class CustomerserviceService {

  constructor(private client:HttpClient) { }

  register(user :Customer) :Observable<any>{
    console.log(user,JSON.stringify(user));
    return this.client.post(RegisterApi,user);
    
  }

  login(user:Customer) {
  return this.client.post(Login,user);
  }

  createrequest( req: Servicerequest,customerId:number) : Observable<any>
  {
     
      return this.client.post("http://localhost:9090/serviceRequest/"+customerId+"/createRequest",req);
  }

  getCustomers(): Observable<Customer[]>{
    return this.client.get<Customer[]>("http://localhost:9090/customer/getCustomers");
  }

  getrequest(status:String,customerId:number): Observable<any>{
    return this.client.get("http://localhost:9090/serviceRequest/findReqbyStatus/"+customerId+"/"+status);
  }

  getrequests(): Observable<Servicerequest[]>{
    return this.client.get<Servicerequest[]>("http://localhost:9090/serviceRequest/getListOfRequests");
  }

  findcustomer(customerId:number){
    return this.client.get("http://localhost:9090/customer/getCustomerId/"+customerId)
  }
  update(user :Customer,customerId:number) :Observable<any>{
    console.log(user,JSON.stringify(user));
    return this.client.put("http://localhost:9090/customer/updateCustomerDetails/"+customerId,user);
    
  }

  updaterequest(request :Servicerequest,customerId:number,reqId:number) :Observable<any>{
    console.log(request,JSON.stringify(request));
    return this.client.put("http://localhost:9090/serviceRequest/"+customerId+"/updateRequest/"+reqId,request);
    
  }

  findrequest(reqId:number){
    return this.client.get("http://localhost:9090/serviceRequest/findRequestByID/"+reqId)
  }
}
