package domain;

/**
 * Клас Artist представляє художника, який є працівником із певними навичками в певному відділі.
 * Він розширює клас Employee і містить масив навичок, специфічних для художника.
 */
public class Artist extends Employee {

    private String[] skills; // Виправлено помилку: замість "skiils" має бути "skills".

    /**
     * Створює об'єкт Artist із зазначеними іменем, посадою, рівнем, відділом та навичками.
     * 
     * @param skills Масив навичок, які має художник.
     * @param name Ім'я художника.
     * @param jobTitle Посада художника.
     * @param level Рівень художника.
     * @param dept Відділ художника.
     */
    public Artist(String[] skills, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skills = skills;
    }

    /**
     * Створює об'єкт Artist із зазначеними навичками.
     * 
     * @param skills Масив навичок, які має художник.
     */
    public Artist(String[] skills) {
        super();
        this.skills = skills;
    }

    /**
     * Створює об'єкт Artist із стандартним масивом із 10 навичок.
     */
    public Artist() {
        super();
        this.skills = new String[10];
    }

    /**
     * Повертає рядкове представлення художника, включаючи інформацію про художника з суперкласу
     * та навички художника.
     * 
     * @return Рядок, що представляє художника та його навички.
     */
    @Override
    public String toString() {
        return super.toString() + "\nНавички: " + getSkills();
    }

    /**
     * Повертає навички художника у вигляді рядка, розділеного комами.
     * 
     * @return Рядок, що представляє навички художника.
     */
    public String getSkills() {
        String s = "";
        for (String e : skills) {
            s = s + e + ", ";
        }
        s = s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює навички художника, використовуючи наданий масив навичок.
     * 
     * @param skills Масив навичок для встановлення для художника.
     */
    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    /**
     * Повертає навички художника у вигляді масиву рядків.
     * 
     * @return Масив рядків, що представляє навички художника.
     */
    public String[] getSkillsList() {
        return skills;
    }
}
