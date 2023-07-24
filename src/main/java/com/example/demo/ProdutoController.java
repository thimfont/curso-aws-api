package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService service;

    @GetMapping
    public ResponseEntity<List<Produto>> lista() {
        return ResponseEntity.ok(service.lista());
    }

    @PostMapping
    public void novo(@RequestBody Produto produto) {
        service.adiciona(produto);
    }
}
