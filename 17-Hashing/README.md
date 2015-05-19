#HASHING/ HASH TABLES

store things in a table by index (in an array)

	allows for constant time

take a unique ID and convert it onto a table index to store it

hash function h(x) a mapping function, takes a piece of information and converts it to an index to our hash table

	ex: osis #'s
		h(x)=x%10,000
		h(x)=multiply/add all non-zero digits to x%10,000

#PROBLEM: multiple object can hash to the same index (collision)

	hash table's array has to be sufficiently large (sparsely populated)
	hash function should do a good job distributing items in the table

#pseudo code:

	int hash(string s){
		h=1;
		for (i=0 to s.length){
			h=h*11+int(s.charAt(i));
		}
		return h % tablesize
	}
	
#Closed Hashing 

everything is stored in array

Collision:

	-Rehashing

	-Linear probing
	
	-Leave space in the table using a multiplier
	
<b>Runtime</b>

insert: expected O(1)

retrival: expect O(1)

#Open Hashing

each and every element is a "pointer to" a linked list of values that hash to that element

<b>Runtime</b>

insert: O(1) ALWAYS CONSTANT TIME

retrival: expected O(1), O(n) with respect to length(n) of linked list @ current location
