package winder.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import winder.vo.TodoJoinVO;
import winder.vo.TodoListVO;

@Repository("todoListDAO")
public class TodoListDAOImpl implements TodoListDAO {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insertTodoList(TodoListVO todoList) throws RuntimeException {
		return sqlSession.insert("winder.TodoList.insertTodoList", todoList);
	}

	@Override
	public int deleteTodoList(int tlno) {
		return sqlSession.delete("winder.TodoList.deleteTodoList", tlno);
	}

	@Override
	public int updateTodoList(TodoListVO todoList) {
		return sqlSession.update("winder.TodoList.updateTodoList", todoList);
	}

	@Override
	public List<TodoJoinVO> selectTodoList(int pno) {
		return sqlSession.selectList("winder.TodoList.selectTodoList", pno);
	}

	@Override
	public List<TodoListVO> selectAllTodoList() {
		List<TodoListVO> selectAllTodoList =new ArrayList<>();
		selectAllTodoList=sqlSession.selectList("winder.TodoList.selectAllTodoList");
		return selectAllTodoList;
	}

}
