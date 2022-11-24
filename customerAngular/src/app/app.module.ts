import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';

import { RegisterComponent } from './register/register.component';
import { HeaderComponent } from './header/header.component';
import { CreaterequestComponent } from './createrequest/createrequest.component';
import { ListofcustomersComponent } from './listofcustomers/listofcustomers.component';
import { UpdaterequestComponent } from './updaterequest/updaterequest.component';
import { UpdatecustomerdetailsComponent } from './updatecustomerdetails/updatecustomerdetails.component';
import { RequestbystatusComponent } from './requestbystatus/requestbystatus.component';
import { RequestlistComponent } from './requestlist/requestlist.component';
import { HomeComponent } from './home/home.component';
import { RequestresponseComponent } from './requestresponse/requestresponse.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    HeaderComponent,
    CreaterequestComponent,
    ListofcustomersComponent,
    UpdaterequestComponent,
    UpdatecustomerdetailsComponent,
    RequestbystatusComponent,
    RequestlistComponent,
    HomeComponent,
    RequestresponseComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
