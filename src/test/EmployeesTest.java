package test;

import domain.*;

/**
 * Клас EmployeesTest містить головний метод для тестування різних класів із пакету `domain`.
 */
public class EmployeesTest {

    /**
     * Головний метод програми, який створює різні об'єкти класів Editor, Employee, Artist та Manager.
     * Виводить представлення об'єкта Manager з підлеглими працівниками.
     * 
     * @param args Аргументи командного рядка (не використовується в даному випадку).
     */
    public static void main(String args[]) {

        // Масив навичок, які використовуються для об'єктів Editor та Artist.
        String[] skills = {"Microsoft Word", "TeX", "OpenOffice", "Markdown"};
        
        // Створення об'єкта Editor з параметрами: електронне редагування, навички, ім'я, посада, рівень та відділ.
        Editor ed = new Editor(true, skills, "Phil Coulson", "Chief Editor", 3, "Publishing");
        
        // Створення об'єкта Employee з параметрами: ім'я, посада, рівень та відділ.
        Employee em = new Employee("Melinda May", "Assistant", 1, "Publishing");

        // Створення об'єкта Artist з масивом навичок.
        Artist art = new Artist(skills);
        
        // Масив об'єктів Employee, що включає об'єкти Editor, Employee та Artist.
        Employee[] people = {ed, em, art};
        
        // Створення об'єкта Manager з підлеглими працівниками, ім'ям, посадою, рівнем та відділом.
        Manager man = new Manager(people, "Steve Ballmer", "CEO", 3, "Publishing");

        // Виводить представлення об'єкта Manager, включаючи інформацію про підлеглих працівників.
        System.out.println(man);
    }
}
