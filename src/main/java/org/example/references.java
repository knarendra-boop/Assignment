package org.example;

public class references {
    public static void main(String[] args) {




//        persons p = new persons("narendra");
//        changeName(p);
//        System.out.println(p.name);//original will channge because java passes a copy of references and
        //both will point the same object

 car a = new car();
 a.cost=123;
 a.milege=12.80f;
 a.name = "bmw";
 System.out.println("name "+a.name);
 System.out.println(("milege: "+ a.milege));
 System.out.println((a.cost+" cost"));
 car b;
 b=a;
        System.out.println("name "+b.name);
        System.out.println(("milege: "+ b.milege));
        System.out.println((b.cost+" cost"));

        b.cost=124;
        b.milege=144.80f;
        b.name = "tata";
        System.out.println("name "+b.name);
        System.out.println(("milege: "+ b.milege));
        System.out.println((b.cost+" cost"));

        System.out.println("name "+a.name);
        System.out.println(("milege: "+ a.milege));
        System.out.println((a.cost+" cost"));


    }

}
//class persons {
//    String name;
//    persons(String name) {
//        this.name  = name;
//    }
//}
class car {
    String name;
    float milege;
    int cost;
}

