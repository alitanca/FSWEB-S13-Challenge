package org.example;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro; // 0'dan küçük olamaz
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        setGiro(giro);
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name) {
        if (developerNames == null) {
            System.out.println("[Company] developerNames dizisi tanımlı değil!");
            return;
        }
        if (index < 0 || index >= developerNames.length) {
            System.out.println("[Company] Geçersiz index: " + index);
            return;
        }
        if (developerNames[index] == null || developerNames[index].isEmpty()) {
            developerNames[index] = name;
            System.out.println("[Company] '" + name + "' index " + index + " konumuna eklendi.");
        } else {
            System.out.println("[Company] Index " + index + " dolu! (mevcut: " + developerNames[index] + ")");
        }
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getGiro() { return giro; }
    public void setGiro(double giro) {
        if (giro < 0) {
            throw new IllegalArgumentException("giro 0'ın altında olamaz!");
        }
        this.giro = giro;
    }

    public String[] getDeveloperNames() { return developerNames; }
    public void setDeveloperNames(String[] developerNames) { this.developerNames = developerNames; }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}
