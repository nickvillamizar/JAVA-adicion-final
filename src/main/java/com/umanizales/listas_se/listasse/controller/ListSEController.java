package com.umanizales.listas_se.listasse.controller;

import com.umanizales.listas_se.listasse.model.Node;
import com.umanizales.listas_se.listasse.service.ListSEService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
