package Day8;

//Number of Even and Odd Bits
class Solution {
    public int[] evenOddBit(int n) {
        int evenCount = 0;
        int oddCount = 0;
        int index = 0;

        while(n > 0){
            if((n & 1) == 1){
                if(index % 2 == 0){
                    evenCount++;
                }
                else{
                    oddCount++;
                }
            }
            n >>= 1;
            index++;
        }

        return new int[]{evenCount, oddCount};
    }
}