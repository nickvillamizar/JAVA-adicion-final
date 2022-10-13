package com.umanizales.listas_se.listasse.controller;
import com.umanizales.listas_se.listasse.model.ListSE;
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

   @PostMapping(path = "addKid")
    public String addKId(@RequestBody Kid kid)
    {
        return listSEService.add(kid);
    }
    @PostMapping(path = "addFirst")
    public String addFirst(@RequestBody Kid kid){return listSEService.addFirst(kid);}
    @PostMapping(path = "addEnd")
    public String addEnd(@RequestBody Kid kid){return listSEService.AddFinal(kid);}
    @GetMapping(path = "girlsFisrt")
    public  String girlsFirst(@RequestBody Kid kid){return listSEService.girlsFirst(kid);}

    @GetMapping  (path = "invert")
    public String invert(@RequestBody Kid kid){return  listSEService.invert(kid);}
    @PostMapping(path = "deleteposition")
    public String deletePosition(@RequestBody Kid kid){return  listSEService.deletePosition(kid);}
    @GetMapping (path = "count")
    public String count(@RequestBody Kid kid){return  listSEService.count(kid);}
}


