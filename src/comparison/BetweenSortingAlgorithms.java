package comparison;

import sorts.bubbleSort.BubbleSort;
import sorts.heapSort.HeapSort;
import sorts.insertionSort.InsertionSort;
import sorts.quickSort.QuickSort;
import sorts.selectionSort.SelectionSort;
import sorts.shellSort.ShellSort;
import utils.PrintFormatting;
import utils.Results;

public class BetweenSortingAlgorithms {
    public static void main(String[] args) {
        int[] vector = new int[1_000_000];

        for(int i=0; i < vector.length; i++){
            vector[i] = (int) Math.floor(Math.random() * vector.length);
        }

        long start, end;
        Results results;
    

        System.out.println("\n\nBubble Sort");
        start = System.currentTimeMillis();
        results = BubbleSort.sort(vector.clone());
        end = System.currentTimeMillis();
        System.out.println("Time: " + (end-start) + "ms");
        System.out.println("Changes: " + results.getChanges());


        System.out.println("\n\nInsertion Sort");
        start = System.currentTimeMillis();
        results = InsertionSort.sort(vector.clone());
        end = System.currentTimeMillis();
        System.out.println("Time: " + (end-start) + "ms");
        System.out.println("Changes: " + results.getChanges());

        System.out.println("\n\nSelection Sort");
        start = System.currentTimeMillis();
        results = SelectionSort.sort(vector.clone());
        end = System.currentTimeMillis();
        System.out.println("Time: " + (end-start) + "ms");
        System.out.println("Changes: " + results.getChanges());

        System.out.println("\n\nShell Sort");
        start = System.currentTimeMillis();
        results = ShellSort.sort(vector.clone());
        end = System.currentTimeMillis();
        System.out.println("Time: " + (end-start) + "ms");
        System.out.println("Changes: " + results.getChanges());

        System.out.println("\n\nHeap Sort");
        start = System.currentTimeMillis();
        results = HeapSort.sort(vector.clone());
        end = System.currentTimeMillis();
        System.out.println("Time: " + (end-start) + "ms");
        System.out.println("Changes: " + results.getChanges());

        System.out.println("\n\nQuick Sort");
        start = System.currentTimeMillis();
        results = QuickSort.sort(vector.clone(), 0, vector.length);
        end = System.currentTimeMillis();
        System.out.println("Time: " + (end-start) + "ms");
        System.out.println("Changes: " + results.getChanges());

    }
}
