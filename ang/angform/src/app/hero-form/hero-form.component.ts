// import { Component, OnInit } from '@angular/core';

// @Component({
//   selector: 'app-hero-form',
//   templateUrl: './hero-form.component.html',
//   styleUrls: ['./hero-form.component.css']
// })
// export class HeroFormComponent implements OnInit {

//   constructor() { }

//   ngOnInit() {
//   }

// }

import { Component } from '@angular/core';  
import { Hero }    from '../hero';  
import { userInfo } from 'os';
import { FormControl } from '@angular/forms';
@Component({  
  selector: 'app-hero-form',  
  templateUrl: './hero-form.component.html',  
  styleUrls: ['./hero-form.component.css']  
})  
export class HeroFormComponent {  
  powers = ['Really Smart', 'Super Flexible',  
            'Super Hot', 'Weather Changer'];  
  model = new Hero(18, 'Dr IQ', this.powers[0], 'Chuck Overstreet');  
  submitted = false;  
  onSubmit() { this.submitted = true; }  
  // TODO: Remove this when we're done  
  get diagnostic() { return JSON.stringify(this.model); }  
  
} 
// constructor()
// {
//   user:userInfo;
//   userform = new formgroup({
//     id:new FormControl(),
//     id:new FormControl(),
//   });
//   display()
//   {
//     this.NamedNodeMap.setvalue;
//   }
// } 
