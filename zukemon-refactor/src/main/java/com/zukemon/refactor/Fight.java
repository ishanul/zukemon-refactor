package com.zukemon.refactor;

import com.zukemon.refactor.zukemons.Zukemon;

public class Fight {

    private ArenaDisplay arenaDisplay = new ArenaDisplay();
    private int highScore = 0;

    /**
     * Blastoise #9 Water Damage 258
     * Mew #151 Psychic Damage 150 (10% chance of critical hit)
     * Wartortle #8 Water Damage 300
     * Mudkip #258 Water Damage 234
     * Pikachu #25 Electric Damage 135
     * Psyduck #54 Water Damage 127 (20% chance of critical hit)
     * Krookodile #553 Dark No Damage -> It is the team lead, so he can call his team members to arms. Add the
     * damage of all other Zukemons
     *
     * Critical hits make double damage
     *
     * @param attackerType the type of the attacker, refer to the numbers of the pokemon
     */
    public Zukemon fight(int attackerType, int defenderType, int rounds) {
        ZukemonFactory factory = new ZukemonFactory();

        Zukemon attacker = factory.createZukemon(attackerType);
        Zukemon defender = factory.createZukemon(defenderType);

        for (int i = 0; i < rounds; i++) {
            int attackerDamage = attacker.hit();
            defender.reduceLifePoints(attackerDamage);
            if(defender.isDead()) {
                return attacker;
            }

            arenaDisplay.update(attacker, attackerDamage);
            System.out.println(attackerDamage);
            if(attackerDamage > highScore) {
                highScore = highScore;
                System.out.println(highScore);
            }
            if(attackerDamage > 100) {
                Audience.getInstance().update(attacker, attackerDamage);
            }


            int defenderDamage = defender.hit();
            attacker.reduceLifePoints(defenderDamage);
            if(attacker.isDead()) {
                return defender;
            }

            arenaDisplay.update(defender,defenderDamage);
            System.out.println(defenderDamage);
            if(defenderDamage > highScore) {
                highScore = highScore;
                System.out.println(highScore);
            }
            if(defenderDamage > 100) {
                Audience.getInstance().update(defender, defenderDamage);
            }
        }

        return null;
    }
}
