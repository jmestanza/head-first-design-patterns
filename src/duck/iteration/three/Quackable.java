package duck.iteration.three;

public interface Quackable {
//    At first I thought the book was refering to use something like this:
//    default void quack(){
//        System.out.println("I'm quyack");
//    }
//    But if you read some pages ahead, it's clear that is referring to make an abstract method without default:
    void quack();
}
