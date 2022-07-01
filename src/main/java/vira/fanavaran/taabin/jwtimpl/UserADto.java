package vira.fanavaran.taabin.jwtimpl;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserADto {
    @JsonProperty("username")
    public String username;
    @JsonProperty("password")
    public String password;

}
