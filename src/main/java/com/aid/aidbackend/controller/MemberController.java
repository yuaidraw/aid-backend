package com.aid.aidbackend.controller;

import com.aid.aidbackend.controller.dto.MemberDto;
import com.aid.aidbackend.service.MemberService;
import com.aid.aidbackend.utils.ApiResult;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.aid.aidbackend.utils.ApiUtils.succeed;

@RestController
@RequestMapping("/api/v1/members")
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping()
    public ApiResult<MemberDto> readMemberInfo(HttpServletRequest httpServletRequest) {
        String id = (String) httpServletRequest.getAttribute("member-id");
        return succeed(
                memberService.findOne(Long.valueOf(id))
        );
    }

}
