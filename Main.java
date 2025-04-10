public class iAmBadAtCode {
public static void main(String[] args){
int[] xyz={4,9,1,3,7,0};
sortNumbers(xyz);
for(int i=0;i<xyz.length;i++)
System.out.print(xyz[i]+" ");
}

public static void sortNumbers(int[] z){
for(int i=0;i<z.length-1;i++){
for(int j=0;j<z.length;j++)
{
if(z[i]<z[j]){
int TEMP=z[i];
z[i]=z[j];
z[j]=TEMP;
}}}}
