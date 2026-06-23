public class snake{
        public static void main(String args[]){
            int rows = 5;
            int cols = 5;
            int min = 1;

            int[][] matrix = new int [rows][cols];
            
            for(int i=0;i<rows;i++){
                if(i%2 ==0){
                    for(int j=0;j<cols;j++){
                        matrix[i][j]=min++;
                    }
                } else {
                    for(int j = cols-1;j>=0;j--){
                        matrix[i][j]=min++;
                    }
                }
            }

              for(int i=0;i<rows;i++){
                  for(int j=0;j<cols;j++){
                      System.out.printf("%-3d", matrix[i][j]);
                    }
                    System.out.println();
                }
          }
  }
