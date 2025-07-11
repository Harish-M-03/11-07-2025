import java.util.*;
public class Graph{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int nodes=sc.nextInt();
       int edges=sc.nextInt();
       List<List<Integer>> adj=new ArrayList<>();
       for(int i=0;i<=nodes;i++)adj.add(new ArrayList<>());
       
       for(int i=0;i<edges;i++){
           int node=sc.nextInt(),edge=sc.nextInt();
           adj.get(node).add(edge);
       }
       for(int i=1;i<=adj.size();i++){
           List<Integer> outGoing=adj.get(i);
           List<Integer> incoming=new ArrayList<>();
           for(int j=1;j<=adj.get(i).size();j++){
               if(adj.get(i).get(j)==i)incoming.add(j);
           }
           System.out.print("Node "+i+" :");
           System.out.print("Incoming : ");
           for(int edge:outGoing)System.out.print(edge+" ");
           System.out.print("Outgoing : ");
            for(int edge:incoming)System.out.print(edge+" ");
       }
    }
}
