package winder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import winder.dao.ProjectDAO;
import winder.vo.ProjectVO;

@Service
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	private ProjectDAO projectDAO;

	@Override
	public int insertProject(ProjectVO project) throws RuntimeException {
		return projectDAO.insertProject(project);
	}

	@Override
	public int deleteProject(int pno) {
		return projectDAO.deleteProject(pno);
	}

	@Override
	public int updateProject(ProjectVO project) {
		return projectDAO.updateProject(project);
	}

	@Override
	public ProjectVO selectProject(int pno) {
		return projectDAO.selectProject(pno);
	}

	@Override
	public List<ProjectVO> selectAllProject() {
		return projectDAO.selectAllProject();
	}
	

}
