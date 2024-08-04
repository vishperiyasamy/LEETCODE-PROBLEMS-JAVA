class Solution {
    public int[] arrayRankTransform(int[] arr) {
        // Create a copy of the array and sort it
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        // Create an array to store the ranks
        int[] rank = new int[sortedArr.length];
        int currentRank = 1;

        // Assign ranks to the sorted array elements
        for (int i = 0; i < sortedArr.length; i++) {
            if (i == 0 || sortedArr[i] != sortedArr[i - 1]) {
                rank[i] = currentRank;
                currentRank++;
            } else {
                rank[i] = rank[i - 1];
            }
        }

        // Replace each element in the original array with its rank
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int index = Arrays.binarySearch(sortedArr, arr[i]);
            result[i] = rank[index];
        }

        return result;
    }

    }
