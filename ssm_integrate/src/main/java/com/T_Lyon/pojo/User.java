package com.T_Lyon.pojo;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
private String username;
private String password;
private Data login_time;
private String grade;
private String role;
}
