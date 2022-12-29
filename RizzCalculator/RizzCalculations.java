package RizzCalculator;

public class RizzCalculations {

    private int ricePurityScore;
    private int numTalkedTo;
    private int numKissed;
    private int numSex;
    private int confidence;
    
    public RizzCalculations(int ricePurityScore, int numTalkedTo, int numKissed, int numSex, int confidence) {
        ricePurityCalculation(ricePurityScore);
        numTalkedToCalculation(numTalkedTo);
        numKissedCalculation(numKissed);
        numSexCalculation(numSex);
        confidenceCalculation(confidence);
    }

    public static int ricePurityCalculation(int ricePurityScore) {
        if (ricePurityScore >= 90 && ricePurityScore <= 100) {
            return 0;
        } else if (ricePurityScore >= 80 && ricePurityScore < 90) {
            return 2;
        } else if (ricePurityScore >= 70 && ricePurityScore < 80) {
            return 3;
        } else if (ricePurityScore >= 60 && ricePurityScore < 70) {
            return 4;
        } else if (ricePurityScore >= 50 && ricePurityScore < 60) {
            return 5;
        } else if (ricePurityScore >= 40 && ricePurityScore < 50) {
            return 6;
        } else if (ricePurityScore >= 30 && ricePurityScore < 40) {
            return 7;
        } else if (ricePurityScore >= 20 && ricePurityScore < 30) {
            return 8;
        } else if (ricePurityScore >= 10 && ricePurityScore < 20) {
            return 9;
        } else {
            return 10;
        }
    }

    public static int numTalkedToCalculation(int numTalkedTo) {
        if (numTalkedTo == 0) {
            return 0;
        } else if (numTalkedTo > 0 && numTalkedTo <= 3) {
            return 1;
        } else if (numTalkedTo > 3 && numTalkedTo <= 10) {
            return 5;
        } else if (numTalkedTo > 10 && numTalkedTo <= 20) {
            return 8;
        } else {
            return 10;
        }
    }

    public static int numKissedCalculation(int numKissed) {
        if (numKissed == 0) {
            return 0;
        } else if (numKissed > 0 && numKissed <= 3) {
            return 1;
        } else if (numKissed > 3 && numKissed <= 10) {
            return 5;
        } else if (numKissed > 10 && numKissed <= 20) {
            return 8;
        } else {
            return 10;
        }
    }

    public static int numSexCalculation(int numSex) {
        if (numSex == 0) {
            return 0;
        } else if (numSex > 0 && numSex <= 3) {
            return 2;
        } else if (numSex > 3 && numSex <= 5) {
            return 5;
        } else if (numSex > 5 && numSex <= 10) {
            return 8;
        } else {
            return 10;
        }
    }

    public static int confidenceCalculation(int confidence) {
        if (confidence == 0) {
            return 0;
        } else if (confidence > 0 && confidence <= 3) {
            return 1;
        } else if (confidence > 3 && confidence <= 5) {
            return 4;
        } else if (confidence > 5 && confidence <= 7) {
            return 6;
        } else if (confidence > 7 && confidence <= 9) {
            return 8;
        } else {
            return 10;
        }
    }

}
