package Day21Generics;
//печатаем массив с применением дженериков
class Printer <T> {
    static <E> void printArray(E[] arr) {
        for (E x : arr)
            System.out.println(x);
    }
}