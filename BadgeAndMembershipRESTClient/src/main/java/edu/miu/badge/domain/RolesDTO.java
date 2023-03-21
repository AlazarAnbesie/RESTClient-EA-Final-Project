package edu.miu.badge.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RolesDTO {
    private int id;
    private String roleType;
    @JsonIgnore
    private List<ResponseMemberDTO> member;
}