package apirest.springboot.personapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people") /* Caminho principal da API*/
public class PersonController {

    @GetMapping /*Mapeando usando o metodo GET*/
    public String getBook(){
        return "API Test!";
    }
}
