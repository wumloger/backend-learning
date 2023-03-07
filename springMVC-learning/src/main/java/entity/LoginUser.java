package entity;

import lombok.Data;

@Data
public class LoginUser {
    private Integer id;
    private String username;
    private String password;
}
