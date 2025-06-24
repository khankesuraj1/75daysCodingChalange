public int subarraySum(int[] nums, int k) {
    // This map will store the count of each prefix sum
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, 1); // Base case: sum = 0 has occurred once

    int sum = 0;   // To store the current cumulative sum
    int count = 0; // To count the total subarrays with sum = k

    for (int num : nums) {
        sum += num; // Update the running sum

        // Check if there is a prefix sum that makes sum - k
        if (map.containsKey(sum - k)) {
            count += map.get(sum - k); // Add the number of times (sum - k) has occurred
        }

        // Add/update the current sum in the map
        map.put(sum, map.getOrDefault(sum, 0) + 1);
    }

    return count; // Total subarrays that sum to k
}
