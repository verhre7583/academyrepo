import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class GreetingService {

  private greetingMessage = "Hi, I am here";

  constructor() { }

  getGreeting(){
    return this.greetingMessage;
  }

}
