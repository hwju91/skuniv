package winder.service;

import java.util.List;
import winder.vo.TodoListVO;

public interface TodoListService {
	public int insertTodoList(TodoListVO todoList) throws RuntimeException;
	public int deleteTodoList(int tlno);
	public int updateTodoList(TodoListVO todoList);
	public TodoListVO selectTodoList(int tlno);
	public List<TodoListVO> selectAllTodoList();
}
