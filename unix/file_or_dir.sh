# !/bin/bash

# works as checking with 'test/[ ... ]''
read -p "Input a file/folder name please: " inp
if [ -e $inp ]; then
    if [ -f $inp ]; then
        echo "$inp is a file"
    else [ -d $inp ]
        echo "$inp is a directory"
    fi
else
    echo "Input represents neither a directory or a file in current working location"
fi


# works as checking with 'ls -l' () commented
# read -p "Input a file/folder name please: " inp
# type=$(ls -l -- "$inp" | cut -c1) # grabs first char from response. I.e., a -, d or something else
# case $type in
#     d)
#         echo "$input is a directory"
#         ;;
#     -)
#         echo "$input is a file"
#         ;;
#     *)
#         echo "$input represents neither a directory or a file in current working location"
#         ;;
# esac