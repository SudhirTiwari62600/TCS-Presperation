public class findindex {
    public static int LinearSearch(int number[], int key){
        for(int i =0;i<number.length;i++){
         if(number[i]==key){
            return i;
         }
        }
        return -1;
    }
    public static void main (String[] args){
      int number[] = {1,5,8,7,6,4};
      int key =7;
      int result = LinearSearch(number,key);
      if(result == -1){
        System.out.println("not found");
      }else{
        System.out.println("Key is at index"+result);
      }
    }
}
