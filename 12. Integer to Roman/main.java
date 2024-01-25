class Solution {
    public String intToRoman(int num) {
        Map<Integer, String> specialNum = new HashMap<>();
        specialNum.put(4, "IV");
        specialNum.put(9, "IX");
        specialNum.put(40, "XL");
        specialNum.put(90, "XC");
        specialNum.put(400, "CD");
        specialNum.put(900, "CM");
        int digit = 0;
        String ansString = "";
        while(num != 0){
            int remainder = num % 10;
            int checkNum =  remainder * (int) Math.pow(10, digit);
            num = num / 10;
            digit ++;
            if(remainder == 4 || remainder == 9){
                ansString = specialNum.get(checkNum) + ansString;
            }else{
                String tempString = "";
                while(checkNum != 0){
                    char roman = 'A'; 
                    if(1 <= checkNum && checkNum < 5){
                        roman = 'I';
                        checkNum = checkNum - 1;
                    }else if(5 <= checkNum && checkNum < 10){
                        roman = 'V';
                        checkNum = checkNum - 5;
                    }else if(10 <= checkNum && checkNum < 50){
                        roman = 'X';
                        checkNum = checkNum - 10;
                    }else if(50 <= checkNum && checkNum < 100){
                        roman = 'L';
                        checkNum = checkNum - 50;
                    }else if(100 <= checkNum && checkNum < 500){
                        roman = 'C';
                        checkNum = checkNum - 100;
                    }else if(500 <= checkNum && checkNum < 1000){
                        roman = 'D';
                        checkNum = checkNum - 500;
                    }else{
                        roman = 'M';
                        checkNum = checkNum - 1000;
                    }
                    tempString = tempString + roman;
                }
                ansString = tempString + ansString;
            }

        }
        return ansString;
    }
}