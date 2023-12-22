package umc.spring.service.memberService;

import umc.spring.domain.Member;
import umc.spring.web.dto.member.MemberRequestDTO;

public interface MemberCommandService {
    public Member joinMember(MemberRequestDTO.JoinDTO request);
}
