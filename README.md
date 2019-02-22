# appiumExample

Установка oracle-java8, Ubuntu:

`sudo add-apt-repository pa:openjdk-r/ppa`

`sudo apt update`

`sudo apt install openjdk-11-jdk:amd64`

`sudo update-alternatives --config java`

Донастроить локали:

`apt-get install --reinstall locales && sudo dpkg-reconfigure locales`

`dpkg-reconfigure locales`

Скачать, и установить Android Studio
`https://developer.android.com/studio/`

Настроить Android Virtual Device

Положить в папку `src/test/java/resources` .apk файл
В классе `src/test/java/exp/core/TestBase` в методе `beforeClass` актуализировать настройки.  
В классе `src/test/javav/exp/Probe` изменить ожидаемые поля на актуальные.


Запуск тестов/команд строится по принципу:  

`./gradlew` очищает билд, запускает тесты = `./gradlew clean test` 
`./gradlew allureReport` генерирует отчет Allure о прогоне
`./gradlew dependencyUpdates` показывает, у каких зависимостей есть обновления.
`./gradlew useLatestVersions` обновляет зависимости в файле `build.gradle` до последних обнаруженных. 
