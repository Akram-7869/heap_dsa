import java.util.*;

import org.w3c.dom.NameList;
public class pqwith_objects{
    static class Students implements Comparable<Students>{
        String name;
        int rank;
        public Students(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
    @Override
    public int compareTo(Students s2){
        return this.rank-s2.rank;
    }
    }
     public static void main(String[] args) {
      PriorityQueue<Students>pq=new PriorityQueue<>();
      pq.add(new Students("akr", 34));
       pq.add(new Students("a", 3));
        pq.add(new Students("ak", 4));

        while(!pq.isEmpty()){
            System.out.print(pq.peek().name +"-> "+ pq.peek().rank);
            pq.remove();
        }
 } 
}

 