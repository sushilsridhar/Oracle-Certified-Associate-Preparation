interface A{
    
    int groupID = 10;
 
    default boolean equals(Object obj){
        return this.groupID == ((A)obj).groupID;
    } 
        
    static void print(){
        System.out.println("A");
     }
}