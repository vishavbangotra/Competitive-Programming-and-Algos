package Bags;
import java.util.Stack;
import java.lang.String;
import java.util.Scanner;

public class Bag {

	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input=sc.next();
            char[] stack = input.toCharArray();
            Stack<Character> stack1 = new Stack<>();
            boolean indent = false;
            for(int i=0; i<input.length(); i++){
            	if(stack1.empty())
            		stack1.push(stack[i]);
            	else if(stack1.peek() == '(' && stack[i]==')')
            		stack1.pop();
            	else if(stack1.peek() == '[' && stack[i] == ']')
            		stack1.pop();
            	else if(stack1.peek() == '{' && stack[i] == '}')
            		stack1.pop();
            	else 
            		stack1.push(stack[i]);
            	
            }
            
            if(stack1.empty())
            	indent = true;
            System.out.println(indent);
		}
		sc.close();	
	}
}
