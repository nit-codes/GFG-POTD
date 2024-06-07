class Solution:
    def __init__(self):
        pass  # No initialization needed in this case

    def maxOccured(self, n, l, r, maxx):
        """
        Finds the maximum occurring integer in all ranges.

        Args:
            n (int): Size of the input arrays (l and r)
            l (List[int]): Array of left indices for ranges
            r (List[int]): Array of right indices for ranges
            maxx (int): Maximum value in the r[] array

        Returns:
            int: The integer that occurs the most frequently in all ranges.
        """

        # Create a frequency array with size maxx+2 to accommodate potential
        # edge cases where elements in l or r might be equal to maxx.
        arr = [0] * (maxx + 2)

        # Build the frequency array using prefix sum approach.
        for i in range(n):
            arr[l[i]] += 1
            arr[r[i] + 1] -= 1

        # Apply prefix sum to get cumulative frequencies.
        current_max = 0
        for i in range(maxx + 1):
            arr[i] += current_max
            current_max = arr[i]

        # Find the index with the maximum frequency.
        max_index = 0
        for i in range(1, maxx + 1):
            if arr[i] > arr[max_index]:
                max_index = i

        return max_index
