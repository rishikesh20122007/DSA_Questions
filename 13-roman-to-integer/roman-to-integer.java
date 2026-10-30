class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int Sum = 0;
        

        for(int i = 0 ; i < n; i++){
            int S1  = getValue(s.charAt(i));

            if(i + 1 < n){
                int S2 = getValue(s.charAt(i + 1));

                if(S1 < S2){
                    Sum += S2 - S1;
                    i++;
                }
                else{
                    Sum += S1;
                }
            }
            else{
                Sum += S1;  
            }
        }

        return Sum;
    }

    public int getValue(char ch){
        switch(ch) {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }
}