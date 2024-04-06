package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        List<Integer> listOfInteger= Arrays.asList(1,2,3,4);

        //1. filter all the even number from the list and store it in a list
      List<Integer> evenList=   listOfInteger.stream()
                                              .filter(n -> n%2==0)
                                             .collect(Collectors.toList());


      //2. multiple all the elements in the list by 2
            //stream
            //map
            //collect

       List<Integer> multipliedByTwo =  listOfInteger.stream()
                        .map(n ->n*2)
                                .collect(Collectors.toList());

//        System.out.print(multipliedByTwo);


        //separate odd and even numbers using streams -> partioningBy
        Map<Boolean,List<Integer>> partionedMap= listOfInteger.stream().collect(Collectors.partitioningBy(n -> n%2==0));

//        System.out.println(partionedMap);


        //remove duplicates from list
       List<Integer> duplicateListElement =  Arrays.asList(1,1,2,2,3,3,3,4,5);

       List<Integer> distinctElementsOnlyList =  duplicateListElement.stream().distinct().collect(Collectors.toList());

       System.out.println(distinctElementsOnlyList);

       //find frequencey of each string using java8 streams

        String inputString = "Hello I am a Software Engineer";

         Map<Character,Long> frequenceyMap = inputString.chars().mapToObj(c -> (char)c)
                                            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(frequenceyMap);







    }
}
