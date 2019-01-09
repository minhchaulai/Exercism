import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

class DnDCharacter {
    private int strength = 0;
    private int dexterity = 0;
    private int constitution = 0;
    private int intelligence = 0;
    private int Hitpoints = 0;
    private int charisma = 0;
    private int wisdom = 0;

    int ability() {
        Integer [] rolls = {0, 0, 0, 0};
        int die1 = (int)(Math.random()*6) + 1;
        int die2 = (int)(Math.random()*6) + 1;
        int die3 = (int)(Math.random()*6) + 1;
        int die4 = (int)(Math.random()*6) + 1;
        rolls[0] = die1;
        rolls[1] = die2;
        rolls[2] = die3;
        rolls[3] = die4;

        return die1 + die2 + die3 + die4 - Collections.min(Arrays.asList(rolls));

    }

    int modifier(int input) {
        return Math.floorDiv(input - 10, 2);
    }

    int getStrength() {
        if (strength == 0) {
            strength = ability();
        }
        return strength;
    }

    int getDexterity() {
        if (dexterity == 0) {
            dexterity = ability();
        }
        return dexterity;
    }

    int getConstitution() {
        if (constitution == 0) {
            constitution = ability();
        }
        return constitution;
    }

    int getIntelligence() {
        if (intelligence == 0) {
            intelligence = ability();
        }
        return intelligence;
    }

    int getWisdom() {
        if (wisdom == 0) {
            wisdom = ability();
        }
        return wisdom;
    }

    int getCharisma() {
        if (charisma == 0) {
            charisma = ability();
        }
        return charisma;
    }

    int getHitpoints() {
        return 10 + modifier(constitution);
    }

}
