package Generic;

public class GenericItem implements Cloneable {
    private static int currentID; // Хранение максимально назначенный ID товара в текущей сессии
    protected int ID; // ID товара
    protected String name; // Наименование товара
    protected float price; //Цена товара
    protected String analog;// Аналог
    protected Category category = Category.GENERAL;//Поле типа Category со значением по умолчанию GENERAL


    //Конструктор №1
    public GenericItem(String name, float price, Category category) {
        this.ID = GenericItem.currentID++; // Инициализирование поле ID товара очередным свободным номером
        this.name = name;
        this.price = price;
        this.category = category;
    }

    //Конструктор №2
    public GenericItem(String name, float price, GenericItem analog) {
        this.ID = GenericItem.currentID++; // Инициализирование поле ID товара очередным свободным номером
    }

    //Конструктор №3
    public GenericItem() {
        this.ID = GenericItem.currentID++; // Инициализирование поле ID товара очередным свободным номером
    }

    //Метод вывода данных
    public void printAll() {
        System.out.printf("ID: %d , Name: %-20s , Price:%5.2f , Analog: %-20s, Category:%-8s\n", ID, name, price, analog, category);
    }

    //Метод сравнения с помощью метода equals 2-х объектов класса
    public boolean equals(Object o) {
        if (hashCode() != o.hashCode()) {
            return false;
        }
        if (!(o instanceof GenericItem)) return false;
        GenericItem temp = (GenericItem) o;
        return this.ID == temp.ID && this.name.equals(temp.name) && this.price == temp.price && this.analog.equals(temp.analog);
    }

    //Метод клонирования экземпляра класса
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //Метод перевода в строку
    public String toString() {
        return "ID: " + this.ID + "\tName: " + this.name + "\tPrice: " + this.price +
                "\tAnalog: " + analog;
    }
}

