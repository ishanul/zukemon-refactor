package com.zukemon.refactor.fight;

import com.zukemon.refactor.ZukemonFactory;
import com.zukemon.refactor.zukemons.Zukemon;

public class DefendFight extends FightingGame {
    private Zukemon attacker;
    private Zukemon defender;

    public DefendFight(ZukemonFactory zukemonFactory){
        super(zukemonFactory);
    }

    public void initialize(){
        attacker = zukemonFactory.createRandomZukemon();
        defender = zukemonFactory.createRandomZukemon();
    }
    public Zukemon startPlay(){
        int initialLifePoints = defender.getLifePoints();
        // The defender gets super much life points
        defender.increaseLifePointsBy(5000);
        while (true) {
            int attackerDamage = attacker.hit();
            fight(attacker, defender, attackerDamage);
            if (defender.isDead()) {
                return attacker;
            }
            //heal 10% of initial lifepoints
            defender.increaseLifePointsBy(initialLifePoints / 100 * 10);
        }
    }
    public void endPlay(){
        System.out.println("end of the play");
    }
}
