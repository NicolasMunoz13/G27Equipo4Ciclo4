import { Component } from '@angular/core';

@Component({
    selector: 'icons-cmp',
    moduleId: module.id,
    templateUrl: 'icons.component.html'
})

export class IconsComponent{

    title = 'angularProyecto';

  user_correct: string = "admin";
  pass_correct:string = "admin123456";

  user:string = "";
  pass:string ="";

  data_correct:number = -1;

  comparar(){
    if(this.user===this.user_correct){
      this.data_correct = 1;
      if(this.pass==this.pass_correct){
        this.data_correct = 1;
      }else{
        this.data_correct = 0;
      }
    }else{
      this.data_correct = 0;
    }
  }

}
