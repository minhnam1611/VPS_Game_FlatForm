package com.example.vps_game_flatform.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ReponseObject {
    public static final int SUCCESS=200;
    public static final int Fail=207;

    private int code;
    private Object data;
    private String desc;


}
