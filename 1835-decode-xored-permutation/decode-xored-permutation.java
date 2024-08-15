class Solution {
    public int[] decode(int[] encoded) {
         int n = encoded.length + 1;
        int[] perm = new int[n];

        // Step 1: Calculate total XOR for 1 to n (which is the XOR of the entire perm array)
        int totalXOR = 0;
        for (int i = 1; i <= n; i++) {
            totalXOR ^= i;
        }

        // Step 2: Calculate the XOR of all elements at odd indices in the encoded array
        int oddXOR = 0;
        for (int i = 1; i < encoded.length; i += 2) {
            oddXOR ^= encoded[i];
        }

        // Step 3: The first element of perm is the XOR of totalXOR and oddXOR
        perm[0] = totalXOR ^ oddXOR;

        // Step 4: Calculate the rest of the elements of perm using the first element
        for (int i = 1; i < n; i++) {
            perm[i] = perm[i - 1] ^ encoded[i - 1];
        }

        return perm;
    }
}