public class CustumMath {
    private boolean isPrime(int num){
        if(num <= 1)
            return false;
        for(int i = 2; i * i < num; i++ ){
            if(num % i == 0)
                return false;
        }
        return true;
    }
    public int nextPrime(int num){
        int n = num;
        while(true){
            if(isPrime(n))
                return n;
            n++;
        }
    }
}
