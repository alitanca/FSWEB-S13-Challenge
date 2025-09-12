package org.example;

public class Main {
    public static void main(String[] args) {
        uygulamayiCalistir();
    }

    private static void uygulamayiCalistir() {
        Healthplan hp1 = new Healthplan(1, "Çalışan Temel Plan", Plan.BASIC);
        Healthplan hp2 = new Healthplan(2, "Çalışan Premium Plan", Plan.PREMIUM);

        System.out.println(hp1);
        System.out.println(hp2);
        System.out.println("---------------");

        String[] empPlans = new String[3];
        Employee emp = new Employee(101, "Ali Tanca", "ali@example.com", "sifre123", empPlans);
        emp.addHealthplan(0, hp1.getName());
        emp.addHealthplan(0, "Yeniden");
        emp.addHealthplan(1, hp2.getName());
        emp.addHealthplan(5, "Geçersiz");
        System.out.println(emp);
        System.out.println("---------------");

        String[] devs = new String[4];
        Company company = new Company(501, "Example Tech A.Ş.", 2_500_000.0, devs);
        company.addEmployee(0, "Zeynep");
        company.addEmployee(1, "Mehmet");
        company.addEmployee(1, "Ayşe");
        company.addEmployee(10, "X");
        System.out.println(company);

        try {
            company.setGiro(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("[Encapsulation] Kural ihlali yakalandı: " + e.getMessage());
        }
    }
}
