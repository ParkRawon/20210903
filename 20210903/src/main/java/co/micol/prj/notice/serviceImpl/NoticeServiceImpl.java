package co.micol.prj.notice.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.micol.prj.common.DataSource;
import co.micol.prj.notice.map.NoticeMapper;
import co.micol.prj.notice.service.NoticeService;
import co.micol.prj.notice.vo.NoticeVO;

public class NoticeServiceImpl implements NoticeService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);  //true시 자동커밋
	private NoticeMapper map = sqlSession.getMapper(NoticeMapper.class);
	

	@Override
	public List<NoticeVO> noticeSelectList() {
		// 게시판 목록
		return map.noticeSelectList();
		//return sqlSession.selectList("noticeSelectList"); --> mapper인터페이스를 활용하지 않을때
	}

	@Override
	public NoticeVO noticeSelect(NoticeVO vo) {
		// 게시판 상세보기 (세부 글보기시 먼저 hit수를 증가시킨다.)
		map.noticeHitUpdate(vo.getId());  //hit수 증가

		return map.noticeSelect(vo);
		//return sqlSession.selectOne("noticeSelect", vo); ""->mapper가 가지고 있는 아이디이름
	}

	@Override
	public int noticeInsert(NoticeVO vo) {
		// 게시판 글쓰기
		return map.noticeInsert(vo);
		//return sqlSession.insert("noticeUpdate", vo);
	}

	@Override
	public int noticeUpdate(NoticeVO vo) {
		// 게시판 수정하기
		return map.noticeUpdate(vo);
		//return sqlSession.update("noticeUpdate", vo);
	}

	@Override
	public int noticeDelete(NoticeVO vo) {
		// 게시판 삭제하기
		return map.noticeDelete(vo);
	}

}
