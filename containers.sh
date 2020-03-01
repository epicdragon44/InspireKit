#!/bin/sh
pkexec apt-get install docker.io
pkexec systemctl start docker
pkexec systemctl enable docker

snap install microk8s --classic
snap install juju --classic

snap install kubectl --classic

snap install lxd

exit 0