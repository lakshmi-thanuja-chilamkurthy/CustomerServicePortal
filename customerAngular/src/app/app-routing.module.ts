import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreaterequestComponent } from './createrequest/createrequest.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { ListofcustomersComponent } from './listofcustomers/listofcustomers.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { RequestbystatusComponent } from './requestbystatus/requestbystatus.component';
import { RequestlistComponent } from './requestlist/requestlist.component';
import { UpdatecustomerdetailsComponent } from './updatecustomerdetails/updatecustomerdetails.component';

const routes: Routes = [
  { path:'register', component: RegisterComponent},
  { path:'home', component: HomeComponent},
  {path:'login', component: LoginComponent},
  {path:'', component: HeaderComponent},
  {path:'createRequest',component:CreaterequestComponent},
  {path:'getCustomers',component:ListofcustomersComponent},
  {path:'requestByStatus',component:RequestbystatusComponent},
  {path:'requestsList',component:RequestlistComponent},
  {path:'updateCustomer',component:UpdatecustomerdetailsComponent}



];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
