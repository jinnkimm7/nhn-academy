package com.nhnacademy.edu.springframework.project.repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvScores implements Scores {
    public static CsvScores instance;
    private List<Score> scoreList;

    private CsvScores(){
        this.scoreList = new ArrayList<>();
    }

    /** TODO 2 :
     * Java Singleton 패턴으로 getInstance() 를 구현하세요.
     **/
    public static Scores getInstance() {
        if (instance == null) {
            instance = new CsvScores();
        }
        return instance;
    }
    // TODO 5 : score.csv 파일에서 데이터를 읽어 멤버 변수에 추가하는 로직을 구현하세요.
    @Override
    public void load() {
        String filePath = "resources/data/score.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                int studentSeq = Integer.parseInt(data[0].trim());
                int scoreValue = Integer.parseInt(data[1].trim());

                Score score = new Score(studentSeq, scoreValue);
                scoreList.add(score);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Score> findAll() {
        return scoreList;
    }
}
