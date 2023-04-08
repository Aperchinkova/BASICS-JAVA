package ExamPreparation30July;

import java.util.*;

public class HeroesofCodeandLogic7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> hero=new LinkedHashMap<>();

        for(int i=0;i<n;i++)
        {
            String[] heroes=scanner.nextLine().split(" ");
            String name=heroes[0];
            int hp=Integer.parseInt(heroes[1]);
            int mp=Integer.parseInt(heroes[2]);
            List<Integer> numbers=new ArrayList<>();
            numbers.add(hp);
            numbers.add(mp);
            hero.putIfAbsent(name,numbers);
        }
        String commands= scanner.nextLine();
        while(!commands.equals("End"))
        {
            String[] split=commands.split(" - ");
            String action=split[0];
            String heroName=split[1];
            switch (action)
            {
                case "CastSpell":
                    //CastSpell – {hero name} – {MP needed} – {spell name}
                    int mpNeeded=Integer.parseInt(split[2]);
                    String spellName=split[3];
                    int speltcast=hero.get(heroName).get(1);
                    if(speltcast>mpNeeded)
                    {
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n",heroName,spellName,speltcast-mpNeeded);
                        List<Integer> newList=new ArrayList<>();
                        newList.add(hero.get(heroName).get(0));
                        newList.add(speltcast-mpNeeded);
                        hero.put(heroName,newList);
                    }else{
                        System.out.printf("%s does not have enough MP to cast %s!%n",heroName,spellName);
                    }
                    break;
                case "TakeDamage":
                    //TakeDamage – {hero name} – {damage} – {attacker}
                    int damage=Integer.parseInt(split[2]);
                    String attacker=split[3];
                    int takendamage=hero.get(heroName).get(0);
                    if(takendamage-damage>0)
                    {
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",heroName,damage,attacker,takendamage-damage);
                        List<Integer> newList2=new ArrayList<>();
                        newList2.add(takendamage-damage);
                        newList2.add(hero.get(heroName).get(1));
                        hero.put(heroName,newList2);
                    }else{
                        hero.remove(heroName);
                        System.out.printf("%s has been killed by %s!%n",heroName,attacker);

                    }
                    break;
                case "Recharge":
                    int amount=Integer.parseInt(split[2]);
                    int increase=hero.get(heroName).get(1)+amount;

                    List<Integer> newList3=new ArrayList<>();
                    if(increase>200)
                    {
                        increase=200;
                        System.out.printf("%s recharged for %d MP!%n",heroName,200-hero.get(heroName).get(1));
                        newList3.add(hero.get(heroName).get(0));
                        newList3.add(increase);
                        hero.put(heroName,newList3);
                    }else{
                        System.out.printf("%s recharged for %d MP!%n",heroName,amount);
                        newList3.add(hero.get(heroName).get(0));
                        newList3.add(increase);
                        hero.put(heroName,newList3);
                    }
                    break;
                case "Heal":
                    //"Heal – {hero name} – {amount}"
                    //Heal - Solmyr - 10
                    int amountHeal=Integer.parseInt(split[2]);//10

                    int heal=hero.get(heroName).get(0);//HP
                    List<Integer> newList4=new ArrayList<>();
                    int total=heal+amountHeal;
                    if(total>100)
                    {
                        total=100;
                        System.out.printf("%s healed for %d HP!%n",heroName,100-heal);
                        newList4.add(100);
                        newList4.add(hero.get(heroName).get(1));
                        hero.put(heroName,newList4);
                    }else{
                        System.out.printf("%s healed for %d HP!%n",heroName,amountHeal);
                        newList4.add(total);
                        newList4.add(hero.get(heroName).get(1));
                        hero.put(heroName,newList4);
                    }

                    break;

            }
            commands=scanner.nextLine();
        }
        for (Map.Entry<String, List<Integer>> entry : hero.entrySet()) {
            System.out.printf("%s%n",entry.getKey());
            System.out.printf("  HP: %d%n",entry.getValue().get(0));
            System.out.printf("  MP: %d%n",entry.getValue().get(1));
        }

    }
}