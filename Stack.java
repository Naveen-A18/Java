public class Stack
{
    private int[] stackArray;
    private int top;
    private int maxSize;

    public Stack(int size)
    {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public boolean isEmpty()
    {
        return top == -1;
    }

    public boolean isFull()
    {
        return top == maxSize - 1;
    }
    public void push(int value)
    {
        if (isFull())
        {
            System.out.println("Stack is full. Cannot push " + value);
        }
        else
        {
            stackArray[++top] = value;
            System.out.println("Pushed: " + value);
        }
    }

    public int pop()
    {
        if (isEmpty())
        {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Return a sentinel value indicating an error
        }
        else
        {
            int poppedValue = stackArray[top--];
            System.out.println("Popped: " + poppedValue);
            return poppedValue;
        }
    }

    public int top()
    {
        if (isEmpty())
        {
            System.out.println("Stack is empty");
            return -1; // Return a sentinel value indicating an error
        }
        else
        {
            int topValue = stackArray[top];
            System.out.println("Top Element: " + topValue);
            return topValue;
        }
    }
    public static void main(String[] args)
    {
        Stack stack = new Stack(10);
// Push some values onto the stack
        stack.push(5);
        stack.push(10);
        stack.push(20);
// top element
        stack.top();
// Pop elements from the stack
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop(); // Attempt to pop when the stack is empty
// Peek when the stack is empty
        stack.top();
    } }