public class Employers {

    String empName;
    String special;

    public Employers(String empName, String special) {
        this.empName = empName;
        this.special = special;
    }

    @Override
    public String toString() {
        return "Имя : " + empName + "; Специальность: " + special;
    }
}
