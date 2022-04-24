package com.example.sdredzuccitapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val courseList : ArrayList<Course>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {


        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.courses_item,
        parent,false)
        return MyViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {


        val currentcourse = courseList[position]

        holder.code.text = currentcourse.code
        holder.credits.text = currentcourse.credits
        holder.description.text = currentcourse.description
        holder.course.text = currentcourse.course
        holder.prerequisites.text = currentcourse.prerequisites

    }

    override fun getItemCount(): Int {

        return courseList.size
    }


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val code : TextView = itemView.findViewById(R.id.tvCode)
        val credits : TextView = itemView.findViewById(R.id.tvCredits)
        val description : TextView = itemView.findViewById(R.id.tvDescription)
        val course : TextView = itemView.findViewById(R.id.tvCourseName)
        val prerequisites : TextView = itemView.findViewById(R.id.tvPreRequisites)

    }
}