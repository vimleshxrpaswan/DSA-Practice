package geeksforgeeks;

public class ReversesubArrays {
        public static void reverseGroups(int[] arr, int N, int K) {
            int i = 0;
            while (i < N) {
                int left = i;
                int right = Math.min(i + K - 1, N - 1);
                while (left < right) {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
                i += K;
            }
        }

        public static void main(String[] args) {
            int N = 10;
            int K = 4;
            int[] arr = {1,2,3,4,5,6,7,8,9,10};
            reverseGroups(arr, N, K);
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

