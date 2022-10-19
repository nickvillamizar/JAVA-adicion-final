package com.umanizales.listas_se.listasse.service;

import com.umanizales.listas_se.listasse.model.Kid;
import com.umanizales.listas_se.listasse.model.KidByPositionDTO;
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
        return "kid adicionado exitosamente";  ///se retorna mensaje

    }


    public String addFirst(Kid kid)
    { list.addFirst(kid);
        return "el niño se añadio al incio";}
    public String AddFinal(Kid kid){
        list.addFinal(kid);
        return "el niño se añadio al final"; ///se retorna mensaje

    }

    public String invert(){
        list.invert();
        return "lista invertida";
    }
    public  String deletePosition(){
        list.invert();
        return "posicion eliminada";}
    public  String count(Kid kid){
        list.invert();
        return "lista recorrida";}
    public String addByPosition(KidByPositionDTO kidByPositionDTO){
        if(kidByPositionDTO.getPosition()>0
                && kidByPositionDTO.getPosition() <= (list.getSize()+1))
        {
            list.addByPosition(kidByPositionDTO.getPosition(),
                    kidByPositionDTO.getKid());
            return "Adicionado exitosamente";
        }
        else {
            return "Posición no permitida"; ///se retorna mensaje
        }

        }
    public String girlsFirst()
    {
        list.girlsFirst();
        return "Se ha ejecutado la mezcla"; ///se retorna mensaje
    }


    }
