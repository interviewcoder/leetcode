package _138_CopyListWithRandomPointer;

class RandomListNode {
    int label;
    RandomListNode next;
    RandomListNode random;
    RandomListNode(int x) { 
        this.label = x; 
    }

    @Override
    public String toString() {
        return "" + label;
    }
};
