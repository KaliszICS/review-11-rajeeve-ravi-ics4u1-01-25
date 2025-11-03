public class PracticeProblem {

	public static void main(String args[]) {
        //Q1
        int[] intArray = createIntArray();
        System.out.print("createIntArray result: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        //Q2
        String[] stringArray = createArray("apple", "banana", "cherry", "date");
        System.out.print("createArray result: ");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i] + " ");
        }
        System.out.println();

        //Q3
        int index = findValue(3, intArray);
        System.out.println("findValue(3) result: " + index);
        index = findValue(10, intArray);
        System.out.println("findValue(10) result: " + index);

        //Q4
        String[] testArray = {"apple", "banana", "apple", "cherry", "apple", "date"};
        int stringIndex = findThirdValue("apple", testArray);
        System.out.println("findThirdValue('apple') result: " + stringIndex);
        stringIndex = findThirdValue("banana", testArray);
        System.out.println("findThirdValue('banana') result: " + stringIndex);
    }

    public static int[] createIntArray() {
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static String[] createArray(String str1, String str2, String str3, String str4) {
        String[] array = new String[4];
        array[0] = str1;
        array[1] = str2;
        array[2] = str3;
        array[3] = str4;
        return array;
    }

    public static int findValue(int value, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int findThirdValue(String value, String[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                count++;
                if (count == 3) {
                    return i;
                }
            }
        }
        return -1;
    }
}
