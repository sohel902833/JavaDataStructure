package com.sohrab.Interface;

public class Button{
    Data data;
    Button(Data data){
       this.data=data;
    }

    public  void  setOnclickListner(OnClickListner listner){
          listner.doSomeThing(data);
    }

}
