public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    String examRatio;
    String verbalRatio;
    int note;
    int verbal;
    double verbalNoteRatio;
    double examNoteRatio;

    Course(String name, String code, String prefix, String examRatio, String verbalRatio) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.examRatio = examRatio;
        this.note = 0;
        this.verbalRatio = verbalRatio;
        this.verbal = 0;
        this.verbalNoteRatio = 0.0;
        this.examNoteRatio = 1.0;

    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            //printTeacher();
        } else {
            System.out.println("Öğretmen Bu Dersi Vermemektedir!");
        }


    }

    void printTeacher() {
        this.teacher.print();
    }

    void courseInfo() {
        System.out.println("Dersin Adı: " + this.name);
        System.out.println("Dersin Kodu: " + this.code);
        System.out.println("Dersin Prefixi: " + this.prefix);
        System.out.println("Dersin Sınav Yüzdesi: " + this.examRatio);
        System.out.println("Dersin Sözlü Yüzdesi: " + this.verbalRatio);
    }


}
