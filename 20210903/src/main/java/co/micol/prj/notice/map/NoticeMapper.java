package co.micol.prj.notice.map;

import java.util.List;

import org.apache.ibatis.annotations.Update;

import co.micol.prj.notice.vo.NoticeVO;
import co.micol.prj.notice.vo.ReplyVO;

public interface NoticeMapper {
//	@Select("select * from notice")  권장하지 않음
	List<NoticeVO> noticeSelectList();
	NoticeVO noticeSelect(NoticeVO vo);
	List<ReplyVO> replySelectList(NoticeVO vo);
	int noticeInsert(NoticeVO vo);
	int noticeUpdate(NoticeVO vo);
	int noticeDelete(NoticeVO vo);
	
	@Update("update notice set hit = hit+1 where id=#{id}")
	void noticeHitUpdate(int id);

}
