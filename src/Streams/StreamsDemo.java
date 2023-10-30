        package Streams;

        import java.util.Arrays;
        import java.util.List;
        import java.util.function.Function;
        import java.util.stream.Collectors;
        import java.util.stream.Stream;

        public class StreamsDemo {
            public static void main(String[] args) {
                //Stream.of(10,20,30,40,1,2,3,4).filter(n->n%2==0).forEach(System.out::println);

        //        String[] names = {"bob","kishore","java","jack","rob"};
        //        Arrays.stream(names).filter(n-> n.length()>3).forEach(System.out::println);

                Stream<Integer> naturalNumbers = Stream.iterate(1, n -> n + 1).limit(10);


                naturalNumbers.forEach(System.out::println);
        // Output: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10


        //        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //
        //        List<Integer> result = nums.stream().takeWhile(n-> n<=5).collect(Collectors.toList());
        //        System.out.println(result);


              List<Integer> nm =   Stream.of(1,2,3,4,5,6,7,8,9,0).takeWhile(n-> n<=5).collect(Collectors.toList());
                System.out.println(nm);


                List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

                List<Integer> result = nums.stream().dropWhile(n-> n<=5).collect(Collectors.toList());

                System.out.println(result);


                Function<Integer,Integer> square = x-> x*x;
                System.out.println(square.apply(5));

                List<Integer> num = Arrays.asList(1,2,3,4,5,6,7);
                int squares = num.stream().map(x->x*x).reduce(0, Integer::sum);
                System.out.println(squares);

            }
        }
