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


// 2nd apprach -> using HashMap;
 
// import java.util.HashMap;
// import java.util.Map;

// class Solution {
//     public int romanToInt(String s) {
//         Map<Character, Integer> map = new HashMap<>();

//         map.put('I', 1);
//         map.put('V', 5);
//         map.put('X', 10);
//         map.put('L', 50);
//         map.put('C', 100);
//         map.put('D', 500);
//         map.put('M', 1000);

//         int result = 0;

//         for (int i = 0; i < s.length(); i++) {
//             int current = map.get(s.charAt(i));

//             if (i + 1 < s.length()
//                     && current < map.get(s.charAt(i + 1))) {
//                 result -= current;
//             } else {
//                 result += current;
//             }
//         }

//         return result;
//     }
// }