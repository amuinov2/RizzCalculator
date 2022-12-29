package RizzCalculator;

import java.util.Scanner;

public class RizzCalculatorMain {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println(
                "Welcome to the Rizz Calculator! Using a few simple questions, we will determine whether or not you GET BITCHES! Are you ready?");

        System.out.println("\nQuestion 1: What is your Rice Purity Score?");
        int ricePurityScore = scnr.nextInt();

        System.out.println(
                "\nQuestion 2: How many members of the preferred sex(es) (within a reasonable age range!) who you would potentially attempt to rizz have you spoken to in the past week?");
        int numTalkedTo = scnr.nextInt();

        System.out.println(
                "\nQuestion 3: How many times have you kissed members of the preferred sex(es) in the last month?");
        int numKissed = scnr.nextInt();

        System.out.println("\nQuestion 4: How many times have you *ahem* \".gottenSex\" in the past year?");
        int numSex = scnr.nextInt();

        System.out.println("\nQuestion 5: On a scale of 1-10, how much rizz do you think you have?");
        int confidence = scnr.nextInt();

        int totalRizz = RizzCalculations.ricePurityCalculation(ricePurityScore)
                + RizzCalculations.numTalkedToCalculation(numTalkedTo)
                + RizzCalculations.numKissedCalculation(numKissed) + RizzCalculations.numSexCalculation(numSex)
                + RizzCalculations.confidenceCalculation(confidence);

        System.out.println("After careful calculation, your total rizz is: " + totalRizz + "! But what does this mean?");
        
        System.out.println("\n" + rizzDescription(totalRizz));
        
        scnr.close();

    }

    public static String rizzDescription(int totalRizz) {
        if (totalRizz == 0) {
            return "My friend, I am so sorry. You have zero rizz! You get no bitches. Whether this be by choice (you're a devoutly religious, perhaps) or not (you just have the worst stroke of luck), it's true.\nAdvice: You are sexy and beautiful (ooohhh behave!)! Get out there and spit some game.\nRaikes Comparison: Amir";
        } else if (totalRizz > 0 && totalRizz <= 10) {
            return "Alright, so you have very low levels of rizz. We're talking what a Geiger Counter would show when your 200-pound pet capybara rips ass. You may have had one short-term relationship (around nine days, perhaps?), but does it really count?\nAdvice: You're on the cusp of acceptable rizz levels. The next girl/guy you see, you better try and pull, if only for the sake of practice.\nRaikes Comparison: Allan";
        } else if (totalRizz > 10 && totalRizz <= 20) {
            return "The rizz levels are rising. You are on your way to becoming a dedicated student of quantum rizzics, but as far as the degree goes, you just enrolled in QRizz 101. You probably get bitches, but they are few and far between\nAdvice: Keep at your studies, and the bitches will come. Trust in the rizzics.\nRaikes Comparison: Harith";
        } else if (totalRizz > 20 && totalRizz <= 35) {
            return "You are straddling the line of greatness. Right now, you're smack dab in the middle of the rizzical spectrum. You definitely get play, but it's still not quite near the big leaguers. Hell, you might even have a girlfriend/boyfriend!\nAdvice: Whatever you're doing is working. You might even be content with where you're at. If this is you, remain at peace. If not, just keep using your rizztastic tactics whenever you can.\nRaikes Comparison: Carly";
        } else if (totalRizz > 35 && totalRizz < 50) {
            return "Ok, you definitely have rizz. Congratulations! You are in the 98th rizz-centile! The bitches love you, you feel confidence, and life is good. You are probably either pretty decently cuffed, or are the guy at frat parties who bags a new girl every time. You have pretty much made it.\nAdvice: Not much here, really. To ascend to true rizz greatness, however, you're lacking that special something that only a chosen few have. Being far lower on this rizz list myself, I don't know what that is. Good luck, soldier!\nRaikes Comparison: Jack Smiley";
        } else {
            return "All hail the Rizzard of Oz! Rizzle me this: What is it that makes you so goddamn good at getting play?! You are the Ruler of Rizz, the Rizzler him/herself, the Pinnacle of Play, the Aegis of Attraction. Everyone aspires to be like you.\nAdvice: Nada. None. You are at the top - there's nowhere left for you to go.\nRaikes Comparison: Cooper Sheets";
        }
    }

}
