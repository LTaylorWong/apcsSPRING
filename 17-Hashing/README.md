#HASHING/ HASH TABLES

store things in a table by index (in an array)

	allows for constant time

take a unique ID and convert it onto a table index to store it

hash function h(x) a mapping function, takes a piece of information and converts it to an index to our hash table

	ex: osis #'s
		h(x)=x%10,000
		h(x)=multiply/add all non-zero digits to x%10,000

PROBLEM: multiple object can hash to the same index (collision)

	hash table's array has to be sufficiently large (sparsely populated)
