/*import { HomePageComponent } from './modules/home/pages/home-page/home-page.component';*/
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ExampleComponent } from './example/example.component';
/*import { SessionGuard } from '@core/guards/session.guard';*/


const routes: Routes = [ //TODO: router-outlet (Padre)
  {
    path: '', //TODO (Public) Login, Register, Forgot...
    component: ExampleComponent
  },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
