package day05.average;

public class Grade {
    private int mathScore;
    private int scienceScore;
    private int englishScore;
    private double average;
    Grade(int mathScore, int scienceScore, int englishScore) {
        this.mathScore = mathScore;
        this.scienceScore = scienceScore;
        this.englishScore = englishScore;
    }

    double scoreAverage() {
        average =  (mathScore + scienceScore + englishScore) / 3.0;
        return Math.round(average * 100) / 100.0;
    }
}
