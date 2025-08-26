package com.vini.projeto.Controller;

import com.vini.projeto.Service.FestaService;
import com.vini.projeto.Model.FestaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping (name = "/festas")
@RestController
public class FestaController {

    @Autowired
    private FestaService festaService;

    @GetMapping
    public ResponseEntity <List<FestaModel>> findALL(){
        List<FestaModel> response = festaService.findALL();
        return ResponseEntity.ok().body(response);
    }

}
