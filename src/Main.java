//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ControlPanel yeelPanel = new ControlPanel();
        while (true) {
            System.out.println("Что вы хотите сделать?");
            System.out.println("1 - добавить заказ");
            System.out.println("2 - добавить сотрудника");
            System.out.println("3 - вывести выбрать сотрудников");
            System.out.println("4 - вывести выбрать поисковика");
            String inputText = in.nextLine();
            System.out.println(inputText);

            switch (inputText) {
                case "1":
                    System.out.println("Введите цену");
                    int price = Integer.parseInt(in.nextLine());
                    System.out.println("Введите время");
                    String time = in.nextLine();
                    System.out.println("Введите имя исполнителя");
                    String employer = in.nextLine();

                    yeelPanel.addNewOrder(price, Integer.parseInt(time), employer);
                    break;
                case "2":
                    System.out.println("Введите имя сотрудника");
                    String empName = in.nextLine();
                    System.out.println("Введите специальность сотрудника");
                    String special = in.nextLine();
                    yeelPanel.addNewEmployer(empName, special);
                    break;
                case "3":
                    System.out.println("Список Сотрудников: ");
                    yeelPanel.showEmployers();
                    break;
                default:
                    System.out.println("ты сказал что ты шаришь в этой теме ты бля");
            }
        }
    }
}