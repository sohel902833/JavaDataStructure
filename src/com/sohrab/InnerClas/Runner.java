package com.sohrab.InnerClas;

public class Runner {
    public static void main(String[] args) {

        /*
      <-----------  if i use inner class as a memeber class
        to access memeber class variable
        1.create parent class Object
        2.ParentClassName.InnerClassName objectName=parentObjectName.new InnerClassName();
        3.innerObjec.varibleName=15

       //example
        A a=new A();
        A.B b=a.new B();
        b.j=10;
        System.out.println(b.j);

       <-------make inner class static-------->
        A.B b=new A.B();
        b.j=10;

        */


       /*

       <---------Anonimous Class------------>

        AnnonimousInnerClass cl=new AnnonimousInnerClass(){
            public void show(){
                System.out.println("call,sms,msg,do other anything");
            }
        };
        cl.show();*/


    }
}
