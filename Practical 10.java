class Game{
 
 	static String[][] layout;
 	int i=0,j=0;
 	
	 public static void main(String args[])
	 {
	     int size=Integer.parseInt(args[0]);
	     Game g=new Game(size);
	     g.displayGrid(size,layout);
	 }
 
	Game(int size)
	{
	 	 layout=new String[size][size];
	 	 for(int i=0; i<size; i++)
		    {
		    for(int j=0; j<size; j++)
			{
			 layout[i][j]=Integer.toString((i+j+1)%size);
			}
		    }	
	}
 
	 void displayGrid(int size,String[][] layout)
	   {
		  for(int line=1; line<=2*size+1; line++)
		  {
		       for(int symbol=1; symbol<=2*size+1; symbol++)
		        {
		            if(line%2!=0 && size<10)
		            {
		              if(symbol%2!=0)
		              {
		                System.out.print(" ");
		              }
		              else if(symbol%2==0)
		              {
		                System.out.print("_");
		              }
		            }
		            else if(line%2!=0 && size>=10)
		            {
		              if(symbol%2!=0)
		              {
		                System.out.print(" ");
		              }
		              else if(symbol%2==0)
		              {
		                System.out.print("__");
		              }
		            }
		            else if(line%2==0)
		            {
		               if(symbol%2!=0)
		               {
		                System.out.print("|");
		               }
		               else
		               {
		                 if(j==size)
		                 {
		                 	i++;
		                 	j=0;
		                 }
		                 System.out.printf(" "+layout[i][j]+" ");
		                 j++;
		               }
		            }
		        }
		 System.out.print("\n");
	        }
	   }
}
