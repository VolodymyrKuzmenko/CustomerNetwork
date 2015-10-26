# CustomerNetwork
Для завантаження необхідно 
Java 8
MySQL база даних
Tomcat
Git
Maven

Самостійне скачування:
Командою git clone https://github.com/VolodymyrKuzmenko/CustomerNetwork.git
Або архівом з github

Для створення локальної БД, та заповнення її тестовими данними використовувати наступні скрипти
https://github.com/VolodymyrKuzmenko/CustomerNetwork/tree/master/dao/src/main/resources/sql-schemas

У файлі конфігурації Hibarnate сконфігурувати під свою базу (url, user, password).
https://github.com/VolodymyrKuzmenko/CustomerNetwork/blob/master/controller/src/main/resources/hibernate.cfg.xml

Далі да допомогою команди mvn package збирається проект у war архів і деплоїться на Tomcat.


