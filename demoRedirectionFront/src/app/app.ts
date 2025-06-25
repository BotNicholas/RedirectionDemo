import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected title = 'demoRedirectionFront';

  constructor(private http:HttpClient) {}

  giveFive() {
    this.http.get("http://localhost:8080/redirect-me", {observe: 'response'}).subscribe(res => {
      console.log(res);
    })
  }
}
