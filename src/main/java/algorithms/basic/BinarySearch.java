package algorithms.basic;

public class BinarySearch {

    /**
     * Метод runBinarySearchIteratively принимает sortedArray, ключ и низкие и высокие индексы sortedArray в качестве
     * аргументов. Когда метод запускается в первый раз, low, первый индекс sortedArray, равен 0, в то время как high,
     * последний индекс sortedArray, равен его длине – 1.
     * Middle - это средний индекс sortedArray. Теперь алгоритм выполняет цикл while, сравнивая ключ со значением
     * среднего индекса в массиве sortedArray.
     * Обратите внимание, как генерируется средний индекс (int mid = low + ((high – low) / 2).
     * Это сделано для работы с чрезвычайно большими массивами. Если средний индекс генерируется простым получением
     * среднего индекса (int mid = (low + high) / 2), может произойти переполнение массива, содержащего 230 или
     * более элементов, поскольку сумма low + high может легко превысить максимальное положительное значение int.
     */
    public int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low  + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
