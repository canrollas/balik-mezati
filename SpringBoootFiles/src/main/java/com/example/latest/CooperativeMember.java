package com.example.latest;

import java.util.UUID;

public class CooperativeMember extends User {
    private final String code;

    public CooperativeMember(String userName, String email, String password) {
        super(userName, email, password);
        String uuid = UUID.randomUUID().toString();
        code = "uuid = " + uuid;
    }

    public String getCode() {
        return code;
    }
}
