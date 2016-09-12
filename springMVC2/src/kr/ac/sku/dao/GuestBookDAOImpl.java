package kr.ac.sku.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.sku.vo.GuestBookVO;

@Repository("guestBookDAO")
public class GuestBookDAOImpl implements GuestBookDAO {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int addGuest(GuestBookVO guest) throws RuntimeException {

		return sqlSession.insert("kr.ac.sku.Guest.addGuest", guest);
	}

	@Override
	public int updateGuest(GuestBookVO guest) throws RuntimeException {

		return sqlSession.update("kr.ac.sku.Guest.updateGuest", guest);
	}

	@Override
	public GuestBookVO selectGuest(int num) throws RuntimeException {

		return sqlSession.selectOne("kr.ac.sku.Guest.selectGuest", num);
	}

	@Override
	public int deleteGuest(GuestBookVO guest) throws RuntimeException {

		return sqlSession.delete("kr.ac.sku.Guest.deleteGuest", guest);
	}

	@Override
	public List<GuestBookVO> selectGuestAll() throws RuntimeException {

		return sqlSession.selectList("kr.ac.sku.Guest.selectGuestAll");

	}

}
