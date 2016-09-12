package winder.service;

import java.util.List;

import winder.vo.MemberVO;
import winder.vo.MembersVO;

public interface MemberService {
	public int insertMember(MemberVO member) throws RuntimeException;
	public int deleteMember(String id);
	public int updateMember(MemberVO member);
	public int updatePassword(MemberVO member);
	public MemberVO selectMember(String id);
	public List<MemberVO> selectAllMember();
	public int chkMember(MemberVO member) throws RuntimeException;
	

}