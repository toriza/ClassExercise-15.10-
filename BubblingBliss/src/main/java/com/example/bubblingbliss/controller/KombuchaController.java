package com.example.bubblingbliss.controller;

import com.example.bubblingbliss.model.Kombucha;
import com.example.bubblingbliss.service.KombuchaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/kombucha")
@RequiredArgsConstructor
public class KombuchaController {
    private final KombuchaService kombuchaService;

    @GetMapping("/{id}")
    public Kombucha findById(@PathVariable Long id) {
        return kombuchaService.findById(id);
    }

    @GetMapping
    public List<Kombucha> findAll(){
    return kombuchaService.findAll();
    }

    @PostMapping
    public Kombucha create(@RequestBody Kombucha kombucha) {
        return kombuchaService.createNewKombucha(kombucha);
    }

    @PutMapping("/{id}")
    public Kombucha update(@PathVariable Long id, @RequestBody Kombucha kombucha) {
        return kombuchaService.update(id, kombucha);
    }
}
