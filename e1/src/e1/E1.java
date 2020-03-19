package e1;

abstract class demo
{
abstract void show();
}
class second extends demo
{
    @Override
    public void show()
    {
        System.out.println("demo of");
    }
}
class e1
{
    public static void main(String[] args) {
        second s=new second();
        s.show();
    }
}