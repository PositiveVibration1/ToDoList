package com.example.todolist;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.todolist.ToDoList.toDolist_Entry.*;

public class TodoListHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="  todolist.db";
    public static final  int DATABASE_VERSION=1;
    public TodoListHelper(Context context) {
        super(context, DATABASE_NAME, null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        final String SQL_CREATE_TODOLIST_TABLE="CREATE TABLE" +
                ToDoList.toDolist_Entry.TABLE_NAME + "(" +
                ToDoList.toDolist_Entry._ID + "INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ToDoList.toDolist_Entry.COLUMN_NAME+" TEXT NOT NULL, " +
                ToDoList.toDolist_Entry.COLUMN_AMOUNT + "INTEGER NOT NULL " +
                ToDoList.toDolist_Entry.COLUMN_TIMESTAMP + "TIMESTAMP DEFAULT CURRENT_TIMESTAMP" + ")";

        db.execSQL(SQL_CREATE_TODOLIST_TABLE);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + ToDoList.toDolist_Entry.TABLE_NAME);

    }
}
