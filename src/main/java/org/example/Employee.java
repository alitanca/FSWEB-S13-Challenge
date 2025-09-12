package org.example;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans; // DİKKAT: camelCase ve çoğul

    public Employee(int id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    // Testin beklediği imza
    public void addHealthPlan(int index, String name) {
        if (healthPlans == null) return;
        if (index < 0 || index >= healthPlans.length) return;

        // Boşsa yaz; doluysa dokunma
        if (healthPlans[index] == null || healthPlans[index].isEmpty()) {
            healthPlans[index] = name;
        }
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    // Testin beklediği getter adı
    public String[] getHealthPlans() { return healthPlans; }
    public void setHealthPlans(String[] healthPlans) { this.healthPlans = healthPlans; }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", healthPlans=" + Arrays.toString(healthPlans) +
                '}';
    }
}
