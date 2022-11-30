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

import { RequestlistComponent } from './requestlist/requestlist.component';
import { HomeComponent } from './home/home.component';

import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { GetrequestbystatusComponent } from './getrequestbystatus/getrequestbystatus.component';
import { ResponseComponent } from './response/response.component';
import { UpdatecustomerComponent } from './updatecustomer/updatecustomer.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    HeaderComponent,
    CreaterequestComponent,
    ListofcustomersComponent,
    UpdaterequestComponent,

    RequestlistComponent,
    HomeComponent,
    GetrequestbystatusComponent,
    ResponseComponent,
    UpdatecustomerComponent,

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
