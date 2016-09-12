package kr.ac.sku.dao;

import java.util.List;

import kr.ac.sku.vo.MemberVO;

public interface MemberDAO {

	public int addMember(MemberVO member) throws RuntimeException;

	public int updateMember(MemberVO member) throws RuntimeException;

	public MemberVO selectMember(String member) throws RuntimeException;

	public int deleteMember(MemberVO member) throws RuntimeException;

	public List<MemberVO> selectAll() throws RuntimeException;

}
