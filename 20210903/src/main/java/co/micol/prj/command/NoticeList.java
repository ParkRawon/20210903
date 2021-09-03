package co.micol.prj.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.common.Command;
import co.micol.prj.notice.service.NoticeService;
import co.micol.prj.notice.serviceImpl.NoticeServiceImpl;
import co.micol.prj.notice.vo.NoticeVO;

public class NoticeList implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse repResponse) {
		// 게시판 리스트
		NoticeService noticeDao = new NoticeServiceImpl();
		List<NoticeVO> list = new ArrayList<NoticeVO>();
		list = noticeDao.noticeSelectList();
		
		request.setAttribute("notices", list);
		//request.setAttribute("notices", noticeDao.noticeSelectList());  결과를 바로 실어버려도 된다
		
		return "notice/noticeList";
	}

}
