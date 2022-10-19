class Cusionchair extends WoodenChair{
    
     String colour="black";
      
     // int colour= 5;

     @Override
     private void seating(){
       System.out.println("sponge");
   
     }
    
     

     public static void main(String[]args){
     Cusionchair chair= new Cusionchair();
     System.out.println(chair.colour);  
     chair.seating();   
     }
}
