package kr.ac.sku.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.ac.sku.DBUtil.DBUtil;
import kr.ac.sku.vo.GuestBookVO;

public class GuestBookDAO {
	public GuestBookVO getGuestBook(int no)
	{
		GuestBookVO vo = new GuestBookVO();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			conn =  DBUtil.getConnection();
			ps = conn.prepareStatement("select * from guestbook where no = ?");
			ps.setInt(1, no);
			rs = ps.executeQuery();
			if(rs.next())
			{
				vo.setNo(rs.getInt(1));
				vo.setId(rs.getString(2));
				vo.setName(rs.getString(3));
				vo.setPassword(rs.getString(4));
				vo.setContent(rs.getString(5));
				vo.setRegdate(rs.getString(6));
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			DBUtil.close(conn, ps, rs);
		}
		return vo;
	}
	
	
	public GuestBookVO getGuestBook2(String id)
	{
		GuestBookVO vo = new GuestBookVO();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			conn =  DBUtil.getConnection();
			ps = conn.prepareStatement("select * from guestbook where id = ?");
			ps.setString(1, id);
			rs = ps.executeQuery();
			if(rs.next())
			{
				vo.setNo(rs.getInt(1));
				vo.setId(rs.getString(2));
				vo.setName(rs.getString(3));
				vo.setPassword(rs.getString(4));
				vo.setContent(rs.getString(5));
				vo.setRegdate(rs.getString(6));
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			DBUtil.close(conn, ps, rs);
		}
		return vo;
	}
	
	
	
	public List<GuestBookVO> getGuestBookList()
	{
		List<GuestBookVO> guestbooklist = new ArrayList<>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement("select * from guestbook");
			rs = ps.executeQuery();
			while(rs.next())
			{
				GuestBookVO vo =new GuestBookVO();
				vo.setNo(rs.getInt(1));
				vo.setId(rs.getString(2));
				vo.setName(rs.getString(3));
				vo.setPassword(rs.getString(4));
				vo.setContent(rs.getString(5));
				vo.setRegdate(rs.getString(6));
				guestbooklist.add(vo);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			DBUtil.close(conn, ps, rs);
		}
		return guestbooklist;
	}
	
	
	public boolean insert(GuestBookVO vo)
	{
		boolean resultFlag = false;
		Connection conn = null;
		PreparedStatement ps = null;
		try{
			conn =DBUtil.getConnection();
			String sql = "insert into guestbook values(guest.nextval,?,?,?,?,sysdate)";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getName());
			ps.setString(3, vo.getPassword());
			ps.setString(4, vo.getContent());
			
			int resultCount = ps.executeUpdate();	
			
			if(resultCount == 1) 
				resultFlag = true;
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, ps);
	
		}
		
		return resultFlag;
	}
	public int delete(int no)
	{
		int resultCount = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		try{
			conn = DBUtil.getConnection();
	
			//2.쿼리 작성
			
			String sql="delete from guestbook where no = ?";
			ps =conn.prepareStatement(sql);
			ps.setInt(1,no); 			
			//3. 쿼리 실행	
			resultCount = ps.executeUpdate();	
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{ 
			DBUtil.close(conn, ps);
		}
		return resultCount;
	}
	
	
	public int update(GuestBookVO vo)
	{
		int resultCount = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtil.getConnection();
			//2. 쿼리 작성
			String sql ="update guestbook set content = ? where no = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getContent());
			ps.setInt(2, vo.getNo());
			
			//3. 쿼리 실행
			resultCount = ps.executeUpdate();
			
		} catch (Exception e) {		
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, ps);
		}
		return resultCount;
	}
}
