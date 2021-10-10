package com.todo.service;

import java.util.Scanner;

public class TodoMain {
	public static void start() {
		Scanner sc = new Scanner(System.in);
		TodoList l = new TodoList();
		l.importData("todolist.txt");
	}
}
