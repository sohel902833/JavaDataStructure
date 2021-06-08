package com.sohrab.Interface;

public class MyAdapter implements  RecyclerView{
    @Override
    public MyViewHolder OnCreateViewHolder(Data data, int name, String roll) {
        return  new MyViewHolder();
    }

    @Override
    public void onBindViewHolder(Data data) {

    }

    @Override
    public int OnItemCount() {
        return 0;
    }

    class MyViewHolder implements RecyclerView.ViewHolder{
        @Override
        public void getItem() {

        }
    }
}
