public class App {
    private int[] arr = new int[20];
    
    private int arrSize = 10;
   
    public void generateRandom(){
        for(int i = 0; i < arrSize; i++){
            arr[i] = (int)(Math.random()*10+10);
        }
    }

    public void printArr(){
        System.out.println("-----------------");
        for(int i = 0; i < arrSize; i++ ){
            System.out.println("|___" + i + " |");
            System.out.println(arr[i]);
        }
    }

    public int getValueAtIndex(int index){
        if(index < arrSize) return arr[index];
        return 0;
    }
    public static void main(String[] args) throws Exception {
        App newArr = new App();
        
        newArr.generateRandom();
        newArr.printArr();
        System.out.println(newArr.getValueAtIndex(8)); 
    }
}
