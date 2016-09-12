package kr.ac.sku.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.sku.vo.MemberVO;

@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int addMember(MemberVO member) throws RuntimeException {

		/*
		 * int count = 0; sqlSession.insert("addMember", member); return count;
		 */

		return sqlSession.insert("kr.ac.sku.Member.addMember", member);
	}

	@Override
	public int updateMember(MemberVO member) throws RuntimeException {

		return sqlSession.update("kr.ac.sku.Member.updateMember", member);
	}

	@Override
	public MemberVO selectMember(String member) throws RuntimeException {

		return sqlSession.selectOne("kr.ac.sku.Member.selectMember", member);
	}

	@Override
	public int deleteMember(MemberVO member) throws RuntimeException {

		return sqlSession.delete("kr.ac.sku.Member.deleteMember", member);
	}

	@Override
	public List<MemberVO> selectAll() throws RuntimeException {

		return sqlSession.selectList("kr.ac.sku.Member.selectAll");
	}

}
