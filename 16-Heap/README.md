 <h1>HEAP THINGS</h1>
====
<h2>Characteristics</h2>
    Each Child is greater that the parent
    each has full possible left and right
    given node n, n'a children are 2n, 2n+1
     
  <h2>  Remove:</h2>
      <ol>1.remove min</ol>
      <ol>2.replace with lowest right value</ol>
      <ol>3.pushdown: swap the root with the smaller childand continue down until we're done</ol>
     <h2>Insert:</h2>
       <ol>1.add new lowest left node</ol>
       <ol>2.sift up</ol>
     <h2>~Runtimes~</h2>
      find min: O(1)
      <br>--------------
      <br>remove min,
      <br>push down,
      <br>insert: O(log n)
      <br>---------------
      <br>heapSort: O(nlogn)
     
