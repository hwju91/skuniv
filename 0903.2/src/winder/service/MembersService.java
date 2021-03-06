package winder.service;

import java.util.List;
import winder.vo.MembersVO;

public interface MembersService {
	
	public int insertMembers(MembersVO members) throws RuntimeException;
	public int deleteMembers(int mno);
	public int deleteMembersTeamOut(MembersVO members);
	public int updateMembers(MembersVO members);
	public MembersVO selectMembers(int mno);
	public List<MembersVO> selectAllMembers();
	// 사용자의 id를 통해 tno를 구하기위해
	public MembersVO selectMembersTno(String id); 
	// projectmanagement의 권한을 확인하기 위해.
	public MembersVO selectMembersPosition(MembersVO members);
	
	public List<MembersVO> selectAllMembersTno(int tno);
}
