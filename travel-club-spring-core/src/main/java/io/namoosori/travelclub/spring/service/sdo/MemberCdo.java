package io.namoosori.travelclub.spring.service.sdo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MemberCdo {
    //
    private String email;
    private String name;
    private String nickName;
    private String phoneNumber;
    private String birthDay;
}
