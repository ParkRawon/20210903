package co.micol.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.common.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.serviceImpl.MemberServiceImpl;
import co.micol.prj.member.vo.MemberVO;

public class MemberInsert implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse repResponse) {
		// TODO Auto-generated method stub
		MemberService memberDao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		//여기에 폼화면에서 넘어온 값을 vo개체에 싫어준다 vo.setId(request.getParametervalue("id"))
		memberDao.memberInsert(vo);
		
		return "memberList.do";
	}

}
