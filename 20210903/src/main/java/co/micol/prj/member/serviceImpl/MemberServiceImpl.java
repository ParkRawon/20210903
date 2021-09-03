package co.micol.prj.member.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;


import co.micol.prj.common.DataSource;
import co.micol.prj.member.map.MemberMapper;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.vo.MemberVO;

public class MemberServiceImpl implements MemberService{
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);  //dao 연결  true-> autocommit
	private MemberMapper map = sqlSession.getMapper(MemberMapper.class); //mapper사용을 위해 연결
	
	
	@Override
	public List<MemberVO> memberSelectList() {
		// 전체 리스트를 가져온다
		return map.memberSelectList();
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) {
		// 한명의 데이터를 가져온다
		return map.memberSelect(vo);
	}

	@Override
	public int memberInsert(MemberVO vo) {
		// 데이터 입력
		return map.memberInsert(vo);
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		// 데이터 수정
		return map.memberUpdate(vo);
	}

	@Override
	public int memberDelete(MemberVO vo) {
		// 데이터 삭제
		return map.memberDelete(vo);
	}

}
