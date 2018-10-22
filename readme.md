Я на локальную копию БД сделал.
Ликвикбасе выполняется с запуском сервиса.
запускается с GnafApplication, web server встроен в Boot, порт по умолчанию 8080.
файл настройки: application.properties
собрать докер образ: mvn dockerfile:build
запустить докер образ: docker run -p 8080:8080 -t perfekt/gnaf:latest
посмотреть контейнер: docker ps -a
посмотреть список образов: docker image ls -a
