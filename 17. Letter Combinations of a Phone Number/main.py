class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        table = {'2' : ["a", "b", "c"],
                 '3' : ["d", "e", "f"],
                 '4' : ["g", "h", "i"],
                 '5' : ["j", "k", "l"],
                 '6' : ["m", "n", "o"],
                 '7' : ["p", "q", "r", "s"],
                 '8' : ["t", "u", "v"],
                 '9' : ["w", "x", "y", "z"]}
        if len(digits) == 0:
            return []
        elif len(digits) == 1:
            return table[digits]
        else:
            temp = []
            for l in table[digits[0]]:
                for item in self.letterCombinations(digits[1:]):
                    temp.append(l + item)
            return temp