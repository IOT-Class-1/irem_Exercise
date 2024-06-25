package mextMerveGundogmus.Day2;

public class Main {
    public static void main(String[] args) {
        Analyst employee1 = new Analyst("İrem Seyda UĞUZ", 90000,24);

        Salesperson employee2 = new Salesperson("İsmail BAHÇECİ", 150000,25,.30);

        employee1.getAnnualBonus();
        employee2.raiseCommission();
        employee2.getCommissionPercentage();

        System.out.println(employee1.salary);
        System.out.println(employee1.getAnnualBonus());
        System.out.println(employee2.salary);
        System.out.println(employee2.getCommissionPercentage());
    }
}
