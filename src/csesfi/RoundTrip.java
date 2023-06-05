package csesfi;

import java.util.*;

public class RoundTrip {

    private static List<Integer> cycle;
    private static List<Integer>[] graph;
    private static boolean[] visited;
    private static int[] parent;
    private static int startNode;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Create adjacency list representation of the graph
        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        // Read the edges
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }

        scanner.close();

        // Initialize visited array and parent array
        visited = new boolean[n + 1];
        parent = new int[n + 1];

        // Find the cycle using DFS
        boolean hasCycle = false;
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                if (dfs(i, -1)) {
                    hasCycle = true;
                    break;
                }
            }
        }

        if (hasCycle) {
            // Reconstruct the cycle from the parent array
            List<Integer> path = new ArrayList<>();
            path.add(startNode);
            int currentNode = parent[startNode];
            while (currentNode != startNode) {
                path.add(currentNode);
                currentNode = parent[currentNode];
            }
            path.add(startNode);

            // Print the cycle
            System.out.println(path.size());
            for (Integer integer : path) {
                System.out.print(integer + " ");
            }
            System.out.println();
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }

    private static boolean dfs(int node, int parentNode) {
        visited[node] = true;
        parent[node] = parentNode;

        for (int neighbor : graph[node]) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, node)) {
                    return true;
                }
            } else if (neighbor != parentNode && startNode == 0) {
                // Cycle detected
                startNode = neighbor;
                return true;
            }
        }

        return false;
    }
}
