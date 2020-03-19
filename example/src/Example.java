interface a
{
    public int a=10;
}
interface b
{
    public int b=20;
}
class main implements a,b
{int ans;
    void count()
    {
        int ans=a+b;
    }
    void display()
    {
        System.out.println(ans);
    }
}
class lol
{
    public static void main(String[] args) {
        main m=new main();
        m.count();
        m.display();
    }
}