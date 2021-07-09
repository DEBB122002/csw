package array;

public class soduku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]={{7,9,2,1,5,4,3,8,6}, 
              {6,4,3,8,2,7,1,5,9},
              {8,5,1,3,9,6,7,2,4},
              
              {2,6,5,9,7,3,8,4,1},
              {4,8,9,5,6,1,2,7,3},
              {3,1,7,4,8,2,9,6,5},
              
              {1,3,6,7,4,8,5,9,2},
              {9,7,4,2,1,5,6,3,8},
              {5,2,8,6,3,9,4,1,7}};
boolean b1[]=new boolean[10];
int check=0;

int f[]=new int[1000];

for(int i=1;i<10;i++)
{b1[i]=true;
f[i]=0;
	}



for(int i=0;i<9;i++)
	
{for(int k=1;k<10;k++)
{b1[k]=true;
f[k]=0;
	}

	for(int j=0;j<9;j++)
{if(arr[i][j]>=1&&arr[i][j]<10)
{f[arr[i][j]]++;
	
	}
else if(arr[i][j]=='_')
{break;
	}
else {check++;
		//System.out.println(false);
		break;
	}
	

}
for(int p=1;p<10;p++)
{if(f[p]>1) {check++;break;
	//System.out.println(false);
	
}
	}
}
for(int i=1;i<10;i++)
{b1[i]=true;
f[i]=0;
	}



for(int i=0;i<9;i++)
	
{for(int k=1;k<10;k++)
{b1[k]=true;
f[k]=0;
	}

	for(int j=0;j<9;j++)
{if(arr[j][i]>=1&&arr[j][i]<10)
{f[arr[j][i]]++;
	
	}else if(arr[j][i]=='_')
{break;
	}
else {check++;
		//System.out.println(false);
		break;
	}
	

}
for(int p=1;p<10;p++)
{if(f[p]>1) {check++;
	//System.out.println(false);
	break;
	
}
	}}
for(int i=0;i<9;i++)
{for(int j=0;j<9;j++)
{System.out.print(arr[i][j]+" ");
	
}System.out.println();
}
boolean a1=sub(arr,0,0,2,2);
boolean a2=sub(arr,3,0,5,2);
boolean a3=sub(arr,6,0,8,2);
boolean a4=sub(arr,0,3,2,5);
boolean a5=sub(arr,3,3,5,5);
boolean a6=sub(arr,6,3,8,5);
boolean a7=sub(arr,0,6,2,8);
boolean a8=sub(arr,3,6,5,8);
boolean a9=sub(arr,6,6,8,8);

if(a1&&a2&&a3&&a4&&a5&&a6&&a7&&a8&&a9&&(check==0))
{System.out.println(true);
	}
	
else {
	System.out.println(false);
}
	
	}
	
public static boolean sub(int arr[][],int start,int start2,int p,int g)
{int f[]=new int[1000];
	for(int i=1;i<10;i++)
{f[i]=0;
	
}
for(int i=start;i<=p;i++)
{for(int j=start2;j<=g;j++) { if(arr[i][j]=='_')
{break;
}
	f[arr[i][j]]++;
	
}
	}
for(int i=1;i<10;i++)
{if(f[i]>1)
{return false;}

	}
return true;
}



}

