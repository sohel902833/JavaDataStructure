package com.sohrab.Interface;

public interface RecyclerView{

    ViewHolder OnCreateViewHolder(Data data,int name,String roll);
     void onBindViewHolder(Data data);
     int OnItemCount();


      interface ViewHolder{
         void getItem();
      }

}
