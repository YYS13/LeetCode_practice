class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        def helper(start, end, ans, pos_str):
            temp_start = start
            temp_end = end
            strLen = len(pos_str)
            if start == end and start == 0:
                ans.append(pos_str)
            elif start == end and start != 0:
                pos_str = pos_str + "("
                temp_start -= 1
                helper(temp_start, temp_end, ans, pos_str)
            elif start != end and start == 0:
                while temp_end !=0 :
                    pos_str = pos_str + ")"
                    temp_end -= 1
                helper(temp_start, temp_end, ans, pos_str)
            else:
                pos_str = pos_str + "("
                temp_start -= 1
                helper(temp_start, temp_end, ans, pos_str)
                temp_start += 1
                pos_str = pos_str[:strLen]
                pos_str = pos_str + ")"
                temp_end -= 1
                helper(temp_start, temp_end, ans, pos_str)
        ans = []
        pos_str = "("
        start = n - 1 
        end = n 
        helper(start, end, ans, pos_str)
        return ans