# use:
#	sed -f parse.sed leetcode.html | awk -f join.awk
# -------------------------------------------------------
BEGIN { }
{  
	if (NR % 4 == 1)
	    {w = $0} 
	else 
	    {w = w "\t" $0}
	if (NR % 4 == 0) 
	    {print w}
}
END { }
