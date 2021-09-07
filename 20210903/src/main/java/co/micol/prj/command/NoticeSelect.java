package co.micol.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.common.Command;
import co.micol.prj.notice.service.NoticeService;
import co.micol.prj.notice.serviceImpl.NoticeServiceImpl;
import co.micol.prj.notice.vo.NoticeVO;

public class NoticeSelect implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse repResponse) {
		//세부 글 보기
		NoticeService noticeDao = new NoticeServiceImpl();
		NoticeVO vo = new NoticeVO();
		vo.setId(3);
		
		request.setAttribute("notice", noticeDao.noticeSelect(vo));  //본문글
		request.setAttribute("reply", noticeDao.replySelectList(vo));  //댓글
		return "notice/noticeSelect";
	}

}
