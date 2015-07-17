# use:
#   sed -f parse.sed leetcode.html
##########################################

# Remove all lines before <table id="problemList" ..  and after paired </table>
# 
1,/<table id="problemList"/d
/<\/table>/, $d

# Remove lines before <tbody and after </tbody>
#/<thead>/, /<\/thead>/d

# Remove lines that have the tab <tr> or <\tr>
/<tr>/d
/<\/tr>/d

# Remove all blank lines
/^$/d

# Convert each &nbsp; to a space
s/\&nbsp;/ /g

# Remove all html tags
s/<a href=\"/https\:\/\/leetcode.com/g
s/<[^>]*>//g
s/\">/\
/g

# Remove whitespace at the beginning and the end of each line
s/^ *//   
s/ *$//
/^$/d


