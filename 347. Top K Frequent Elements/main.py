class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        ans = []
        table = {} #counting table
        count_list = [] #List[List[int]] : length=n because the element in nums apear n times at most
        #count elements frequency sort in the table
        for num in nums:
            if str(num) not in table.keys():
                table[str(num)] = 1
            else:
                table[str(num)] += 1
        #most frequency 
        max_count = max(table.values())
        #set a hashtable classify element by frequency
        for i in range(max_count):
            count_list.append([])
        for key, val in table.items():
            count_list[max_count-val].append(int(key))
        #add element into answer list until len(ans) == k
        for freq in count_list:
            for element in freq:
                if k != 0:
                    ans.append(element)
                    k -=1
                else:
                    return ans
        return ans