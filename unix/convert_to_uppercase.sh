# !/bin/bash

read -p "Enter a word/phrase to go to upper: " str
echo $str | tr a-z A-Z
