package com.example.bubblingbliss.repository;

import com.example.bubblingbliss.model.Kombucha;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KombuchaRepository extends JpaRepository<Kombucha, Long> {
}
