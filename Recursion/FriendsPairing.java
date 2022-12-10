/*  Given n friends, each one can remain single or can be paired up with some
    other friends. Each friend can be paired only once. find out the total
    number of ways in which friends can remain single or can be paired up.
*/


package Recursion;

public class FriendsPairing {

    public static int pairing(int n){
        //base case
        if(n == 1 || n == 2){
            return n;
        }

        //if friends remain single in party
        int single = pairing(n - 1);

        //friends in pair
        int pair = pairing(n - 2);

        int totalWays = single + ((n-1) * pair);
        return totalWays;

        // return pairing(n - 1) + ((n-1)*pairing(n - 2));

    }
    public static void main(String[] args){
        int res = pairing(7);
        System.out.println(res);

    }
}
