public class Main {
    public static void main(String[] args) {
        int[] currentArr = {1,2,3,4,5,6,7};
        int[] afterArr = removeX(3,currentArr);
        for (int i = 0; i < afterArr.length; i++) {
            System.out.println(afterArr[i]);
        }
    }

    public static int[] removeX(int number, int[] arr) {
        boolean result = isAlive(number, arr);
        int size = arr.length - 1;
        int[] newArr = new int[size];
        if (result) {
            for (int i = 0; i <= arr.length; i++) {
                if(number == arr[i]){
                    continue;
                }
                // chưa add được đúng vị trí element
                newArr[i] = arr[i];
            }
        }
        return newArr;
    }

    private static boolean isAlive(int number, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number)
                return true;
        }
        return false;
    }
}
