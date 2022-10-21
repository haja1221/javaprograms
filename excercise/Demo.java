  class Demo
    {
    public static void main(String[] args)
    {
    Demo demo = new Demo();
    int result = demo.add(10,20);
    int result1= demo.multiply(10,20);
    System.out.println(result+"\n"+result1);
    }
    int multiply(int no1,int no2){
    return no1*no2;

    }
    int add(int no1, int no2)
    {
    
    return no1+no2;
    }
    }
