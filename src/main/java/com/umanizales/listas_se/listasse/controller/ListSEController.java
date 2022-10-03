package com.umanizales.listas_se.listasse.controller;

import com.umanizales.listas_se.listasse.model.Kid;
import com.umanizales.listas_se.listasse.model.Node;
import com.umanizales.listas_se.listasse.service.ListSEService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "listse")
public class ListSEController {
    @Autowired
    private ListSEService listSEService;

    @GetMapping
    public Node getList()
    {
        return listSEService.getList().getHead();
    }

   @PostMapping
    public String addKId(@RequestBody Kid kid)
    {
        return listSEService.add(kid);
    }

}
