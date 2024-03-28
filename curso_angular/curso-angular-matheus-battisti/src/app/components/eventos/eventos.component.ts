import { Component, OnInit } from '@angular/core';



@Component({
  selector: 'app-eventos',
  templateUrl: './eventos.component.html',
  styleUrl: './eventos.component.css'
})
export class EventosComponent  implements OnInit{
  show: boolean = false;
  showMsg: boolean = false;
  textoBotao: string = 'Mostrar mensagem'
  name = 'Fabricio Rezende';


  constructor() {}

  ngOnInit(): void {}

  showMessage(): void {
    this.show = !this.show; //faz o conteudo da mensagem ser mostrado

  }

  // Funcão para mostrar e ocultar uma mensagem na tela e
  // troca a mensagem do botão após clicar nele



  trocarTexto(): void {

      this.showMsg = !this.showMsg;
      if (this.textoBotao === 'Mostrar mensagem'){
        this.textoBotao = 'Ocultar mensagem'
      }else {
        this.textoBotao = 'Mostrar mensagem'
      }

  }



}
