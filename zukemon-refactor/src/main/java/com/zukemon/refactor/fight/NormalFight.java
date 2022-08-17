package com.zukemon.refactor.fight;

import com.zukemon.refactor.ZukemonFactory;
import com.zukemon.refactor.zukemons.Zukemon;


public class NormalFight extends FightingGame {
    private Zukemon attacker;
    private Zukemon defender;

    public NormalFight(ZukemonFactory zukemonFactory) {
        super(zukemonFactory);
    }

    public void initialize() {
        attacker = zukemonFactory.createRandomZukemon();
        defender = zukemonFactory.createRandomZukemon();
    }

    public Zukemon startPlay() {
        while (true) {
            int attackerDamage = attacker.hit();
            fight(attacker, defender, attackerDamage);

            if (defender.isDead()) {
                return attacker;
            }

            int defenderDamage = defender.hit();
            fight(defender, attacker, defenderDamage);

            if (attacker.isDead()) {
                return defender;
            }
        }
    }

    public void endPlay() {
        System.out.println("end of the play");
    }
}
