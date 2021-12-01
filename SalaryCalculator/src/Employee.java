public class Employee {
    String name;
    int salary;    // şuan maaşı
    int workHours; //haftalık çalışma saati
    int hireYear;  //alındığı yıl
    double tax;
    double bonus;
    double rise;
    int thisYear = 2021;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;


    }

    void toStringg() {
        System.out.println("Adı: " + this.name);
        System.out.println("Maaş Miktarı: " + this.salary);
        System.out.println("Haftalık Çalışma Saati: " + this.workHours);
        System.out.println("İşe Başladığı Yıl: " + this.hireYear);
        System.out.println();
        tax();
        System.out.println("Uygulanan Vergi: " + this.tax);
        bonus();
        System.out.println("Bonus Miktarı: " + this.bonus);
        riseSalary();
        System.out.println("Zam Miktarı: " + this.rise);
        System.out.println("Vergi ve Bonuslar Sonucunda Maaş: " + (this.salary + this.bonus - this.tax));
        System.out.println("Zam Yapıldıktan Sonraki Net Maaş: " + (this.salary + this.rise + this.bonus - this.tax));
        System.out.println("\n===========================\n");

    }

    void tax() {

        if (this.salary >= 1000) {
            tax = this.salary * 0.03;
            // System.out.println("Uygulanan Vergi: " + this.tax);
            //System.out.println("Yeni Maaş: " + (this.salary - this.tax));
        }


    }

    void bonus() {
        if (this.workHours > 40) {
            this.bonus = (this.workHours - 40) * 30;
            //System.out.println("Bonus Miktarı: " + this.bonus);
        }
    }

    void riseSalary() {
        if (thisYear - this.hireYear < 10) {
            this.rise = this.salary * 0.05;

        } else if (thisYear - this.hireYear >= 10 && thisYear - this.hireYear < 20) {
            this.rise = this.salary * 0.1;

        } else if (thisYear - this.hireYear >= 20) {
            this.rise = this.salary * 0.15;

        }

    }


}
