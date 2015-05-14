 <h1>HEAP THINGS</h1>
====
<h2>Characteristics</h2>
    Each Child is greater that the parent
    each has full possible left and right
    given node n, n'a children are 2n, 2n+1
     
  <h2>  Remove:</h2>
      1.remove min
      2.replace with lowest right value
      3.pushdown: swap the root with the smaller childand continue down
      until we're done
     Insert:
       1.add new lowest left node
       2.sift up
     ~Runtimes~
      find min: O(1)
      --------------
      remove min,
      push down,
      insert: O(log n)
      ---------------
      heapSort: O(nlogn)
     
