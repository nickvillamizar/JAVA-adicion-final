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
        list.add(new Kid("1002654940","Jeronimo Murillo",(byte)19,'M'));
        list.add(new Kid("34344343","Pedro Pérez",(byte)16,'M'));

    }

    public String add(Kid kid) {
        list.add(kid);
        return "kid adicionado exitosamente";

    }


}