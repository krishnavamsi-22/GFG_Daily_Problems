class Solution {
    public List<Node> printAllDups(Node root) {
        // code here
        List<Node> duplicates = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        serialize(root, map, duplicates);
        return duplicates;
    }
    
    private String serialize(Node node, Map<String, Integer> map, List<Node> duplicates) {
        if (node == null) return "#";
        
        String serial = node.data + "," + serialize(node.left, map, duplicates) + "," + serialize(node.right, map, duplicates);
        map.put(serial, map.getOrDefault(serial, 0) + 1);
        if (map.get(serial) == 2) {
            duplicates.add(node);
        }
        return serial;
    }
}
