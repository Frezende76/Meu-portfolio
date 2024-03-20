import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-first-component',
  templateUrl: './first-component.component.html',
  styleUrl: './first-component.component.css'
})
export class FirstComponentComponent implements OnInit{
  name: string = 'Fabricio Rezende';
  age: number = 48;
  job = 'Programador';
  hobbies = ['Trabalhar', 'Jogar', 'Estudar'];

  cars =
  {
    'name': 'Polo',
    'year': 2019
  }

  constructor() {}

  ngOnInit(): void {}

}
