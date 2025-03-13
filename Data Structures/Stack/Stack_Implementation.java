

class Stack_Implementation {
         
    public static void main(String[] args) throws Exception  {
        System.out.println("Try programiz.pro");
        Stack<String> st = new Stack<>();
        st.push("we ");
        st.push("are ");
        st.push("implementing ");
        st.push("stack ");
        st.push("using ");
        st.push("java ");
        
        System.out.println(st.toString());
        System.out.println("peek "+st.peek());
        st.pop();
        System.out.println(st.toString());
        System.out.println("stack size: "+ st.isEmpty());
        System.out.println("stack size: "+ st.size());
        
    }
    
}
class Stack<T>{
    
     private final int default_size = 5;
     private Object[] arr;
     private int top = -1;
     private boolean expand = false;

    
    public Stack(){
        arr = new Object[default_size];
        expand = true;
    }
    public Stack(int capacity){
        arr = new Object[capacity];
    }
    
    @SuppressWarnings("unchecked")
    public T push(T value) throws Exception{
        if(top == arr.length-1) {
        
        if(expand) doubleArray();
        else throw new Exception("stack overflow");
        
        }
    
        arr[++top] = value;
        return (T) arr[top];
    }
    
    public void doubleArray(){
        Object[] temp = new Object[2*arr.length];
        
        for(int i=0;i<arr.length;i++)
        temp[i] = arr[i];
        
        arr = temp;
    }

    
    @SuppressWarnings("unchecked")
    public T pop(){
        Object temp = arr[top];
        arr[top] = 0;
        top--;
        return (T) arr[top];
    }
    
    @SuppressWarnings("unchecked")
     public T peek(){
        return (T) arr[top];
    }
    
    public int size(){
        return top+1;
    }
    
    public boolean isEmpty(){
        return top == -1;
    }

   @Override
    public String toString() {
        StringBuilder str = new StringBuilder("[ ");
        for (int i = 0; i <= top; i++) {
            str.append(arr[i]).append(" ");
        }
        str.append("]");
        return str.toString();
    }
    
    
    
  
}
