ТЗ практики
===

### (Практика 1)
- Придумать тему проекта и составить план реализации из 6 задач и более<br>
Пример:<br>
Тема: **Картотека для библиотеки**

ПРИМЕР СОСТАВЛЕНИЯ ПУЛА ЗАДАЧ НА ПРОЕКТ:
1. Реализовать как минимум 3 сущности и реализовать связь с базой с помощью ORM<br>
Пример:
   1. Сущность "Книга" у нее есть поля (id, author, и т.д)(произвести разметку сущностей
   2. с помощью JPA)
   3. Сущность "Пользователь" у нее есть поля (id , fio, и т.д)...
   4. Сущность "Категория книг" у нее есть поля (id , type, и т.д)...
   5. Можно придумать ещё, но минимум 3 должно быть

2. Реализовать минимальный frontend(это может быть и телефонное приложение,
Телеграмм бот, сайт, как душе угодно) для отображения данных<br>
Пример:
   1. Реализовать Сайт на котором пока вывожу книги и список пользователей
   2. Реализовать DAO и Сервис для вывода данных по книгам и пользователям

3. Задание на функционал системы<br>
Пример: Реализовать Авторизацию и Регистрацию (Frontend & Backend)
   1. Прикрутить Spring security (Frontend & Backend)

4. Задание на функционал системы<br>
Пример: Реализовать Добавление Книг в базу (Frontend & Backend)
   1.  Реализовать DAO и Сервис для добавления книг в базу

5. Задание на функционал системы<br>
Пример: Реализовать Фильтр для поиска по разным параметрам книг (Frontend & Backend)
   1. Реализовать DAO и Сервис для реализации различных Фильтров (Подход и
реализация, как это будет сделано всё в ваших руках)

6. Задание на функционал системы<br>
Пример: Реализовать Страницу пользователя в которой можно будет посмотреть все выданные
ему книги (Frontend & Backend)
   1. Реализовать DAO и Сервис для для вывода данных по пользователю, а именно
данные по выданным ему книгам

7. Задание на функционал системы<br>
Пример: Реализовать Ролевую модель и учесть её в системе (имеется в виду Frontend &
Backend)
   1. Реализовать роль "Администратора" которая дает пользователю доступ на
просмотр данных по каждому пользователю
   2. Реализовать роль "Читатель" дает доступ только к своей карточке и общей
картотеке книг

8. Задание на читаемость своего кода<br>
Пример: Произвести Code Review своего кода
   1. Имеется переменная с наименованием a -> заменить на countPage
   2.  Имеется дублирующий код -> необходимо оптимизировать и избавиться от
дублирования на сколько это возможно
   3.  И всё в том же духе переменные, методы, классы и т.д Должны иметь корректный
осмысленный вид

### (Практика 2)
- Необходимо выполнить как минимум 3 задачи из вашего плана

### (Практика 3)
- Необходимо выполнить оставшийся пул задач

### (Практика 4)
- Защита проекта
   1. Обязательное посещение трех практик как минимум одним делегатом;(каждому из команды побывать хотя бы на одной практике)
   2. финальный показ
      - презентация на 5 минут
      - демонстрация кода и рабочего приложения (либо локально, либо взять что-то типа [heroku](https://www.heroku.com/ "heroku"))
