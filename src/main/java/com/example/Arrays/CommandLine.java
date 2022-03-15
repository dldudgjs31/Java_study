package com.example.Arrays;

public class CommandLine {
    public static void main(String[] args) {
        System.out.println("매개변수의 개수 : "+ args.length);
        for(int i = 0;i<args.length;i++){
            System.out.println("args[" + i + "] = \""+args[i] + "\"");

            /**
             * 
young@youngs-MacBook-Air demo %  cd /Users/young/git/java_practice/demo ; /usr/bin/env /Library/Java/JavaVirtualMachines/zulu-8.jdk/Contents/Home/bin/java -cp /Users/young/git/java_practice/demo/target/classes com.example.Arrays.CommandLine hi hello hi
매개변수의 개수 : 3
args[0] = "hi"
args[1] = "hello"
args[2] = "hi"
             * 
             */
        }
    }
}
