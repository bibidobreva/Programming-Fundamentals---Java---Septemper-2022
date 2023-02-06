import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, Integer> heroHitPoints = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> heroManaPoints = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String heroAndStats = scanner.nextLine();
            String hero = heroAndStats.split("\\s+")[0];
            int hitPoints = Integer.parseInt(heroAndStats.split("\\s+")[1]);
            int manaPoints = Integer.parseInt(heroAndStats.split("\\s+")[2]);

            if(hitPoints>100){
                hitPoints=100;
            }
            if(manaPoints>200){
                manaPoints=200;
            }

            heroHitPoints.put(hero,hitPoints);
            heroManaPoints.put(hero,manaPoints);


        }

        String input;
        while(!(input=scanner.nextLine()).equals("End")){
            String command = input.split("\\s+-\\s+")[0];
            String hero = input.split("\\s+-\\s+")[1];

            if(command.equals("CastSpell")){
                int manaNeed = Integer.parseInt(input.split("\\s+-\\s+")[2]);
                String spellName = input.split("\\s+-\\s+")[3];
                int mana = heroManaPoints.get(hero);
                if(mana-manaNeed>=0){
                    heroManaPoints.replace(hero,mana-manaNeed);
                    System.out.printf("%s has successfully cast %s and now has %d MP!%n",hero,spellName,heroManaPoints.get(hero));
                }else {
                    System.out.printf("%s does not have enough MP to cast %s!%n",hero,spellName);
                }

            } else if (command.equals("TakeDamage")) {
                int damage = Integer.parseInt(input.split("\\s+-\\s+")[2]);
                String attacker = input.split("\\s+-\\s+")[3];

                int HP = heroHitPoints.get(hero);
                int leftHP = HP-damage;
                if(leftHP>0){
                    heroHitPoints.replace(hero,leftHP);
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",hero,damage,attacker,leftHP);
                }else {
                    System.out.printf("%s has been killed by %s!%n",hero,attacker);
                    heroHitPoints.remove(hero);
                    heroManaPoints.remove(hero);
                }

            } else if (command.equals("Recharge")) {
                int amount = Integer.parseInt(input.split("\\s+-\\s+")[2]);
                int mana = heroManaPoints.get(hero);
                int recoveredMana = amount;
                if(mana+recoveredMana>200){
                    recoveredMana=200-mana;
                }
                heroManaPoints.replace(hero,mana+recoveredMana);
                System.out.printf("%s recharged for %d MP!%n",hero,recoveredMana);

            } else if (command.equals("Heal")) {
                int amount = Integer.parseInt(input.split("\\s+-\\s+")[2]);
                int hitPoints = heroHitPoints.get(hero);
                int recoveredHP = amount;
                if(hitPoints+recoveredHP>100){
                    recoveredHP=100-hitPoints;
                }
                heroHitPoints.replace(hero,recoveredHP+hitPoints);
                System.out.printf("%s healed for %d HP!%n",hero,recoveredHP);
            }

        }

        for (Map.Entry<String, Integer> entry : heroManaPoints.entrySet()) {
            String hero = entry.getKey();
            int mana = entry.getValue();
            int HP = heroHitPoints.get(hero);
            System.out.println(hero);
            System.out.println("  HP: "+HP);
            System.out.println("  MP: "+mana);
        }

    }
}
