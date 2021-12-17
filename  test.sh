#!/bin/bash
for ko in $(find *.urlwithjson -type f) ; do
  if [[ $ko == blub* ]]
	then
		while IFS= read -r line
	    	do
			echo $line | awk '{split($0,a,"."); print a[2]}'
		done < "$ko"
	else
			r=$(awk -F. '{print $1}' $ko);
			h=$(awk -F. '{print $2}' $ko);
			curl -X PUT -H "Content-Type: application/json;" \n
				 -d $h $r
	fi
done
