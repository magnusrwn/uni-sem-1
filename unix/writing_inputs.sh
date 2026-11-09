# !/bin/bash

# echo "data that is to be written to addressbook.txt" >> addressbook.txt

echo "Input what you would like to do"
echo "r = read, w = write"
read -p ": " func

if [[ $func == "r" ]];then
    read -p "Enter their email or name: " search
    found=$(grep "$search;" addressbook.txt)
        echo "Found entry: $found"
elif [[ $func == "w" ]];then
    read -p "what is their name?: " name
    read -p "what is their email?: " email
    echo "$name;$email">>addressbook.txt


else
    echo "please re-run and input either 'r' or 'w'"
fi
