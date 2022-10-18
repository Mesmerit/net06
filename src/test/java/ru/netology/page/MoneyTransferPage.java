package ru.netology.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MoneyTransferPage {
    private SelenideElement amountField = $("[data-test-id=amount] input");
    private SelenideElement fromCardField = $("[data-test-id=from] input");

    public MoneyTransferPage() {
        amountField.shouldBe(visible);
        fromCardField.shouldBe(visible);
    }

    public DashboardPage moneyTransfer(int amount, String from) {
        amountField.setValue(Integer.toString(amount));
        fromCardField.setValue(from);
        $("[data-test-id=action-transfer]").click();

        return new DashboardPage();
    }

    public void moneyTransferError(int amount, String from) {
        amountField.setValue(Integer.toString(amount));
        fromCardField.setValue(from);
        $x("//*[text()='Ошибка! Недостаточно средств!']").shouldBe(visible);
    }
}
