package com.datami.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.datami.service.TodoService;

@Controller
@SessionAttributes("name")
public class TodoController {
	@Autowired
	private TodoService service;
	
	@RequestMapping(value="/list-todos",method=RequestMethod.GET)
	public String ShowTodoList(ModelMap model) {
		model.addAttribute("todos",service.retrieveTodos("user"));
		return "list-todos";
	}
	
	@RequestMapping(value = "/add-todo", method = RequestMethod.GET)
	public String showaddTodoPage() {
		return "addTodo";
	}

	@RequestMapping(value = "/add-todo", method = RequestMethod.POST)
	public String addTodo(ModelMap model, @RequestParam String describe) {
		try{
		
		service.addTodo("user", describe, new Date(), false);
		model.clear();// to prevent request parameter "name" to be passed
		
	}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return "redirect:list-todos";
	}
	
	@RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
	public String showdeleteTodoPage() {
		return "deleteTodo";
	}
	
	@RequestMapping(value = "/delete-todo", method = RequestMethod.POST)
	public String deleteTodo(@RequestParam int id) {
		service.deleteTodo(id);

		return "redirect:list-todos";
	}
}
