package winder.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import winder.dao.TodoListDAO;
import winder.vo.TodoJoinVO;
import winder.vo.TodoListVO;

@Service
public class TodoListServiceImpl implements TodoListService{
	
	@Autowired
	private TodoListDAO todolistDAO;

	@Override
	public int insertTodoList(TodoListVO todoList) throws RuntimeException {
		return todolistDAO.insertTodoList(todoList);
	}

	@Override
	public int deleteTodoList(int tlno) {
		return todolistDAO.deleteTodoList(tlno);
	}

	@Override
	public int updateTodoList(TodoListVO todoList) {
		return todolistDAO.updateTodoList(todoList);
	}

	@Override
	public List<TodoJoinVO> selectTodoList(int pno) {
		return todolistDAO.selectTodoList(pno);
	}

	@Override
	public List<TodoListVO> selectAllTodoList() {
		return todolistDAO.selectAllTodoList();
	}
	

}
