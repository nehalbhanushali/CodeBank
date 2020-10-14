//hackerrank solved

int FindMergeNode(Node headA, Node headB) {
    // Complete this function
    // Do not write the main method.
   int a = getLength(headA);
   int b=  getLength(headB);
     Node p1 = headA,p2 = headB;
    
    int d = java.lang.Math.abs(a-b);
    
    if(b>a){
        Node t = p1;
        p1= p2;
        p2= t;
    }
    
    if(a!=b)
    {
      for(int i = 0; i<d;i++){
          p1 = p1.next;
      }  
    }
    
    while(p1!=null && p2!=null ){
        
        if(p1==p2){
          return p1.data;   
        }
        
        p1=p1.next;
        p2=p2.next;
    }
    
   
    
   
    return -1;
   
    
      
}

int getLength(Node head)
    {
    Node n = head;
    int count= 0;
    while(n.next != null){
        n = n.next;
        count++;
    }
    return count;
}
