public class Match {

    Boxer b1;
    Boxer b2;
    int minWeight;
    int maxWeight;

    Match(Boxer b1, Boxer b2, int minWeight, int maxWeight) {

        this.b1 = b1;
        this.b2 = b2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

    }

    void fight() {
        if (checkWeights()) {
            System.out.println("Sikletler Uygun Maç Başlıyor!");
            while (this.b1.health > 0 && this.b2.health > 0) {
                if (this.b1.isStart()) {
                    this.b2.health = this.b1.hit(this.b2);
                    if (isWin())
                        break;
                    System.out.println(this.b2.name + " Kalan Can: " + this.b2.health);

                } else {
                    this.b1.health = this.b2.hit(this.b1);
                    if (isWin())
                        break;
                    System.out.println(this.b1.name + " Kalan Can: " + this.b1.health);
                }
            }

        } else System.out.println("Sporcular Aynı Siklette Değil, Maç Yapılamaz!");


    }


    boolean checkWeights() {
        return (this.b1.weight >= this.minWeight && this.b1.weight <= this.maxWeight) && (this.b2.weight >= this.minWeight && this.b2.weight <= this.maxWeight);

    }

    boolean isWin() {
        if (this.b1.health == 0) {
            System.out.println("Maçı Kazanan : " + this.b2.name);
            return true;
        } else if (this.b2.health == 0) {
            System.out.println("Maçı Kazanan : " + this.b1.name);
            return true;
        }

        return false;

    }


}
