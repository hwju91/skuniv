package winder.dao;

import java.util.List;
import winder.vo.ProjectVO;

public interface ProjectDAO {

	public int insertProject(ProjectVO project) throws RuntimeException;
	public int deleteProject(int pno);
	public int updateProject(ProjectVO project);
	public ProjectVO selectProject(int pno);
	public List<ProjectVO> selectAllProject(int tno);
}
