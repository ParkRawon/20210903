package co.micol.prj.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.common.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.serviceImpl.MemberServiceImpl;
import co.micol.prj.member.vo.MemberVO;

public class MemberList implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse repResponse) {
		// 멤버리스트
		MemberService memberDao = new MemberServiceImpl();
		List<MemberVO> list = new ArrayList<MemberVO>();
		list = memberDao.memberSelectList();
		
		request.setAttribute("members", list);
		return "member/memberList";
	}

}
