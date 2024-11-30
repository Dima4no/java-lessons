package lessons.arrays_demo;

public class ArraysDemo {

    // CREATE, ASSIGN, READ,
    public static void main(String[] args) {
        // 1. CREATE
        // - Создать массив -
        // Если мы не знаем заранее значений, кот. будут нах-ся в array -
        // data type [ ] name = new data type [size];
        int [] numbers = new int[3]; // [0][0][0]
        // Если не знаем заранее значений, кот. будут нах-ся в array -
        // data type [ ] name = {value1, value2, value3};
        String [] names = {"Tom", "Alice", "Sam"}; // ["Tom"]["Alice"]["Sam"]
        // 2. ASSIGN -
        // - Присвоить значения - name[index] = value;
        numbers[1] = 20;
        // [0][20][0]
        //  0   1  2
        numbers[2] = 30; // [0][20][30]
        // WARNING: ---> numbers[3] = 40; // ArrayIndexOutOfBoundsException
        // 3. READ -
        // - Прочитать значения - name[index];
        System.out.println(numbers[1]); // 20
        System.out.println(names[2]); // Sam
    }

}