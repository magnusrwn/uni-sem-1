#!/bin/bash
clear

greeting="Hello"
if [ $USER -e ]; then
    echo "$greeting $USER"
else
    echo "$greeting user"
fi
echo
echo "your home dir is: "
echo $HOME
echo
echo "and your current working is:"
pwd
echo
echo "todays date is: "
date




