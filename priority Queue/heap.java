import java.util.*;


public class heap {
    static class heaps{
        static ArrayList<Integer>list=new ArrayList<>();

        private  void add(int data){
            list.add(data);
            int child=list.size()-1;
            int parent=(child-1)/2;
            while(list.get(child)<list.get(parent)){
                int temp=list.get(child);
                list.set(child,list.get(parent));
                list.set(parent, temp);
                child=parent;
                parent=(child-1)/2;
            }
        }
        //get the min heap
        public int getmin(){
            return list.get(0);
        }

        public void heapify(int i){
            int left=(2*i)+1;
            int right=(2*i)+2;
            int mini=i;

            if(left< list.size() && list.get(mini)>list.get(left))
            mini=left;
            if(right <list.size() && list.get(mini)>list.get(right))
            mini=right;
            if(mini!=i){
                //swap
                int temp=list.get(i);
                list.set(i,list.get(mini));
                list.set(mini,temp);
               heapify(mini);
            }
        }
        
        //is empty
        public boolean isempty(){
            return list.size()==0;
        }

        
        //remove the element
        public int remove(){
            int data=list.get(0);
            //swap 
            int temp=list.get(0);
            list.set(0, list.get(list.size()-1));
            list.set(list.size()-1,temp);

            list.remove(list.size()-1);
            heapify(0);
            return data;
        }

    }

    public static void main(String[] args) {
        heap h=new heap();
        h.add(15);
         h.add(55);
         h.add(35);
         h.add(55);
        
        
        

    }

   
}
