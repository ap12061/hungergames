package components.controller;

import components.Contestant;

import java.util.ArrayList;

public class HungerGamesController {
    ArrayList<Contestant> contestantList = new ArrayList<>(24);

    public void startBattle() {
        System.out.println("Welcome to The Hunger Games! Let's introduce our 24 brave contestants.");
        System.out.println();

        contestantIntro();
        battleCycle();
    }

    // create 24 contestants with random attributes and roughly 50/50 male/female:

    private void contestantIntro() {
        for (int i = 0; i < 24; i++) {
            Contestant contestant = new Contestant();

            contestant.setHealthLevel(100);
            contestant.setAttackLevel(Math.floor(Math.random() * 101));
            contestant.setDefenseLevel(Math.floor(Math.random() * 101));
            contestant.setName("contestant " + i);
            contestant.decideGender();

            contestantList.add(contestant);

            System.out.println(contestant.getGender() + " " + contestant.getName() + " with " + contestant.getAttackLevel()
                    + " Attack Power, and " + contestant.getDefenseLevel() + " defense.");
        }
    }

    private void battleCycle() {
        for (int i = 0; i < 24; i++) {
            double damage = contestantList.get(i).getHealthLevel()-contestantList.get(i).getAttackLevel();

        }
    }
}
