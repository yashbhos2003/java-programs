/*Q13. WAP to create class name as Search with two functions 
 boolean isPresent(int  key,int …value): this function can search the key present in an
array or not if present returns true otherwise return false.
*/

class Search{

     boolean isPresent(int key,int ...value){
       for(int i=0;i<value.length;i++){
          if(value[i]==key){
            return true;
          }
       }
       return false;
     }   
}

class SearchApp{
      public static void main(String [] args){
      Search s=new Search();
      Boolean result=s.isPresent(1,2,3,4,5,6); 
      System.out.println(result);
      }
}