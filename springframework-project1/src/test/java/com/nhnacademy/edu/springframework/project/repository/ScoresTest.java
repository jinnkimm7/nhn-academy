package com.nhnacademy.edu.springframework.project.repository;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;


class ScoresTest {
    private Scores scores = CsvScores.getInstance();

    @Test
    void loadAndFindAll() {
        scores.load();
        Collection<Score> loadedScores = scores.findAll();
        assertEquals(3, loadedScores.size());
        System.out.println(loadedScores);
    }
}