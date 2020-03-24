package Generic;

public class U0901Main {
    public static void main(String[] args) {
        //Входные данные
        Integer[] intArr = {10, 20, 15};
        Float[] floatArr = new Float[5];
        for (int i = 0; i < 5; i++) {
            floatArr[i] = (float) (Math.random() * 10);
        }

        //Создание экземпляров класса U0901WorkArray
        U0901WorkArray<Integer> insWorkArrayInt = new U0901WorkArray<Integer>(intArr);
        System.out.println(insWorkArrayInt.sum());
        U0901WorkArray<Float> insWorkArrayFloat = new U0901WorkArray<Float>(floatArr);
        System.out.println(insWorkArrayFloat.sum());

        
        String[] strArr = {"Hello", "World"};
        //Type parameter 'java.lang.String' is not within its bound; should extend 'java.lang.Number'
        //U0901WorkArray<String> insWorkArrayString = new U0901WorkArray<String>(strArr);

    }
}
