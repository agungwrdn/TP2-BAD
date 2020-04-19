
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rahardian
 */
public class soalNo2<T> extends Stack<T> {
    private int maxSize;

    public soalNo2(int size) {
        super();
        this.maxSize = size;
    }

    @Override
    public T push(T object) {
        //If the stack is too big, remove elements until it's the right size.
        if (this.size() >= maxSize) {
            System.out.println("STACK IS FULL");
            return null;
        } else {
            return super.push(object);
        }
    }
    
    public static void main(String[] args) {
        Stack<String> stackOfCards = new soalNo2<>(3);
        
        stackOfCards.push("5");
        stackOfCards.push("3");
        stackOfCards.push("2");
        stackOfCards.push("1");

        System.out.println("---------PUSH--------");
        stackOfCards.forEach((card) -> {
            System.out.println(card);
        });
        System.out.println("---------POP--------");
        stackOfCards.pop();
        stackOfCards.forEach((card) -> {
            System.out.println(card);
        });
    }
}
