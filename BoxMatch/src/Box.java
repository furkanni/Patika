public class Box {
    public static void main(String[] args) {

        Boxer blue = new Boxer("Mavi",20,100,85,50,25);
        Boxer red = new Boxer("Kırmızı",15,110,90,50,20);

        Match ring = new Match(blue,red,80,100);

        ring.fight();







    }
}
