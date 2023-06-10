package com.ironhack;

import com.ironhack.exception.UserAgeNotValidException;
import com.ironhack.model.User;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        partOneOfTheLesson();
        partTwoOfTheLesson();

        System.out.println("program is closing...");

    }

    private static void partTwoOfTheLesson() {

        int input = 17;


        try {
            boolean isAgeValid = User.validateAge(17);
        } catch (UserAgeNotValidException e){
            System.out.println(e);
        }
//        User user = new User("Shinzo", 42);
        try{
            User userUnderAge = new User("Tommy Shibuya", input);
        } catch (RuntimeException e){
            System.out.println("There was an exception: " + e.getMessage());
        }

    }

    private static void partOneOfTheLesson() {
        List<Integer> dummyNumbers = new ArrayList<>(List.of(1, 2, 3));
        for (int i = 0; i <= dummyNumbers.size(); i++) {

            try {
                processNumberDelegatingException(dummyNumbers, i);

            }catch (IndexOutOfBoundsException e){
                System.out.println(e.getClass() + " :(");
                processNumber(dummyNumbers, i);
            }
        }
//        System.err.println("This is an error message");
    }

    private static void processNumberDelegatingException(List<Integer> dummyNumbers, int i)
            throws IndexOutOfBoundsException {
        System.out.println(dummyNumbers.get(i));
    }

    private static void processNumber(List<Integer> dummyNumbers, int i) {
        try {
//            here you write the code that may throw the exceptions
            System.out.println(dummyNumbers.get(i));

        } catch(NullPointerException e) { // you specify the exception you want to catch
//            you do something to respond to the exception
            System.out.println("a null pointer exception happened!");
        } catch(IndexOutOfBoundsException e) {
            System.out.println("Please your for i conditions ;) - " + e.getClass());
//            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println("Oh oh! An error occurred " + e.getClass());
        } finally {
            System.out.println("Number has been processed with index: " + i);
        }
    }
}