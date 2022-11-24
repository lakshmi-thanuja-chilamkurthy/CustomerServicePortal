import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RequestresponseComponent } from './requestresponse.component';

describe('RequestresponseComponent', () => {
  let component: RequestresponseComponent;
  let fixture: ComponentFixture<RequestresponseComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RequestresponseComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RequestresponseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
