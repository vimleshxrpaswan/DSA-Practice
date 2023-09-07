package linearsearchalgorithm;

public class MaximumWealth {

    static int maximumWealth(int [][] accounts){
        int answer = Integer.MIN_VALUE;

        //person = rol
        //account = col

        for (int person = 0; person < accounts.length; person++) {
            //when you start a new column , take a new sum for that row
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum  += accounts[person][account];
            }
            //check with overall answer
            if(sum > answer){
                answer=sum;
            }

        }

        return answer;
    }
    public static void main(String[] args) {

    }
}
