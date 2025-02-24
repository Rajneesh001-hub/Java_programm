package arraypractice;

public class Q4 {
    public static void main(String[] args) {

        int [][]score={{3,5,6},
                     {6,8,9}};

        int [][]score2={{9,8,7},
                        {5,3,4}};

    

        int [][]result={{0,0,0},
                         {0,0,0}};

        for(int i=0; i<score.length;i++){
            for(int j=0;j<score[i].length;j++){
                System.out.format( "setting the value from i=%d and j=%d  \n",i,j);

                result[i][j]=score[i][j] + score2[i][j];
            }
        }
        for(int i=0; i<score.length;i++){
            for(int j=0;j<score[i].length;j++){
                System.out.print(result[i][j]+ " ");
               

                result[i][j]=score[i][j] + score2[i][j];
            }
            System.out.println(" ");
        }                                  
                         

    


        
        


    }
    
}
