package domain;

/**
 * Клас Manager розширює клас Employee і представляє менеджера, який керує масивом працівників.
 */
public class Manager extends Employee {

    private Employee[] employees;

    /**
     * Створює об'єкт Manager з вказаними підлеглими працівниками, ім'ям, посадою, рівнем та відділом.
     * 
     * @param employees Масив працівників, якими керує менеджер.
     * @param name Ім'я менеджера.
     * @param jobTitle Посада менеджера.
     * @param level Рівень менеджера.
     * @param dept Відділ менеджера.
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Повертає рядкове представлення менеджера, включаючи інформацію про менеджера з суперкласу та перелік підлеглих працівників.
     * 
     * @return Рядок, що представляє менеджера та його підлеглих працівників.
     */
    @Override
    public String toString() {
        return super.toString() + "\nПрацівники: " + getEmployees();
    }

    /**
     * Створює об'єкт Manager з вказаними підлеглими працівниками.
     * 
     * @param employees Масив працівників, якими керує менеджер.
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }

    /**
     * Створює об'єкт Manager з масивом працівників розміром 10 за замовчуванням.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    /**
     * Повертає підлеглих працівників у вигляді рядка, розділеного комами.
     * 
     * @return Рядок, що представляє імена підлеглих працівників.
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s = s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює підлеглих працівників.
     * 
     * @param employees Масив працівників для встановлення.
     */
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    /**
     * Повертає масив підлеглих працівників.
     * 
     * @return Масив підлеглих працівників.
     */
    public Employee[] getEmployeesList() {
        return employees;
    }
}
