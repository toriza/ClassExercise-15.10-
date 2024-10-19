package com.example.bubblingbliss.demo;

import com.example.bubblingbliss.model.Kombucha;
import com.example.bubblingbliss.repository.KombuchaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor

public class DataLoader implements CommandLineRunner {
    private final KombuchaRepository kombuchaRepository;

    @Override
    public void run(String... args) throws Exception {
        kombuchaRepository.saveAll(List.of(
                new Kombucha("Mango Nirvana", "Mango, Banana, Coconut", 10),
                new Kombucha("Lavender Zen", "Lavender, Lemon", 14),
                new Kombucha("Raspberry Heaven", "Raspberry, Apple, Lemon", 15)
        ));
    }
}
