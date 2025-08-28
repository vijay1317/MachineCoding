package org.example;

import java.util.LinkedList;

public class HashTable<K,V> {

    private static class Entry<K,V>{
        K key;
        V value;
        public Entry(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

    private static final int SIZE = 16;
    private LinkedList<Entry<K,V>>[] buckets;

    public HashTable(){
        buckets =  new LinkedList[SIZE];
        for(int i=0;i<SIZE;i++){
           buckets[i] =  new LinkedList<>();
        }
    }

    public  void put(K key, V value){
        int index = getIndex(key);

        LinkedList<Entry<K,V>> bucket = buckets[index];

        for(Entry<K,V> e: bucket){
            if(e.key.equals(key)){
                e.value = value;
                return ;
            }
        }
        bucket.add(new Entry<K, V>(key, value));

    }

    public V get(K key){
        int index = getIndex(key);
        LinkedList<Entry<K,V>> bucket = buckets[index];
        for(Entry<K,V> e: bucket){
            if(e.key.equals(key)){
                return e.value;
            }
        }
        return null;
    }

    public boolean remove(K key){
        int index = getIndex(key);
        LinkedList<Entry<K,V>> bucket = buckets[index];
        for(Entry<K,V> e:bucket){
            if(e.key.equals(key)){
                bucket.remove(e);
                return true;
            }
        }
        return false;
    }



    private int getIndex(K key){
        /*
         * every method has hashCode() -> it can return -ve, +ve, zero -> we have to take abs - for index
         */
        return Math.abs(key.hashCode() % SIZE) ;

    }

    public void printHashTable(){
        for(int i=0;i<SIZE;i++){
            LinkedList<Entry<K,V>> bucket = buckets[i];
            for(Entry<K,V> e:bucket){
                System.out.println(e.key +" : "+e.value);
            }
        }
    }


}
