package com.javarush.task.jdk13.task08.addons.sber2;

import java.util.stream.DoubleStream;

public class Q17 {
    public static void main(String[] args) {
        DoubleStream s = DoubleStream.of(1.2, 2.4);
        long count = s.peek(System.out::print).filter(x -> x > 2).count();
        //System.out.println(count); //а вот каунт будет 1
    }
}

//1.22.4 (см. далее почему)

//ПИК пиздец хитрый
//https://www.baeldung.com/java-streams-peek-api

//peek
/*
Returns a stream consisting of the elements of this stream,
additionally performing the provided action on each element as elements are consumed from the resulting stream.
This is an intermediate operation.
 */

/*
DoubleStream s = DoubleStream.of(1, 2, 3, 4);   long count = s.peek(System.out::println).count();
The number of elements covered by the stream source is known and the intermediate operation, peek,
does not inject into or remove elements from the stream (as may be the case for flatMap or filter operations).
Thus the count is 4 and there is no need to execute the pipeline and, as a side-effect, print out the elements.
 */

//count
/*
Returns the count of elements in this stream. This is a special case of a reduction and is equivalent to:
  return mapToLong(e -> 1L).sum();
This is a terminal operation.
 */