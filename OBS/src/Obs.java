public class Obs {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Ali Hoca", "MAT", "112654");
        Teacher t2 = new Teacher("Ayşe Hoca", "FZK", "123458");
        Teacher t3 = new Teacher("Ahmet Hoca", "ENG", "1479632");
        //t1.print();

        Course matematik = new Course("Matematik", "101", "MAT", "Sınavın Etkisi %90", "Sözlünün Etkisi %10");
        matematik.addTeacher(t1);

        Course fizik = new Course("Fizik", "101", "FZK", "Sınavın Etkisi %85", "Sözlünün Etkisi %15");
        fizik.addTeacher(t2);

        Course ingilizce = new Course("İngilizce", "101", "ENG", "Sınavın Etkisi %95", "Sözlünün Etkisi %5");
        ingilizce.addTeacher(t3);

        Student s1 = new Student("Furkan", "1", "4.Sınıf", matematik, fizik, ingilizce);
        Student s2 = new Student("Zeynep", "2", "2.Sınıf", matematik, fizik, ingilizce);
        Student s3 = new Student("Yaren", "3", "3.Sınıf", matematik, fizik, ingilizce);


        s1.addBulkExamNote(15, 10, 5);
        s1.addVerbalNote(90, 80, 100);
        s1.addVerbalNoteRatio(0.1, 0.15, 0.05);
        s1.isPass();

        s2.addBulkExamNote(80, 75, 95);
        s2.addVerbalNote(100, 70, 95);
        s2.addVerbalNoteRatio(0.1, 0.15, 0.05);
        s2.isPass();

        s3.addBulkExamNote(95, 85, 80);
        s3.addVerbalNote(85, 90, 75);
        s3.addVerbalNoteRatio(0.1, 0.15, 0.05);
        s3.isPass();


    }

}
