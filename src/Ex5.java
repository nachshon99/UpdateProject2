public class Ex5 {
    public static void main(String[] args) {
        int[]numbers = {1,3,5,6,7,5,2,1,0};
        System.out.println(checkArrUpAndDown(numbers));
    }
    public static int checkArrUpAndDown(int[]arr){
        int max = arr[0];
        int index = 0;
        boolean isDown = false;

        for (int i = 1; i <= arr.length;i++){
            index = i;
            if(max < arr[i]){
                max = arr[i];
            }
            else {
                index = i-1;
                break;
            }
        }

        int min = arr[index];
        for (int j = index; j < arr.length-1;j++){
            if(arr[j+1]<min) {
                min = arr[j + 1];
                isDown = true;
            }
            else {
                isDown = false;
                break;
            }

        }
        if(isDown) {
            return arr[index];
        }
        return -1;
    }
}
