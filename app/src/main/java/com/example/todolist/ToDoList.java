package com.example.todolist;

import android.provider.BaseColumns;

public class ToDoList {

    private ToDoList(){}

    public static final class toDolist_Entry implements BaseColumns{
        public static final String TABLE_NAME="groceryList";
        public static final String COLUMN_NAME="name";
        public static final String COLUMN_AMOUNT="amount";
        public static final  String COLUMN_TIMESTAMP="timestamp";
    }
}
