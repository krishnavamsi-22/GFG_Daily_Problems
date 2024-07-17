class Solution {
    // Function to construct binary tree from parent array.
    public Node createTree(int parent[]) {
        // Your code here
        Node root = null;
        Node tree[] = new Node[parent.length];
        for(int i = 0;i<parent.length;i++){
            tree[i] = new Node(i);
        }
        for(int i=0;i<parent.length;i++){
            if(parent[i]==-1){
                root = tree[i];
            }else{
                if(tree[parent[i]].left==null){
                    tree[parent[i]].left = tree[i];
                }else{
                    tree[parent[i]].right = tree[i];
                }
            }
        }
        return root;
    }
}
