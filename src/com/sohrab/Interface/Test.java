package com.sohrab.Interface;

public class Test {
    public static void main(String[] args) {
        Button button=new Button(new Data("Md Sohrab Hossain Sohel",902833));

        button.setOnclickListner(new OnClickListner() {
            @Override
            public void doSomeThing(Data data) {

            }

            @Override
            public void delete() {

            }

            @Override
            public void update() {

            }

            @Override
            public void onChange() {

            }
        });



    }
}
