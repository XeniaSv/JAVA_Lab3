package Generic;

public class U0901WorkArray<T extends Number> {
    private T[] arrNum; // Массив с типом, указанным в ограничении

    public U0901WorkArray(T[] numP) {
        arrNum = numP; // Присваивание ссылки входного параметра
    }

    //Метод суммирования чисел массива
    public double sum() {
        double doubleWork = 0;
        for (T number : arrNum) {
            doubleWork += number.doubleValue();
        }
        return doubleWork;
    }

}
