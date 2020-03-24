package common;

import Generic.Category;
import Generic.FoodItem;
import Generic.GenericItem;
import Generic.TechnicalItem;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //Текстовая строка, хранящая информацию о пищевом товаре в формате <name>;<price>;<expires>
        String line = "Конфеты 'Маска';45;120";

        //Split по ; в массив текстовых строк
        String[] itemFld = line.split(";");

        //Инициализирование входных данных
        String name = itemFld[0];
        float price = Float.parseFloat(itemFld[1]);
        short expires = Short.parseShort(itemFld[2]);

        //Создание экземпляра класса FoodItem
        FoodItem food = new FoodItem(name, price, expires);
        //Вывод поученных данных
        food.printAll();
    }
}
