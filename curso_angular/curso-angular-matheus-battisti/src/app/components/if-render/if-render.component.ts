import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-if-render',
  templateUrl: './if-render.component.html',
  styleUrl: './if-render.component.css'
})
export class IfRenderComponent implements OnInit {
  canShow: boolean = true;
  name = 'Fabricio';


  constructor() {}

  ngOnInit(): void {

  }


}
