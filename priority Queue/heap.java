import java.util.*;


public class heap {
    static class heaps{
        static ArrayList<Integer>list=new ArrayList<>();

        public static void add(int data){
            list.add(data);
            int child=list.size()-1;
            int parent=(child-1)/2;
            while(list.get(child)<list.get(parent)){
                int temp=list.get(child);
                list.set(child,list.get(parent));
                list.set(parent, temp);
            }
            

        }
    }
}
