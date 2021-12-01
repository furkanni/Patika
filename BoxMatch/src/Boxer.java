public class Boxer {

    String name;
    int damage;
    int health;
    int weight;
    double start;
    double dodge;

    Boxer(String name, int damage, int health, int weight, int start, int dodge) {

        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.start = start;
        this.dodge = dodge;

    }

    int hit(Boxer foe) {

        System.out.println("------------");
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " Hasar Vurdu.");


        if (foe.isDodge()) {
            System.out.println(foe.name + " Gelen Hasarı Blockladı.");
            return foe.health;
        }

        if (foe.health - this.damage < 0) {
            return 0;
        }

        return foe.health - this.damage;



    }



    boolean isStart() {
        double startChance = Math.random() * 100;
        return startChance <= this.start;
    }

    boolean isDodge() {
        double randomValue = Math.random() * 100;  //0.0 to 99.9
        return randomValue <= this.dodge;
    }


}
