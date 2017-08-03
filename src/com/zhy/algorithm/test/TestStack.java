
public class TestStack{


    private int top;
    private String[] elements;
    private int maxSize;

    public TestStack(int size) {
        this.maxSize = size;
        top = 0;
        elements = new String[maxSize];
    }

    public int getTop(){
        return top;
    }

    public void push(String s) {
        if(top<maxSize) {
            elements[top++] = s;
        }
    }

    public String pop() throws Exception{
        if(top>0) {
            return  elements[--top];
        }
        throw new  Exception("empty");
    }

    public static void main(String[] args) {
        TestStack testStack = new TestStack(10);
        for (int i = 0; i < 10; i++) {
            testStack.push(i+"");
        }


        int total = testStack.getTop();
        for (int i = 0; i < total; i++) {

            try {
                System.out.println(testStack.pop());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}