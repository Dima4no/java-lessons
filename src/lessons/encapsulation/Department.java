package lessons.encapsulation;

public class Department {

    private String depTitle;
    private int amountOfEmployees;
    private double budget;

    public Department(String depTitle, int amountOfEmployees, double budget) {
        this.depTitle = depTitle;
        this.amountOfEmployees = amountOfEmployees;
        this.budget = budget;
    }

    // GETTER
    /*
       Все GETTER методы имеют public доступ
       Тип возврата у геттера, всегда должен соответствовать типу переменной, которую он возвращает
       Имя метода должно начинаться с get, за которым следует имя переменной с большой буквы
       Геттеры не имеют параметров
     */

    public String getDepTitle() {
        return depTitle;
    }

    public double getBudget() {
        return budget;
    }

    public int getAmountOfEmployees() {
        return amountOfEmployees;
    }

    // SETTER
    /*
         Все SETTER методы имеют public доступ
         Тип возврата у сеттера, всегда должен быть void
         Имя метода должно начинаться с set, за которым следует имя переменной с большой буквы
         Сеттеры должны принимать один параметр, который является типом переменной, которую они устанавливают
     */

    public void setDepTitle(String depTitle) {
        this.depTitle = depTitle;
    }

    public void setAmountOfEmployees(int amountOfEmployees) {
        this.amountOfEmployees = amountOfEmployees;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Department title: " + depTitle + "\n" +
            "Amount of employees: " + amountOfEmployees + "\n" +
            "Budget: " + budget;
    }
}
