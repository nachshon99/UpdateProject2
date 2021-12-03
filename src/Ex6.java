public class Ex6 {
    public static void main(String[] args) {
        int[]numbers1 = {20,40,70,10,50,70};
        int[]numbers2 = {30,90,10,10,20,10,50};
        int[] intersectionArr = intersectionArray(numbers1,numbers2);
        if(!isDoubleDigit(numbers1) || !isDoubleDigit(numbers2)){
            System.out.println("The array is not double digits");

        }
        else{
            for (int i = 0; i< intersectionArr.length;i++) {
                System.out.print(intersectionArr[i] + ", ");
            }
            System.out.println("");
            System.out.println("Is the array foreign? "+isForeign(numbers1,numbers2));

        }


    }
    public static boolean isDoubleDigit(int[]arr){
        boolean isDoubleDigit = false;
        for (int i = 0; i<arr.length;i++){
            if(arr[i] >=10 && arr[i]<=100){
                isDoubleDigit = true;
            }
            else{
                isDoubleDigit = false;
                break;
            }
        }
        return isDoubleDigit;
    }

    public static boolean isThereInArray(int[]arr, int num){
        for (int i = 0; i < arr.length;i++){
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }

    public static int[] intersectionArray(int[] doubleDigitNumbers1, int[] doubleDigitNumbers2 ){
        int[]intersection = new int[doubleDigitNumbers1.length];
        int indexOfArray = 0;
        int count = 0;
        if(isDoubleDigit(doubleDigitNumbers1) && isDoubleDigit(doubleDigitNumbers2)){
            for (int i=0; i< doubleDigitNumbers1.length;i++){
                int currentInt = doubleDigitNumbers1[i];
                for (int j = 0; j < doubleDigitNumbers2.length;j++){
                    if(currentInt == doubleDigitNumbers2[j]){
                        if(!isThereInArray(intersection, currentInt)) {
                            intersection[indexOfArray] = currentInt;
                            count++;
                            indexOfArray++;
                        }
                    }

                }
            }
        }
        int[] intersectionToReturn = new int[count];
        for (int m = 0; m < intersectionToReturn.length;m++){
            if(m < count){
                intersectionToReturn[m] = intersection[m];
            }
            else {
                break;
            }
        }
        return intersectionToReturn;
    }

    public static boolean isForeign(int[] doubleDigitNumbers1, int[]doubleDigitNumbers2){
        int[] isIntersection = intersectionArray(doubleDigitNumbers1,doubleDigitNumbers2);
        if(isIntersection.length == 0) {
            return true;
        }

        return false;
    }
}
