/**
 * Time : O(); Space : O()
 * @tag : Data Structure
 * @by  : Steven Cooks
 * @date: Jun 29, 2015
 *******************************************************************************
 * Description: 
 * 
 * Design and implement a data structure for Least Recently Used (LRU) cache. 
 * It should support the following operations: get and set. 
 *  get(key) - Get the value (will always be positive) of the key if 
 *             the key exists in the cache, otherwise return -1. 
 *  set(key, value) - Set or insert the value if the key is not already present. 
 *             When the cache reached its capacity, it should invalidate the least 
 *             recently used item before inserting a new item.
 * 
 *******************************************************************************
 * {@link https://leetcode.com/problems/lru-cache/ }
 */
package _146_LRUCache;

import java.util.HashMap;
import java.util.Map;

/** see test {@link _146_LRUCache.SolutionTest } */
public class Solution {

    // memory that stores <key, value> mapping
    private Map<Integer, Item> memo;

    // dummy beginning pointer
    private Item begin;

    // dummy ending pointer
    private Item end;

    private int capacity;

    private int count = 0;

    public Solution(int capacity) {
        this.capacity = capacity;
        memo = new HashMap<>(capacity);
        // two dummy pointers
        begin = new Item(0, 0);
        end = new Item(0, 0);
        begin.next = end;
        end.pre = begin;
    }

    public int get(int key) {
        if (!memo.containsKey(key)) {
            return -1;
        } else {
            // return value and refresh memory
            return freshMemo(memo.get(key));
        }
    }

    public void set(int key, int value) {
        if (memo.containsKey(key)) {
            // update and refresh memory
            memo.get(key).value = value;
            freshMemo(memo.get(key));
        } else {
            // create new item and insert to end of cache
            add(key, value);
        }
    }

    // delete key from cache queue and add it to end of cache queue
    private int freshMemo(Item item) {
        deleteItem(item);
        addItem(item);
        return item.value;
    }
    
    // if cache reached capacity, delete the lru item.
    // add new item to end of cache
    private boolean add(int key, int value) {
        if (count == capacity && begin != end) {
            // delete least recently used item, not the item to be added!
            memo.remove(begin.next.key);
            deleteItem(begin.next);
        }
        Item item = new Item(key, value);
        memo.put(key, item);
        return addItem(item);
    }

    // add item to end of linked list
    private boolean addItem(Item item) {
        end.pre.next = item;
        item.pre = end.pre;
        item.next = end;
        end.pre = item;
        count++;
        return true;
    }

    // delete item from linked list
    private void deleteItem(Item item) {
        if (item != null && item.pre != null && item.next != null) {
            item.pre.next = item.next;
            item.next.pre = item.pre;
            item = null;
            count--;
        }
    }

    // doubly-linked list node which wraps key and value
    private class Item {
        private int key;
        private int value;
        private Item pre;
        private Item next;

        public Item(int k, int v) {
            key = k;
            value = v;
            pre = null;
            next = null;
        }
        
        @Override
        public String toString() {
            return value + "";
        }
    }

    
    @Override
    public String toString() {
        Item item = begin.next;
        String result = "[";
        while (item != end) {
            result += item.value + "->";
            item = item.next;
        }
        return result.substring(0, result.length() - 2) + "]"; 
    }

}
