package ru.netology.data;

import lombok.Value;
import ru.netology.page.DashboardPage;

public class DataHelper {
    private DataHelper() {
    }

    @Value
    public static class AuthInfo {
        private String login;
        private String password;
    }

    @Value
    public static class FirstCardInfo {
        private String firstCardNumber;
        private String firstCardId;
    }

    @Value
    public static class SecondCardInfo {
        private String secondCardNumber;
        private String secondCardId;
    }

    public static AuthInfo getAuthInfo() {
        return new AuthInfo("vasya", "qwerty123");
    }

    public static FirstCardInfo getFirstCardInfoFor(AuthInfo info) {
        return new FirstCardInfo("5559 0000 0000 0001", "92df3f1c-a033-48e6-8390-206f6b1f56c0");
    }

    public static SecondCardInfo getSecondCardInfoFor(AuthInfo info) {
        return new SecondCardInfo("5559 0000 0000 0002", "0f3f5c2a-249e-4c3d-8287-09f7a039391d");
    }

    public static AuthInfo getUnAuthInfo(AuthInfo original) {
        return original;
    }

    @Value
    public static class VerificationCode {
        private String code;
    }

    public static VerificationCode getVerificationCodeFor(AuthInfo info) {
        return new VerificationCode("12345");
    }
}
