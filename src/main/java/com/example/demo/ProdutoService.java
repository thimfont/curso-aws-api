package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class ProdutoService {
    private List produtos;

    public ProdutoService() {
        this.produtos = new ArrayList<>();
    }

    public void adiciona(final Produto produto) {
        this.produtos.add(produto);
    }

    public List lista() {
        return Collections.unmodifiableList(produtos);
    }
}
