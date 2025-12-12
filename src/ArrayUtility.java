public class ArrayUtility {

    public static void print(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static int sum(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double average(int[] array) {
        int sum = sum(array);
        double aver = sum *100 / array.length;
        return (double) aver/100.0;
    }

    public static int minimum(int[] array) {
        int smallest = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int maximum(int[] array) {
        int biggest = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] > biggest) {
                biggest = array[i];
            }
        }
        return biggest;
    }

    public static int evenCount(int[] array) {
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int[] temp = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        for(int i = 0; i < array.length; i++) {
            array[i] = temp[array.length - 1 - i];
        }
        return array;
    }

    public static void reverseTwo(int[] array) {
        int[] temp = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        for(int i = 0; i < array.length; i++) {
            array[i] = temp[array.length - 1 - i];
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for(int i = 0; i < array.length; i++) {
            if(array[i].equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for(int i = 0; i < array.length; i++) {
            array[i] = array[i] * n;
        }
    }

    public static String toString(int[] array) {
        String result = "";
        for(int i = 0; i < array.length; i++) {
            result += array[i];
            if(i < array.length - 1) {
                result += ", ";
            }
        }
        return result;
    }

    public static boolean twoSum(int[] array, int num) {
        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] + array[j] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int[] temp = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array[0] = temp[array.length - 1];
        for(int i = 1; i < array.length; i++) {
            array[i] = temp[i - 1];
        }
    }

    public static void shiftLeft(int[] array) {
        int[] temp = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array[array.length - 1] = temp[0];
        for(int i = 0; i < array.length - 1; i++) {
            array[i] = temp[i + 1];
        }
    }

    public static void shiftRightNTimes(int[] array, int n) {
        int[] temp = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        for(int i = 0; i < n; i++) {
            array[i] = temp[array.length - n + i];
        }
        for(int i = n; i < array.length; i++) {
            array[i] = temp[i - n];
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        int[] temp = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        for(int i = 0; i < n; i++) {
            array[array.length-n+i] = temp[i];
        }
        for(int i = n; i < array.length; i++) {
            array[i-n] = temp[i];
        }
    }


}
