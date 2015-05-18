#HASHING/ HASH TABLES

store things in a table by index (in an array)

take a unique ID and convert it onto a table index to store it

hash function h(x) a mapping function, takes a piece of information and converts it to an index to our hash table
	
	ex: osis #'s
		h(x)=x%10,000
		h(x)=multiply/add all non-zero digits to x%10,000
