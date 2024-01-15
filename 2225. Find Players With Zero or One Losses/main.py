class Solution:
    def findWinners(self, matches: List[List[int]]) -> List[List[int]]:
        ans = [[], []]
        record_table = {}
        for match in matches:
            if match[0] not in record_table.keys():
                record_table[match[0]] = [0, 0]
            if match[1] not in record_table.keys():
                record_table[match[1]] = [0, 0]
            record_table[match[0]][0] += 1
            record_table[match[1]][1] += 1
        for key, val in record_table.items():
            if val[1] == 0:
                ans[0].append(key)
            elif val[1] == 1:
                ans[1].append(key)
        ans[0] = sorted(ans[0])
        ans[1] = sorted(ans[1])
        return ans