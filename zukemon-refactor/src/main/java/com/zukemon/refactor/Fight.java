package com.zukemon.refactor;

import com.zukemon.refactor.fight.FightGame;
import com.zukemon.refactor.fight.FightBehaviorFactory;
import com.zukemon.refactor.zukemons.Zukemon;

public class Fight {

    ZukemonFactory zukemonFactory = new ZukemonFactory();
    /**
     * Blastoise #9 Water Damage 258
     * Mew #151 Psychic Damage 150 (10% chance of critical hit)
     * Wartortle #8 Water Damage 300
     * Mudkip #258 Water Damage 234
     * Pikachu #25 Electric Damage 135
     * Psyduck #54 Water Damage 127 (20% chance of critical hit)
     * Krookodile #553 Dark No Damage -> It is the team lead, so he can call his team members to arms. Add the
     * damage of all other Zukemons
     * <p>
     * Critical hits make double damage
     *
     * @param fightMode the type of fightMode
     */
    public Zukemon fight(FightMode fightMode) {
        FightGame fightGame = FightBehaviorFactory.getFightBehavior(fightMode, zukemonFactory);
        return fightGame.play();
    }
}
