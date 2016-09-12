package kr.ac.sku.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.ac.sku.vo.GuestBookVO;
import kr.ac.sku.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:/spring/applicationContext.xml" })
public class MemberDAOImplTest {
	@Autowired
	private MemberDAO memberDAO;
	@Autowired
	private GuestBookDAO guestBookDAO;

	@Test
	public void addMember() throws Exception {
		MemberVO member = new MemberVO();
		member.setId("testwfwf");
		member.setPassword("testpp3453p");
		member.setName("테스트234");
		member.setEmail("kh235235r@afasdf.com");
		int count = memberDAO.addMember(member);
		assertEquals(1, count);
	}

	@Test
	public void updateMember() throws Exception {
		MemberVO member = new MemberVO();
		member.setId("test");
		member.setPassword("test333");
		member.setName("테스트123");
		member.setEmail("khr910725");
		int count = memberDAO.updateMember(member);
		assertEquals(1, count);
	}

	@Test
	public void selectMember() throws Exception {

		String member = "test";
		memberDAO.selectMember(member);
		// System.out.println(memberDAO.selectMember(member));
		assertNotNull(member);

	}

	@Test
	public void deleteMember() throws Exception {
		MemberVO member = new MemberVO();
		member.setId("test");
		int count = memberDAO.deleteMember(member);
		assertEquals(1, count);
	}

	@Test
	public void selectAll() throws Exception {
		List<MemberVO> member = memberDAO.selectAll();
		System.out.println(memberDAO.selectAll());
		assertNotNull(member);

	}

	@Test
	public void addGuest() throws Exception {
		GuestBookVO guest = new GuestBookVO();
		guest.setId("a");
		guest.setPassword("25");
		guest.setName("테스트234");
		guest.setContent("qwefweqg");
		int count = guestBookDAO.addGuest(guest);
		assertEquals(1, count);
	}

	@Test
	public void updateGuest() throws Exception {
		GuestBookVO guest = new GuestBookVO();
		guest.setNo(100);
		guest.setPassword("435");
		guest.setName("324643643");
		guest.setContent("324632463246");
		int count = guestBookDAO.updateGuest(guest);
		assertEquals(1, count);
	}

	@Test
	public void deleteGuest() throws Exception {
		GuestBookVO guest = new GuestBookVO();
		guest.setNo(100);
		int count = guestBookDAO.deleteGuest(guest);
		assertEquals(1, count);
	}

	@Test
	public void selectGuest() throws Exception {

		int guest = 100;
		guestBookDAO.selectGuest(guest);
		// System.out.println(memberDAO.selectMember(member));
		assertNotNull(guest);

	}

	@Test
	public void selectGuestAll() throws Exception {
		List<GuestBookVO> guest = guestBookDAO.selectGuestAll();
		System.out.println(memberDAO.selectAll());
		assertNotNull(guest);

	}

}
