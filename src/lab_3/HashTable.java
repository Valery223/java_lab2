package lab_3;

import java.util.LinkedList;

public class HashTable <K, V> {
    private LinkedList<Entry<K, V>>[] table;
    private final int tableSize = 5;

    //Cоздаем пустые List
    public HashTable(){
        table = new LinkedList[tableSize];
        for(int i = 0; i < tableSize; i++){
            table[i] = new LinkedList<>();
        }
    }

    public void put(K key, V value){
        int index = hashKey(key);
        //Если такой ключ есть, то нужно заменить значение
        for(Entry<K,V> entry : table[index]){
            if(entry.getKey().equals(key)){
                entry.setValue(value);
                return;
            }
        }
        //Если нет
        table[index].add(new Entry<K,V>(key,value));

    }

    public V get(K key){
        int index = hashKey(key);
        for(Entry<K,V> entry : table[index]){
            if(entry.getKey().equals(key)){
                return entry.getValue();
            }
        }
        return null; // ключ не найдет
    }

    public void remove(K key){
        int index = hashKey(key);
        for(Entry<K,V> entry : table[index]){
            if(entry.getKey().equals(key)){
                table[index].remove(entry);
            }
        }
    }

    public int size(){
        int size = 0;
        for(LinkedList<Entry<K,V>> list : table){
            size += list.size();
        }
        return size;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public int hashKey(K key){
        return key.hashCode() % tableSize;
    }

}
