package com.umanizales.listas_se.listasse.service;

import com.umanizales.listas_se.listasse.model.Kid;
import com.umanizales.listas_se.listasse.model.ListSE;

import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class ListSEService {
    private ListSE list;

    public ListSEService() {
        list = new ListSE();
        list.add(new Kid("1002654940", "Jeronimo Murillo", (byte) 19, 'M'));
        list.add(new Kid("34344343", "Pedro Pérez", (byte) 16, 'M'));
        list.add(new Kid("4545488","Rosa perez",(byte)19, 'F'));

    }

    public String add(Kid kid) {
        list.add(kid);
        return "kid adicionado exitosamente";

    }


    public String addFirst(Kid kid)
    { list.addFirst(kid);
        return "el niño se añadio al incio";}
    public String AddFinal(Kid kid){
        list.addFinal(kid);
        return "el niño se añadio al final";

    }
    public  String girlsFirst(Kid kid){
        list.girlsFirst(kid);
        return "se añadieron las niñas al inicio";
    }
    public String invert(Kid kid){
        list.invert(kid);
        return "lista invertida";
    }
    public  String deletePosition(Kid kid){
        list.invert(kid);
        return "posicion eliminada";}
    public  String count(Kid kid){
        list.invert(kid);
        return "lista recorrida";}
}

