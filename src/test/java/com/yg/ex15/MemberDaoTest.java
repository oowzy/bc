package com.yg.ex15;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yg.dao.MemberDao;
import com.yg.dto.MemberDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})


public class MemberDaoTest {
	
		@Autowired
		private MemberDao dao;
		
		@Test
		public void testInsertMember() throws Exception{
//			dao.insert(new MemberDto("아이디5","이름5","비번5","남5","이메일5","번호5"));
			dao.insert(new MemberDto("아이디9","이름9","비번9","남9","이메일9","번호9"));
			System.out.println("성공적으로 입력되었습니다.");
		}
		
		@Test
		public void testMemberSelectAll() throws Exception{
			List<MemberDto> list = dao.selectList();
			
			for(MemberDto dto : list) {
				System.out.println(dto);
			}
		}
		
		
		
		
//		@Test
//		public void testBoardSelect2() throws Exception{
//			List<MemberDto> list = dao.selectListFromTo(1,10);
//			for(MemberDto dto : list) {
//				System.out.println(dto);
//			}
//		}
		
		
	}
	
	
	

