package HashMap;

import java.util.LinkedList;
public class implementation {
    //creation of hashmap
    static class MyHashMap<K,V>{
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFALUT_LOAD_FACTOR = 0.75f;

        //node
        private class Node{
            K key;
            V value;
            Node(K key, V value)
            {
                this.key = key;
                this.value = value;
            }
        }
        int n; //nubmer of elements

        //Array of linked lists
        private LinkedList<Node>[] buckets;

        //creates an array of empty linled lists
        private void initBuckets(int N) // N is capacity or size of bucket array
        {
            //created Array of linkedlists of size N and assigned to bucket array ie array of linkedlists
            buckets = new LinkedList[N];

            //At each index of Buckets creating empty linkedlist
            for(int i = 0; i<buckets.length;i++)
            {
                buckets[i] = new LinkedList<>();
            }
        }
        //constructor
        public MyHashMap(){
            initBuckets(DEFAULT_CAPACITY); //creates array of linkedlist with empty linked lists

        }

        //Hash function which takes key and generates bucket index
        private int HashFunc(K key)
        {
            int hc = key.hashCode(); //key.hashCode() is a method which takes a key and generates a hashvalue for it but it can be any value so take mod with length of the buckets
            return (Math.abs(hc))% buckets.length;

        }

        //traverse the ll and looks for a node which have the key
        private int searchInBucket(LinkedList<Node> currBucket, K key)
        {
            for(int i = 0;i<currBucket.size();i++)
            {
                if(currBucket.get(i).key ==key)
                {
                    return i;
                }
            }
            return -1;
        }
        private void rehash(){
            //saving old bucketArray for rehashing
            LinkedList<Node>[] oldBucketArray = buckets;
            //creating new bucketArray with double size
            initBuckets(oldBucketArray.length*2);

            //copying data from old bucket to new bucket
            for(LinkedList<Node> ll : oldBucketArray)
            {
                //because we are adding values again in the new bucketList
                n=0;
                for(Node node: ll)
                {
                    put(node.key,node.value);
                }
            }
        }

        public int size() //Return number of elements
        {
            return n;
        }

        public void put(K key, V value)
        {
            int bi = HashFunc(key);
            //that bucket in which we have to add/update
            LinkedList<Node> currBucket = buckets[bi];

            //index of the Node at which this key is present in the linkedlist
            int ei = searchInBucket(currBucket,key);
            if(ei != -1) //Key exists so update the value
            {
                currBucket.get(ei).value = value;
            }else { // Key does't exits so add new node
                 Node node = new Node(key,value);
                 currBucket.add(node);
                 n++;
            }
            //rehashing, here we tool buckets.length and not capacity because capacity is changing and current capacity is size of the bucket
            if(n >= buckets.length * DEFALUT_LOAD_FACTOR){
                rehash();
            }

        }
        public V get(K key)
        {
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket,key);

            //key found so return the value
            if(ei != -1)
            {
                Node currNode =  currBucket.get(ei);
                return currNode.value;
            }
            return null;
        }
        public V remove(K key)
        {
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket,key);

            //key found so return the value
            if(ei != -1)
            {
                Node currNode =  currBucket.get(ei);
                currBucket.remove(ei);
                n--;
                return currNode.value;
            }else {
                return null;
            }
        }
        public int Capacity(){
            return buckets.length;
        }
        public float Load(){
            return (n*1.0f)/buckets.length;
        }



    }

    public static void main(String[] args) {
        MyHashMap<String,Integer> mp = new MyHashMap<>();
        mp.put("a",1);
        mp.put("b",2);
        mp.put("c",3);
        mp.put("d",4);
        mp.put("e",5);
        mp.put("f",5);
        mp.put("h",5);
        System.out.println(mp.get("d")); //4
        System.out.println(mp.size()); //5
        System.out.println(mp.remove("c")); //3
        System.out.println(mp.size()); //4
        System.out.println("Capacity " + mp.Capacity());
        System.out.println("Load factor " + mp.Load());
    }

}
