
class Solution {

    private int preorderIndex = 0;
    private Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return solve(preorder, 0, inorder.length - 1);
    }

    private TreeNode solve(int[] preorder, int start, int end) {
        if (start > end) return null;

        int rootVal = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootVal);

        int inorderIndex = map.get(rootVal);

        root.left = solve(preorder, start, inorderIndex - 1);
        root.right = solve(preorder, inorderIndex + 1, end);

        return root;
    }
}