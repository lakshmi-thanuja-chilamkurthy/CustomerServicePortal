import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RequestbystatusComponent } from './requestbystatus.component';

describe('RequestbystatusComponent', () => {
  let component: RequestbystatusComponent;
  let fixture: ComponentFixture<RequestbystatusComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RequestbystatusComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RequestbystatusComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
