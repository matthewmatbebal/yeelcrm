import java.util.ArrayList;

public class ControlPanel {
    private ArrayList<Order> orderList = new ArrayList<>();
    private ArrayList<Employers> emplList = new ArrayList<>();

    public void addNewOrder(int price, int time, String employer) {
        Order order = new Order(price, time, employer);
        System.out.println("order was created");
        orderList.add(order);
    }

    public void addNewEmployer(String empName, String special) {
        Employers employers = new Employers(empName,special);
        System.out.println("employer was added");
        emplList.add(employers);
    }

    public void showEmployers() {
        for (int i = 0; i < emplList.size(); i++) {
            System.out.println(emplList.get(i));
        }
    }
}


/* надо сделать метод контрол панел, который будет добавлять заказ
* он будет пустым, внутри него надо будет вписывать поля для ордера */