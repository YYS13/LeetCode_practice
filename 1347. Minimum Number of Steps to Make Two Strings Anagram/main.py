class Solution:
    def minSteps(self, s: str, t: str) -> int:
        min_step = 0
        count_table = {}
        for char in s:
            if char not in count_table.keys():
                count_table[char] = 1
            else:
                count_table[char] += 1
        for char in t:
            if char not in count_table.keys() or count_table[char] == 0:
                min_step += 1
            else :
                count_table[char] -= 1
        return min_step