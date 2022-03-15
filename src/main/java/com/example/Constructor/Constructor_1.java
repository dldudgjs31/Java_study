package com.example.Constructor;

class Data_1{
    int value;
}

class Data_2{
    int value;

    Data_2(int x){
        this.value=x;
    }
}


public class Constructor_1 {
    public static void main(String[] args) {
        Data_1 obj= new Data_1();
        //기본 생성자 호출 불가능 / 이유는 클래스 내부에 생성자가 있기때문에
        //Data_2 obj = new Data_2();
    }
}
