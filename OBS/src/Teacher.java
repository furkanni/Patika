public class Teacher {
    String name;
    String phonNo;
    String branch;

    Teacher(String name, String branch, String phonNo) {
        this.name = name;
        this.phonNo = phonNo;
        this.branch = branch;


    }

    void print() {
        System.out.println("Adı: " + this.name);
        System.out.println("Bölümü: " + this.branch);
        System.out.println("Tel Numarası: " + this.phonNo);
    }
}



