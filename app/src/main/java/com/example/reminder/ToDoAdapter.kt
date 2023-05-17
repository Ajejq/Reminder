package com.example.reminder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.reminder.databinding.ItemTodoBinding

class ToDoAdapter(
    private val todos: MutableList<ToDo>
) : RecyclerView.Adapter<ToDoAdapter.ToDoViewHolder>() {

    class ToDoViewHolder(itemView: ItemTodoBinding) : RecyclerView.ViewHolder(itemView.root) {
        val title = itemView.tbTodoTitle
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
        val itemBinding = ItemTodoBinding.inflate(LayoutInflater.from(parent.context))
        return ToDoViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
        val curToDo = todos[position]
        holder.title.text = curToDo.title
    }

    override fun getItemCount(): Int {
        return todos.size
    }
}