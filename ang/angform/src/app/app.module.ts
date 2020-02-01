// import { BrowserModule } from '@angular/platform-browser';
// import { NgModule } from '@angular/core';

// import { AppRoutingModule } from './app-routing.module';
// import { AppComponent } from './app.component';
// import { HeroFormComponent } from './hero-form/hero-form.component';

// @NgModule({
//   declarations: [
//     AppComponent,
//     HeroFormComponent
//   ],
//   imports: [
//     BrowserModule,
//     AppRoutingModule
//   ],
//   providers: [],
//   bootstrap: [AppComponent]
// })
// export class AppModule { }
import { NgModule }      from '@angular/core';  
import { BrowserModule } from '@angular/platform-browser';  
import { FormsModule }   from '@angular/forms';  
import { AppComponent }  from './app.component';  
import { HeroFormComponent } from './hero-form/hero-form.component';  
@NgModule({  
  imports: [  
    BrowserModule,  
    FormsModule  
  ],  
  declarations: [  
    AppComponent,  
    HeroFormComponent  
  ],  
  providers: [],  
  bootstrap: [ AppComponent ]  
})  
export class AppModule { }  