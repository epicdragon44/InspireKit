#!/bin/sh 
pkexec apt-get install -y libjs-jquery

wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb
pkexec apt install ./google-chrome-stable_current_amd64.deb

pkexec apt install nodejs
pkexec apt install npm

pkexec apt-get install ruby-full build-essential rubygems
gem install sass

npm install -g @angular/cli

snap install brackets --classic

exit 0