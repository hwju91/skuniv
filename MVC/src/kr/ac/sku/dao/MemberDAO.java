package kr.ac.sku.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.ac.sku.DBUtil.DBUtil;
import kr.ac.sku.vo.MemberVO;

public class MemberDAO {
	
	public List<MemberVO> getMemberList()
	{
		List<MemberVO> memberList = new ArrayList<>();
		//1. 선언
		Connection conn =null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement("select * from member");
			rs = ps.executeQuery();
			while(rs.next())
			{
				MemberVO vo =new MemberVO();
				vo.setId(rs.getString(1));
				vo.setPassword(rs.getString(2));
				vo.setName(rs.getString(3));
				vo.setEmail(rs.getString(4));
				vo.setRegdate(rs.getString(5));
				
				memberList.add(vo);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			DBUtil.close(conn, ps, rs);
		}
		return memberList;
	}
	
	
	
	public MemberVO getMember(String id)
	{
		
		MemberVO vo = new MemberVO();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			//3.db접속
			conn =  DBUtil.getConnection();
			//4. 쿼리작성
			ps = conn.prepareStatement("select * from member where id = ?");
			ps.setString(1, id);
			//5. 쿼리실행
			rs = ps.executeQuery();
			if(rs.next())
			{
				vo.setId(rs.getString(1));
				vo.setPassword(rs.getString(2));
				vo.setName(rs.getString(3));
				vo.setEmail(rs.getString(4));
				
				
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
	
	public boolean insert(MemberVO vo)
	{
		boolean resultFlag= false;
		
		//0, 드라이버 로딩
		PreparedStatement ps = null;
		Connection conn = null;
		
		try{
			conn =DBUtil.getConnection();
			
			//2, 쿼리 작성 prepared statement
			
			String sql = "insert into member values(?,?,?,?,sysdate)";
			
			ps = conn.prepareStatement(sql);
	
			ps.setString(1, vo.getId());
			System.out.println(vo.getId());
			ps.setString(2, vo.getPassword());
			System.out.println(vo.getPassword());
			ps.setString(3, vo.getName());
			System.out.println(vo.getName());
			ps.setString(4, vo.getEmail());
			System.out.println(vo.getEmail());
			//3, 쿼리 실행
			int resultCount = ps.executeUpdate();
			System.out.println(resultCount);
			
			//4.결과 확인
			if(resultCount ==1)
				resultFlag = true;
		
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, ps);
	
		}
		
		return resultFlag;
	}
	public int delete(String id)
	{
		
		int resultCount = 0;
		//0, 드라이버 로딩
		PreparedStatement ps = null;
		Connection conn = null;
		
		try{
			conn =DBUtil.getConnection();
			
			
			String sql ="delete from member where id = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			resultCount = ps.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{ 
			DBUtil.close(conn, ps);
		}
		return resultCount;
	}
	
	public int update(MemberVO vo)
	
	{
		
		int resultCount = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtil.getConnection();
			//2. 쿼리 작성
			String sql ="update member set id = ? ,password = ?, name = ?, email = ? where id = ?";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPassword());
			ps.setString(3, vo.getName());
			ps.setString(4, vo.getEmail());
			ps.setString(5,	vo.getId());
			//3. 쿼리 실행
			resultCount =ps.executeUpdate();
			
		} catch (Exception e) {		
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, ps);
		}
		return resultCount;
	}
	
}
