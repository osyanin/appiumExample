revo-mobile-autotest
# appiumExample

Установка oracle-java8, Ubuntu:

`sudo add-apt-repository pa:openjdk-r/ppa`

`sudo apt update`

`sudo apt install openjdk-11-jdk:amd64`

`sudo update-alternatives --config java`

Донастроить локали:

`apt-get install --reinstall locales && sudo dpkg-reconfigure locales`

`dpkg-reconfigure locales`

Команда строится по принципу: 

`./gradlew` запускает тесты, вытягивая актуальные изменения из репозитория. Дополнительные команды выполняются на текущей версии.
