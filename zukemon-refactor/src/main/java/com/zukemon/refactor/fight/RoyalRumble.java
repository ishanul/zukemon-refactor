package com.zukemon.refactor.fight;

import com.zukemon.refactor.ZukemonFactory;
import com.zukemon.refactor.zukemons.Zukemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RoyalRumble extends FightingGame {
    private List<Zukemon> fighters = new ArrayList<>();

    public RoyalRumble(ZukemonFactory zukemonFactory) {
        super(zukemonFactory);
    }

    public void initialize() {
        Zukemon fighter1 = zukemonFactory.createRandomZukemon();
        Zukemon fighter2 = zukemonFactory.createRandomZukemon();
        Zukemon fighter3 = zukemonFactory.createRandomZukemon();
        Zukemon fighter4 = zukemonFactory.createRandomZukemon();
        Zukemon fighter5 = zukemonFactory.createRandomZukemon();

        fighters.add(fighter1);
        fighters.add(fighter2);
        fighters.add(fighter3);
        fighters.add(fighter4);
        fighters.add(fighter5);
    }

    public Zukemon startPlay() {
        while (fighters.size() > 1) {
            Zukemon attacker = fighters.get(new Random().nextInt(fighters.size()));
            Zukemon defender = fighters.get(new Random().nextInt(fighters.size()));
            while (attacker == defender) {
                defender = fighters.get(new Random().nextInt(fighters.size()));
            }
            int attackerDamage = attacker.hit();

            fight(attacker, defender, attackerDamage);

            if (defender.isDead()) {
                fighters.remove(defender);
            }
        }
        return fighters.get(0);
    }

    public void endPlay() {
        System.out.println("end of the play");
    }

}
