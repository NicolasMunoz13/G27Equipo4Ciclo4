import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FileUploadService } from './file-upload.service';

@Component({
  selector: 'app-productos',
  templateUrl: './productos.component.html',
  styleUrls: ['./productos.component.css']
})
export class ProductosComponent implements OnInit {

  
  constructor(private objetohttp:HttpClient, private fileUploadService: FileUploadService) { }

  res:any;
  contenido:any;
  urlapi:string= "http://localhost:8080/api/productos";


  ngOnInit(){
    this.res = this.objetohttp.get(this.urlapi);
    this.res.subscribe((data:any[])=>{
      this.contenido = data;
      console.log(this.contenido);
    }
    )
  }

  //Metodo Post
  codigorespuesta: number = 0;
  res2: any;

  resultados: any;

  shortLink: string = "";
  
  file!: File;

  recibido: boolean = false;

  onChange(event: any) {
    this.file = event.target.files[0];
  }

  async onUpload() {
   console.log(this.file);
   this.resultados = await this.fileUploadService.upload(this.file);
   console.log(this.resultados);
  }


}
