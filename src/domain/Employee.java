package domain;

/**
 * Клас Employee представляє працівника, який має певні характеристики, такі як ім'я, посада, рівень, відділ та унікальний ідентифікатор.
 */
public class Employee {

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

    /**
     * Повертає рядкове представлення працівника, включаючи його ідентифікатор, ім'я, посаду, рівень і відділ.
     * 
     * @return Рядок, що представляє працівника та його характеристики.
     */
    @Override
    public String toString() {
        return "\nID працівника= " + ID + "\nІм'я= " + name + "\nПосада= " + jobTitle + "\nРівень= " + level + "\nВідділ= " + dept;
    }

    /**
     * Створює об'єкт Employee з вказаними ім'ям, посадою, рівнем і відділом.
     * 
     * @param name Ім'я працівника.
     * @param jobTitle Посада працівника.
     * @param level Рівень працівника (1-3).
     * @param dept Відділ працівника.
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
     * Створює об'єкт Employee з випадковим ідентифікатором у межах від 0 до 1000.
     */
    public Employee() {
        ID = (int)(Math.random() * 1000);
        // Код коментаря: у разі створення індикатора більше 10000 виникає виключення.
    }

    /**
     * Встановлює посаду працівника.
     * 
     * @param job Посада, яку необхідно встановити для працівника.
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Повертає посаду працівника.
     * 
     * @return Посада працівника.
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Повертає ім'я працівника.
     * 
     * @return Ім'я працівника.
     */
    public String getName() {
        return name;
    }

    /**
     * Встановлює рівень працівника. Приймає рівні 1-3, будь-яке інше значення встановлюється як рівень 1.
     * 
     * @param level Рівень працівника.
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Повертає рівень працівника.
     * 
     * @return Рівень працівника.
     */
    public int getLevel() {
        return level;
    }

    /**
     * Повертає відділ працівника.
     * 
     * @return Відділ працівника.
     */
    public String getDept() {
        return dept;
    }

    /**
     * Встановлює відділ працівника.
     * 
     * @param dept Відділ, який необхідно встановити для працівника.
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Встановлює ім'я працівника, перевіряючи його на відповідність заданому шаблону.
     * 
     * @param name Ім'я, яке необхідно встановити для працівника.
     */
    public void setName(String name) {
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
