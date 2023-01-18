package Hashing;
import java.util.*;

/*
        NOTE: In extreme worst case TC = O(n)
 */

public class HashMapImplementation {
    static class Implement<K, V> {  //generics

        private class Node{
            K key;
            V value;

           public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> buckets[];  //create a LinkedList array for bucket   // N = bucket.length;


        @SuppressWarnings("unchecked")
        public Implement() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i = 0; i < 4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }


        //hashFunction for return bi(i.e. bucketIndex)
        private int hashFunction(K key){
            int hc = key.hashCode();  //change the form
            return Math.abs(hc) % N;
        }

        //searchInLL() for data index 
        private int searchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            int di = 0;

            for(int i = 0; i < ll.size(); i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return di;
                }
                di++;
            }
            return -1;
        } 

        @SuppressWarnings("unchecked")
        //Rehash function
        public void rehash(){
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];
            N = N*2;
            for(int i = 0; i < buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }

            //nodes -> add in bucket
            for(int i = 0; i < oldBucket.length; i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j = 0; j < ll.size(); j++){
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }


        //Insert
        public void put(K key, V value){   //O(1)
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di != -1){
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = n/N;
            if(lambda > 2.0){
                rehash();
            }
        }

        //ContainsKey
        public boolean containsKey(K key){ //O(1)
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di != -1){
                return true;
            } else {
                return false;
            }
        }

        //Remove
        public V remove(K key){  //O(1)
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di != -1){
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else {
                return null;
            }
        }

        //Get
        public V get(K key){  //O(1)
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di != -1){
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        // keySet function for all keys in HashMap
        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();

            for(int i = 0; i < buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for(Node node : ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }

         //IsEmpty
         public boolean isEmpty(){  //O(1)
            return n == 0;
        }
    }

    public static void main(String[] args){
        Implement<String, Integer> impHM = new Implement<>();
        impHM.put("India", 140);
        impHM.put("Chaina", 150);
        impHM.put("USA", 40);
        impHM.put("Pakistan", 20);

        ArrayList<String> keys = impHM.keySet();
        for(String key : keys){
            System.out.println(key);
        }

        System.out.println(impHM.get("India"));

        System.out.println(impHM.remove("India"));

        System.out.println(impHM.get("India"));

    }
}
