package stack;
import java.util.ArrayList;
import java.util.Stack;

public class NextLargestNumber {


    public static void getReverse(ArrayList<Integer> arrayList)
    {
        Stack<Integer> stack=new Stack<>();
        ArrayList<Integer> arrayList1=new ArrayList();
        int size = arrayList.size();
        for(int i = size -1;i>=0;i--)
        {
            if(stack.isEmpty())
            {
                arrayList1.add(-1);
            }else {
                if (!stack.isEmpty() &&  stack.peek() >arrayList.get(i))
                {
                    arrayList1.add( stack.peek());
                }else if (!stack.isEmpty() &&  stack.peek() <=arrayList.get(i))
                {
                    while(!stack.isEmpty() &&  stack.peek()<=arrayList.get(i)) {
                        stack.pop();
                    }
                    if(stack.isEmpty()) {
                        arrayList1.add(-1);
                    }else {
                        arrayList1.add( stack.peek());
                    }
                }
            }
            stack.add(arrayList.get(i));
        }
        System.out.println(stack);
        System.out.println(arrayList1);
    }

    public static void main(String[] args) {

        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(4);

        getReverse(arrayList);
    }
}
