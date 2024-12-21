package ex2;

interface SortingAlgorithm {
    void sort();
}

class SelectionSort implements SortingAlgorithm {
    @Override
    public void sort() {
        System.out.println("Selection sort is sorting the items...");
    }
}

class MergeSort implements SortingAlgorithm {
    @Override
    public void sort() {
        System.out.println("Merge sort is sorting the items...");
    }
}

class InsertionSort implements SortingAlgorithm {
    @Override
    public void sort() {
        System.out.println("Insertion sort is sorting the items...");
    }
}
