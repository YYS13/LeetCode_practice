class Solution {
    int ans = 0;
    public boolean checkPalindromic(Map<Integer, Integer> path){
        int odd = 0;
        for(Integer value: path.values()){
            if(value % 2 != 0){
                odd ++;
            }
            if(odd == 2){
                return false;
            }
        }
        return true;
    }
    public void checkPath(TreeNode node, Map<Integer, Integer> path){
        if(path.containsKey(node.val)){
            int value = path.get(node.val);
            path.put(node.val, value + 1);
        }else{
            path.put(node.val, 1);
        }
        if(node.left == null && node.right == null){
            if(checkPalindromic(path)){
                ans ++;
            } 
        }else{
            if(node.left != null){
                Map<Integer, Integer> leftPath = new HashMap<>(path);
                checkPath(node.left, leftPath);
            }
            if(node.right != null){
                Map<Integer, Integer> rightPath = new HashMap<>(path);
                checkPath(node.right, rightPath);
            }
        }
    }
    public int pseudoPalindromicPaths (TreeNode root) {
        Map<Integer, Integer> path = new HashMap<>();
        checkPath(root, path);
        return ans;
    }
}