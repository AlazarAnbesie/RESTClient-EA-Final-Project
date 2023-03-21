package edu.miu.badge.domain;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString(exclude = {"badges", "memberships"})
@AllArgsConstructor
@NoArgsConstructor
public class ResponseMemberDTO {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private List<Role> roles;
    private List<Badge> badges;
    private List<Membership> memberships;
}