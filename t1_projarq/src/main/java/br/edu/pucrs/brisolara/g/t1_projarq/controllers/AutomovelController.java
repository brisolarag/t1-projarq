package br.edu.pucrs.brisolara.g.t1_projarq.controllers;

import org.springframework.web.bind.annotation.RestController;

import br.edu.pucrs.brisolara.g.t1_projarq.extensions.MockDatabase;
import br.edu.pucrs.brisolara.g.t1_projarq.models.Automovel;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController()
@RequestMapping("/acmerent")
public class AutomovelController {
    
 @GetMapping("/listaautomoveis")
 public ArrayList<Automovel> listaAutomoveis() {
    return MockDatabase.getAutomoveis();
 }

}
