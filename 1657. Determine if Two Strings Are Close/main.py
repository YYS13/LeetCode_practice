class Solution:
    def closeStrings(self, word1: str, word2: str) -> bool:
        if len(word1) != len(word2):
            return False
        else:
            table1 = {}
            for char in word1:
                if char in table1.keys():
                    table1[char] += 1
                else:
                    table1[char] = 1
            table2 = {}
            for char in word2:
                if char not in table1.keys():
                    return False
                else:
                    if char in table2.keys():
                        table2[char] += 1
                    else:
                        table2[char] = 1
            return sorted(table1.values()) == sorted(table2.values())