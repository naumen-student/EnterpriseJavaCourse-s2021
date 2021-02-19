Пример приложения показанного на первой лекции
===

### Редактирование в [IDEA](https://www.jetbrains.com/ru-ru/idea/download/)
Открыть текущую папку в IDE


## Подготовка
- получить токен бота у [@BotFather](https://t.me/botfather)
- вставить токен в конфигурационный файл [application.properties](src/main/resources/application.properties), заменив слово `tut_token` на токен


## Сборка приложения, из консоли
### Windows:
```shell
.\mvnw.cmd install
```
Linux / MacOS
```shell
./mvnw install
```

## Запуск приложения
### Windows:
```shell
.\mvnw.cmd spring-boot:run
```

### Linux/MacOS
```shell
./mvnw spring-boot:run
```

### Запуск из IDEA
в классе [RtfdemoApplication](src/main/java/ru/urfu/rtfdemo/RtfdemoApplication.java) нажать на зеленый треугольник ► рядом с названием класса