package org.example;

public class Main {
    public static void main(String[] args) {
        HashTable<String,Integer> mp = new HashTable<String, Integer>();
        mp.put("Apple",123);
        mp.put("mango",1245);
        mp.put("banana",12893);

        int val = mp.get("Apple");
        System.out.println("Apple"+" "+val);
        mp.remove("Apple");

        mp.printHashTable();
    }
}
