package com.example.datajpa.dto;


import com.example.datajpa.entity.Member;
import lombok.Data;

@Data
public class MemberDto {
    private Long id;
    private String username;
    private String teamname;

    public MemberDto(Long id, String username, String teamname) {
        this.id = id;
        this.username = username;
        this.teamname = teamname;
    }

    //Dto에서 직접 Entity를 받아서 처리한다. 권장
    public MemberDto(Member member) {
        this.id = member.getId();
        this.username = member.getUsername();
    }
}
