import java.lang.*;


interface Circle
{
    
     float PI=3.14f;
    
   float calculateArea (float Radius);
     float CalculateCircumfarance(float Radius);
}
class Area implements Circle
{
   public float calculateArea(float Radius)
    {
        return(PI*Radius*Radius);
    }
   public float CalculateCircumfarance(float Radius)
    {
        return(2*PI*Radius);
    }
}
class Marvellous2
{

public static void main(String a[])
{
    Area obj=new Area();
    float fRet=0.0f;

    fRet=obj.calculateArea(10.5f);
    System.out.println("Area is:"+fRet);
    System.out.println("Circumferance is"+fRet);
}
}

