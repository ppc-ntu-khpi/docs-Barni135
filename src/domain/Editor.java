package domain;

/**
 * Клас Editor розширює клас Artist і представляє редактора, який має певні вподобання щодо електронного або паперового редагування.
 */
public class Editor extends Artist {

    private boolean electronicEditing;

    /**
     * Створює об'єкт Editor з вказаними параметрами електронного редагування, навичками, іменем, посадою, рівнем та відділом.
     * 
     * @param electronicEditing Вказує, чи підтримує редактор електронне редагування (true) чи паперове (false).
     * @param skills Масив навичок, які має редактор.
     * @param name Ім'я редактора.
     * @param jobTitle Посада редактора.
     * @param level Рівень редактора.
     * @param dept Відділ редактора.
     */
    public Editor(boolean electronicEditing, String[] skills, String name, String jobTitle, int level, String dept) {
        super(skills, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює об'єкт Editor з вказаними параметрами електронного редагування та навичками.
     * 
     * @param electronicEditing Вказує, чи підтримує редактор електронне редагування (true) чи паперове (false).
     * @param skills Масив навичок, які має редактор.
     */
    public Editor(boolean electronicEditing, String[] skills) {
        super(skills);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює об'єкт Editor з вказаним параметром електронного редагування.
     * 
     * @param electronicEditing Вказує, чи підтримує редактор електронне редагування (true) чи паперове (false).
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює об'єкт Editor з підтримкою електронного редагування за замовчуванням.
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Повертає рядкове представлення редактора, включаючи інформацію про редактора з суперкласу та уподобання щодо редагування.
     * 
     * @return Рядок, що представляє редактора та його уподобання щодо редагування.
     */
    @Override
    public String toString() {
        String s = super.toString() + "\nУподобання редагування: ";
        if (electronicEditing) {
            s += "електронне";
        } else {
            s += "паперове";
        }
        return s;
    }

    /**
     * Повертає вподобання редактора щодо редагування.
     * 
     * @return true, якщо редактор підтримує електронне редагування; false, якщо підтримує паперове редагування.
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлює вподобання редактора щодо редагування.
     * 
     * @param electronic Вказує, чи підтримує редактор електронне редагування (true) чи паперове (false).
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing = electronic;
    }
}
