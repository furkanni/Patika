public class Student {

    Course course1;
    Course course2;
    Course course3;

    String name;
    String stuNo;
    String classes;

    double average;
    double c1note;
    double c2note;
    double c3note;
    boolean isPass;


    Student(String name, String stuNo, String classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3) {


        if (note1 >= 0 && note1 <= 100) {
            this.course1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.course2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.course3.note = note3;
        }
    }

    void addVerbalNote(int verb1, int verb2, int verb3) {
        if (verb1 >= 0 && verb1 <= 100) {
            this.course1.verbal = verb1;

        }
        if (verb2 >= 0 && verb2 <= 100) {
            this.course2.verbal = verb2;

        }
        if (verb3 >= 0 && verb3 <= 100) {
            this.course3.verbal = verb3;

        }

    }

    void addVerbalNoteRatio(double verbalRatio1, double verbalRatio2, double verbalRatio3) {
        if (verbalRatio1 <= 1.0 && verbalRatio1 >= 0.0) {
            this.course1.verbalNoteRatio = verbalRatio1;
            this.course1.examNoteRatio = 1.0 - verbalRatio1;
        }
        if (verbalRatio2 <= 1.0 && verbalRatio2 >= 0.0) {
            this.course2.verbalNoteRatio = verbalRatio2;
            this.course2.examNoteRatio = 1.0 - verbalRatio2;
        }
        if (verbalRatio3 <= 1.0 && verbalRatio3 >= 0.0) {
            this.course3.verbalNoteRatio = verbalRatio3;
            this.course3.examNoteRatio = 1.0 - verbalRatio3;
        }

    }

    void isPass() {

        stuInfoPrint();
        System.out.println();
        printExam();
        System.out.println();
        printVerb();
        System.out.println();
        printVerbRatio();
        System.out.println();

        c1note = ((this.course1.note * this.course1.examNoteRatio) + (this.course1.verbal * this.course1.verbalNoteRatio));
        c2note = ((this.course2.note * this.course2.examNoteRatio) + (this.course2.verbal * this.course2.verbalNoteRatio));
        c3note = ((this.course3.note * this.course3.examNoteRatio) + (this.course3.verbal * this.course3.verbalNoteRatio));
        //System.out.println(c1note);
        //System.out.println(c2note);
        //System.out.println(c3note);


        this.average = (c1note + c2note + c3note) / 3;
        System.out.println("Ortalamanız: " + this.average);
        if (this.average > 55) {
            System.out.println("\nTebrikler Sınıfı Geçtiniz!");
            this.isPass = true;
        } else {
            System.out.println("Sınıfta Kaldınız!");
            this.isPass = false;
        }

        System.out.println("\n===============================\n");


    }

    void stuInfoPrint() {
        System.out.println("Öğrencinin Adı: " + this.name + "\nÖğrenci Numarası: " + this.stuNo
                + "\nSınıfı: " + this.classes + "\nAldığı Dersler: " + this.course1.name
                + ", " + this.course2.name + ", " + this.course3.name);
    }

    void printExam() {
        System.out.println(this.course1.name + " Notu: " + this.course1.note);
        System.out.println(this.course2.name + " Notu: " + this.course2.note);
        System.out.println(this.course3.name + " Notu: " + this.course3.note);
    }

    void printVerb() {
        System.out.println(this.course1.name + " Sözlü Notu: " + this.course1.verbal);
        System.out.println(this.course2.name + " Sözlü Notu: " + this.course2.verbal);
        System.out.println(this.course3.name + " Sözlü Notu: " + this.course3.verbal);

    }

    void printVerbRatio() {
        System.out.println(this.course1.name + " Dersi Sınav Notu Etkisi Oranı: % " + 100 * this.course1.examNoteRatio);
        System.out.println(this.course1.name + " Dersi Sözlü Notu Etkisi Oranı: % " + 100 * this.course1.verbalNoteRatio);
        System.out.println(this.course2.name + " Dersi Sınav Notu Etkisi Oranı: % " + 100 * this.course2.examNoteRatio);
        System.out.println(this.course2.name + " Dersi Sözlü Notu Etkisi Oranı: % " + 100 * this.course2.verbalNoteRatio);
        System.out.println(this.course3.name + " Dersi Sınav Notu Etkisi Oranı: % " + 100 * this.course3.examNoteRatio);
        System.out.println(this.course3.name + " Dersi Sözlü Notu Etkisi Oranı: % " + 100 * this.course3.verbalNoteRatio);


    }

}
