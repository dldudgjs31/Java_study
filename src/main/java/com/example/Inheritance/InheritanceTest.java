package com.example.Inheritance;

class Point{
    int x;
    int y;
}

//상속 관계
class Circle extends Point{
    int z;
}

// 포함관계
class Cirtcle2 {
    Point p = new Point();
    int z;
}
public class InheritanceTest {
    public static void main(String[] args) {
        //상속 관계 설정시
        Circle c = new Circle();
        c.x=1;
        c.y=2;
        c.z=3;

        // 포함관계 설정시
        Cirtcle2 c2 = new Cirtcle2();
        c2.p.x=1;
        c2.p.y=2;
        c2.z=3;


    }
}
