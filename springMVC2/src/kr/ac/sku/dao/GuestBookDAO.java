package kr.ac.sku.dao;

import java.util.List;

import kr.ac.sku.vo.GuestBookVO;

public interface GuestBookDAO {
	public int addGuest(GuestBookVO guest) throws RuntimeException;

	public int updateGuest(GuestBookVO guest) throws RuntimeException;

	public GuestBookVO selectGuest(int num) throws RuntimeException;

	public int deleteGuest(GuestBookVO guest) throws RuntimeException;

	public List<GuestBookVO> selectGuestAll() throws RuntimeException;
}
