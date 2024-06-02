package Recursion;

import java.util.ArrayList;

    public class PrintAllSubset{

        public static void printSubset(ArrayList<Integer> subset) {
            for(int i = subset.size()-1; i >= 0; i--){
                System.out.print(subset.get(i) + " ");
            }
            System.out.println();
        }

        public static void findSubset(int n, ArrayList<Integer> subset){
            if(n == 0){
                printSubset(subset);
                return;
            }            

            //add n in the subset
            subset.add(n);
            findSubset(n-1, subset);

            //not add n in the subset
            subset.remove(subset.remove(subset.size() - 1));
            findSubset(n-1, subset);
        }
        public static void main(String[] args){
            int n = 3;
            findSubset(n, new ArrayList<>());

        }
    }