package Day8;

class GFG{
    static String oddEven(int N){
        // code here
        int bitMask = 1;
        if(( N & bitMask) == 0){
            return "even";
        }
        return "odd";
    }
}