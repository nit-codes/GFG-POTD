class Compute {
    public String isSubset(long a1[], long a2[], long n, long m) {
        // Create a HashMap to store counts of elements in a1
        HashMap<Long, Integer> elementCount = new HashMap<>();

        // Populate the HashMap with elements from a1
        for (long element : a1) {
            elementCount.put(element, elementCount.getOrDefault(element, 0) + 1);
        }

        // Check if a2 is a subset of a1
        for (long element : a2) {
            if (!elementCount.containsKey(element) || elementCount.get(element) == 0) {
                return "No"; // Element in a2 is not in a1 or not enough occurrences
            }
            // Decrement the count in the map
            elementCount.put(element, elementCount.get(element) - 1);
        }

        // If all elements in a2 are found in a1, return "Yes"
        return "Yes";
    }
}
