package com.mballem.tarefas.web.controller;

import com.mballem.internal.entity.Contato;
import com.mballem.internal.service.ContatoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("tarefas/contatos")
public class ContatoController {

    private final ContatoService service;

    // EXERCICIO 1
    @PostMapping
    public ResponseEntity<Contato> create(@RequestBody Contato contato) {
        Contato save = service.save(contato);
        return ResponseEntity.ok(save);
    }

    // EXERCICIO 2
    @GetMapping("/{id}")
    public ResponseEntity<Contato> getContatoById(@PathVariable Long id) {
        Contato contato = service.getById(id);
        return ResponseEntity.ok(contato);
    }

    // EXERCICIO 3
    @GetMapping()
    public ResponseEntity<Contato> getContatoByNome(@RequestParam String nome) {
        Contato contato = service.getContatoByNome(nome);
        return ResponseEntity.ok(contato);
    }

    // EXERCICIO 4
    @GetMapping("/all")
    public Object getQuantidadeDeContatos() {
        int all = service.getAll();
        return ResponseEntity.ok(all);
    }

    // EXERCICIO 5
    @GetMapping("/data")
    public ResponseEntity<List<Contato>> getContatosByDataNascimento(@RequestParam LocalDate data) {
        LocalDate dia = LocalDate.of(1996, 10, 1);
        List<Contato> contatos = service.getByDataNascimento(dia);
        return ResponseEntity.ok(contatos);
    }

    // EXERCICIO 6
    @PatchMapping("/{id}")
    public ResponseEntity<Contato> updateContatoById(@PathVariable Long id, @RequestBody Contato contato) {
        Contato update = service.update(id, contato);
        return ResponseEntity.ok(update);
    }

    // EXERCICIO 7
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id) {
        String mensagem = service.delete(id);
        return ResponseEntity.ok(mensagem);
    }
}
