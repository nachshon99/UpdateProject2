public class Ex3 {
    public static void main(String[] args) {
        System.out.println(isFormatOfPhoneNumber("972528090360"));
        System.out.println(isFormatOfPhoneNumber("0528090360"));
        System.out.println(isFormatOfPhoneNumber("052-8090360"));
    }

    public static String isFormatOfPhoneNumber(String phoneNumber){
        String PhoneNumberToReturn;
        if(phoneNumber.length() == 10){
            if(phoneNumber.charAt(0)=='0'){
                if(phoneNumber.charAt(1)=='5') {
                    if (isAllElementsIsNumbers(phoneNumber,2)) {
                        PhoneNumberToReturn = printLettersBeforeIndex(phoneNumber,3) +'-' + printLettersAfterIndex(phoneNumber,3);
                        return PhoneNumberToReturn;
                    }
                }

            }
        }
        else if(phoneNumber.length() == 11){
            if(phoneNumber.charAt(0)=='0' && phoneNumber.charAt(1) == '5' ) {
                if(phoneNumber.charAt(3) =='-') {
                    PhoneNumberToReturn = printLettersBeforeIndex(phoneNumber,3) + printLettersAfterIndex(phoneNumber,4);
                    if(isAllElementsIsNumbers(PhoneNumberToReturn,2)){
                        PhoneNumberToReturn = phoneNumber;
                        return PhoneNumberToReturn;
                    }
                }
            }
        }
        else if(phoneNumber.length() ==12){
            if(phoneNumber.charAt(0) =='9' && phoneNumber.charAt(1) =='7' && phoneNumber.charAt(2) =='2' && phoneNumber.charAt(3) =='5'){
                if(isAllElementsIsNumbers(phoneNumber,4)){
                    PhoneNumberToReturn= '0'+ printLettersAfterIndex(printLettersBeforeIndex(phoneNumber,5),3) + '-' + printLettersAfterIndex(phoneNumber,5);
                    return PhoneNumberToReturn;
                }
            }
        }
        return "";
    }

    public static boolean isAllElementsIsNumbers(String phoneNumber, int index){
        boolean isAllNumbers = false;
        for (int i = index; i < phoneNumber.length();i++){
            if(phoneNumber.charAt(i) == '0' || phoneNumber.charAt(i) == '1' || phoneNumber.charAt(i) == '2' || phoneNumber.charAt(i) == '3' ||
                    phoneNumber.charAt(i) == '4' || phoneNumber.charAt(i) == '5' || phoneNumber.charAt(i) == '6' ||
                    phoneNumber.charAt(i) == '7' || phoneNumber.charAt(i) == '8' || phoneNumber.charAt(i) == '9'){
                isAllNumbers = true;
            }
            else {
                isAllNumbers = false;
                break;
            }
        }
        return isAllNumbers;
    }

    public static  String printLettersAfterIndex(String str, int index){
        String st = "";
        for (int i = index; i < str.length();i++){
            st +=str.charAt(i);
        }
        return st;
    }
    public static String printLettersBeforeIndex(String str, int index){
        String st = "";
        for (int i=0; i<index; i++){
            st += str.charAt(i);
        }
        return st;
    }
}
