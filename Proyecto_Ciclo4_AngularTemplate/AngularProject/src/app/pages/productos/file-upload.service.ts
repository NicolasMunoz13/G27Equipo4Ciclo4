import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FileUploadService {

  baseApiUrl = "http://localhost:8080/api/productos"

  constructor(private http:HttpClient) { }

  resultados = Array();

  upload(file: any): Promise<any[]>{
    return new Promise<any[]>((resolve, reject) =>{

      //leyendo el contenido
      var reader = new FileReader();
      reader.onloadend = (e) => {

        let lines = reader.result as string;

        let separados = lines.split("\n");

        for (let lineaactual of separados) {
          lineaactual.replace(";", ",");
          let columnas = lineaactual.split(",", 6);
          this.http.post(
            this.baseApiUrl,
            {
              precioventa: columnas[5],
              preciocompra: columnas[4],
              nombreproducto: columnas[3],
              nitproveedor: columnas[2],
              ivacompra: columnas[1],
              codigoproducto: columnas[0]
            },
            { observe: 'response' }).subscribe(
              (response: any) => {
                let resaux = [];
                resaux[0] = response.status;
                this.resultados.push(resaux);
              }
            );
        }
        //console.log(this.resultados);
        resolve(this.resultados);
      };
      reader.readAsText(file);

    });
  }

}
