package com.T_Lyon.pojo;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String username;
    private String password;
    private String login_time;
    private String grade;
    private String role;
}
