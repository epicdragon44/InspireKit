#!/bin/sh
pkexec apt-get install mysql-server mysql-client libmysqlclient-dev
pkexec apt-get install mysql-workbench
pkexec apt-get install apache2 apache2-doc apache2-npm-prefork apache2-utils libexpat1 ssl-cert
pkexec apt-get install libapache2-mod-php7.0 php7.0 php7.0-common php7.0-curl php7.0-dev php7.0-gd php-pear php-imagick php7.0-mcrypt php7.0-mysql php7.0-ps php7.0-xsl
pkexec apt-get install phpmyadmin
exit 0