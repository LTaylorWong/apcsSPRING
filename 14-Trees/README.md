<html>
<br><b>Trees:</b> a acylic graph with no nodes designated as the root;
<br>either empty or has one or more nodes, each node can have zero or more children and one node is designated as the root.
<ul> <b>Graph:</b> a collection of nodes and edges (vertices)</ul> 
<ul> node---> holds stuff</ul>
<ul> edge---> connects nodes</ul>

Root

Child 

Parent

Leaf---> node w/ no children

Siblings---> from the same parent

Ancestors---> any node on the path from n to the root

Descendants--->children, their children etc.

<b>Binary Trees:</b> Each node is a leaf or has one or two children
<ul>given any node with value V, all the nodes in the left subtree have values <V and all nodes in the right subtree have values >V</ul>


public node search(Node T, Integer i){
  while (T!=null){
    int c=T.getData().compareTo(i);
    if (c>0){
      T=T.getRight();
    }else if (c<0){
      T=T.getLeft;
    }else return T;
    }
    return null;
    }
      
</html>
