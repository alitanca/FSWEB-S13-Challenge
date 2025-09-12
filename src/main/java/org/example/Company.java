package org.example;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        setGiro(giro);
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name) {
        if (developerNames == null) return;
        if (index < 0 || index >= developerNames.length) return;

        // Boşsa ekle; doluysa dokunma
        if (developerNames[index] == null || developerNames[index].isEmpty()) {
            developerNames[index] = name;
        }
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getGiro() { return giro; }
    public void setGiro(double giro) {
        if (giro < 0) throw new IllegalArgumentException("giro 0'ın altında olamaz!");
        this.giro = giro;
    }

    // Testin beklediği getter adı
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
