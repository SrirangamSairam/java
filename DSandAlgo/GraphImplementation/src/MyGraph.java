import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MyGraph {
    private int noOfNodes;
    private HashMap<Integer, ArrayList<Integer>> adjacentList;

    public MyGraph() {
        this.noOfNodes = 0;
        this.adjacentList = new HashMap<>();
    }

    public boolean addVertex(int node) {
        if(!this.adjacentList.containsKey(node)) {
            this.adjacentList.put(node,new ArrayList<>());
            this.noOfNodes++;
            return true;
        }
        return false;
    }

    public boolean addEdge(int node1, int node2) {
        if(this.adjacentList.containsKey(node1) && this.adjacentList.containsKey(node2)) {
            ArrayList<Integer> currMap1 = this.adjacentList.get(node1);
            currMap1.add(node2);
            this.adjacentList.put(node1,currMap1);
            ArrayList<Integer> currMap2 = this.adjacentList.get(node2);
            currMap2.add(node1);
            this.adjacentList.put(node2,currMap2);
            return true;
        }
        return false;
    }

    public void showConnections() {
        for (Map.Entry<Integer, ArrayList<Integer>> entry: this.adjacentList.entrySet()) {
            Integer key = entry.getKey();
            ArrayList<Integer> value = entry.getValue();
            System.out.println(key + "---->" + value);
        }
    }
}
