
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
public class soalNo2 {
    public static void main(String[] args) {
        System.out.println("STACK IS FULL");
        Stack<String> stackOfCards = new Stack<>();
        System.out.println("---------PUSH--------");
        stackOfCards.push("5");
        stackOfCards.push("3");
        stackOfCards.push("2");
        for (String card : stackOfCards) {
            System.out.println(card);
        }
        System.out.println("---------POP--------");
        stackOfCards.pop();
        for (String card : stackOfCards) {
            System.out.println(card);
        }
    }
}
