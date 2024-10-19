package com.example.bubblingbliss.service;

import com.example.bubblingbliss.model.Kombucha;
import com.example.bubblingbliss.repository.KombuchaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class KombuchaService {
    private final KombuchaRepository kombuchaRepository;
    public Kombucha createNewKombucha(Kombucha kombucha) {
        return kombuchaRepository.save(kombucha);
    }
    public List<Kombucha> findAll() {
        return kombuchaRepository.findAll();
    }
    public Kombucha findById(Long id) {
        return kombuchaRepository.findById(id).orElse(null);
    }
    public Kombucha update(Long id, Kombucha kombucha) {
       return kombuchaRepository.findById(id).get();
    }
}