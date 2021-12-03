public class Ex4 {
    public static void main(String[] args) {
        int[] numbers = {1,4,7,1,8,9,2,0,1,3,8,9,0,10};
        int [] arrNonDuplicates =numbersNonDuplicates(numbers);
        for (int i = 0; i < arrNonDuplicates.length;i++){
            System.out.print(arrNonDuplicates[i]+", ");
        }
    }

    public static boolean isThereInArray(int[]arr, int num){
        for (int i = 0; i < arr.length;i++){
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }

    public static int[] numbersNonDuplicates(int[]numbers){
        int indexOfArr = 0;
        int countOfLengthArray = 0;
        int[] arrNonDuplicates = new int [numbers.length];
        for (int k = 0; k < arrNonDuplicates.length; k++){
            arrNonDuplicates[k] = -999;
        }
        for (int i =0 ;i<numbers.length; i++){
            int currentIndex = numbers[i];

            if(!isThereInArray(arrNonDuplicates,currentIndex)){
                arrNonDuplicates[indexOfArr] = currentIndex;
                indexOfArr++;
                countOfLengthArray++;
            }
        }
        int[] arrNonDuplicatesToReturn = new int[countOfLengthArray];
        for (int j = 0; j < arrNonDuplicatesToReturn.length; j++){
            if(j <= countOfLengthArray){
                arrNonDuplicatesToReturn[j] = arrNonDuplicates[j];
            }
            else {
                break;
            }
        }
        return arrNonDuplicatesToReturn;
    }
}
