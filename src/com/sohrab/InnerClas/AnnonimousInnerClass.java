package com.sohrab.InnerClas;

public class AnnonimousInnerClass {

    public void show(){
        System.out.println("call");
    }



}
class  AnB extends  AnnonimousInnerClass{
    @Override
    public void show(){
        System.out.println("call,sms,msg,do other anything");
    }
}
