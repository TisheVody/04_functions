# 04_functions
## Задача №1 - Максимальное покрытие

Вам нужно взять уже полюбившуюся функцию расчёта комиссии при переводе и написать для неё автотесты:

![](pic/vk-commission.png)

Подключите JUnit4 и JaCoCo. Добейтесь того, чтобы покрытие кода по branch было не менее 80%:

![](pic/branches.png)

Информацию о том, что значит по branch вы найдёте на [официальном сайте JaCoCo](https://www.eclemma.org/jacoco/trunk/doc/counters.html).

Итог: у вас должен быть репозиторий на GitHub, в котором будет ваш Gradle-проект. Автотесты также должны храниться в репозитории.

В случае возникновения проблем с генерацией отчёта, смотрите [соответствующий раздел](https://github.com/netology-code/kt-homeworks/blob/master/04_functions/README.md#%D0%B2%D0%BE%D0%B7%D0%BC%D0%BE%D0%B6%D0%BD%D1%8B%D0%B5-%D0%BF%D1%80%D0%BE%D0%B1%D0%BB%D0%B5%D0%BC%D1%8B-%D0%B8-%D0%B8%D1%85-%D1%80%D0%B5%D1%88%D0%B5%D0%BD%D0%B8%D1%8F)

Если тесты отказываются запускаться или происходят непонятные проблемы с jacoco, то также удалите из build.gradle следующие строки:

```
test {
    useJUnitPlatform()
}
```

Они подключают JUnit5, который конфликтует с JUnit4.

## Задача №2 - CI

Запускать тесты на своём компьютере - хорошо, а запускать их при каждом пуше в облаке – ещё лучше. Когда вы будете работать в команде, сразу будет видно, кто «сломал» сборку, а кто прислал "«нерабочий PR (Pull-Request)». В этом вся прелесть командной работы 😈!

Мы настроим CI на базе GitHub Actions - уже встроенной в GitHub системы.
