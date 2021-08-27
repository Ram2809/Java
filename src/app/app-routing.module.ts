import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HODModuleComponent } from './hodmodule/hodmodule.component';
const routes: Routes = [{path:'app-hodmodule',component:HODModuleComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
