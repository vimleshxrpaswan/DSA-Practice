import java.util.ArrayDeque;
import java.util.Deque;

class DistinctCombination
{
    // Function to print all distinct combinations of length `k`, where the
    // repetition of elements is allowed
    public static void findCombinations(int[] A, Deque<Integer> out,
                                        int k, int i, int n)
    {
        //if the combination size is `k`, print it
        if (out.size() == k)
        {
            System.out.println(out);
            return;
        }
        // start from the previous element in the current combination till the last element
        for (int j = i; j < n; j++)
        {
            // add current element `A[j]` to the solution and recur with the
            // same index `j` (as repeated elements are allowed in combinations)
            out.addLast(A[j]);
            findCombinations(A, out, k, j, n);
            //remove the current element from the solution
            out.pollLast();
        }
    }
    public static void main(String[] args)
    {
        int[] A = { 1, 2, 3 };
        int k = 2;

        Deque<Integer> out = new ArrayDeque<>();
        findCombinations(A, out, k, 0, A.length);
    }
}
