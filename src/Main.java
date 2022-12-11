public class Main {
    public static void main(String[] args) {
        //task1
        String str;
        String str1;
        str = "hello world";
        str1 = " hello earth";
        System.out.println(str.length());
        System.out.println(str.concat(str1));


        //task2
        int a = 4;
        byte b = (byte)a;  //  int к типу byte
        System.out.println(b); // 4

        byte c = 7;
        int d = c;  // byte к int
        System.out.println(d);

        //task3

        int a1 = Integer.MAX_VALUE;
        int b1 = 500000000;

        int d1 = a1 + b1;
        System.out.println(d1);

        //task4


        Human human = new Human();
        human.printC();
        human.printCD();
        System.out.println(human.multi());


        //task5


        String input = "wtfya";
        System.out.println();
        char[] result = input.toCharArray();
        for(int i = result.length -1; i >= 0; i--)
            System.out.print(result[i]);



















//        int a;
//        double d;
//
//        d = 15.7;
//        a = (int)d;
//
//        System.out.println(a);
//
//        a = 17;
//        d = a;
//
//        System.out.println(a);
//
//        d = 26.6;
//        a = (int)d;
//        System.out.println(a);
//
//
//        char s;
//        int t;
//        t = 325;
//        s =(char) t;
//        System.out.println(s);
//
//        s = '*';
//        t = s;
//        System.out.println(t);
//
//        int i = 2000000000 + 1000000000;
//        int e = 2000000000;
//        int y = 1000000000;
//        i = e+y;
//        System.out.println(i);
//
//        long l = (long)e+(long)y;
//        System.out.println(l);
//
//
//        String str;
//        str = "" + i;
//        System.out.println(str);
//        System.out.println(str.getClass());
//        System.out.println();
//
//        str = "";
//        str = "privet";
//        System.out.println(str);
//        str += " Bay";
//        str = str + " I am faraway";
//        System.out.println(str.toUpperCase());
//        System.out.println(str.toLowerCase());
//
//        str = "    " + str + "   ";
//        System.out.println(str);
//
//        System.out.println(str.trim());
//
//        System.out.println(str.length());
//
//        String subStr = str.substring(5);
//        System.out.println(subStr);
//
//        subStr = str.substring(8, 14);
//        System.out.println(subStr);
//
//        System.out.println(str.charAt(15));
//
//        for (int j = 0; j < str.length(); j++ ){     // Для тех кто знает циклы показываю разбор строки на символы.
//            System.out.println(str.charAt(j));
//        }
//
//        for (int j = 0; j < str.length(); j++ ){     // Для тех кто знает циклы показываю разбор строки на символы.
//            if(str.charAt(j) == 'I' || str.charAt(j) == 'i' )
//            {   // Для тех кто знаком с условными операторы
//                System.out.println(str.charAt(j));
//            }
//        }
//
//
//        System.out.println(str.replace('I', 'i'));
//        System.out.println(str.replace('I', ' '));
//
//        Car car = new Car(3);
//        car.printA();
//        car.printAB();
//        System.out.println(car.sum());

    }
}