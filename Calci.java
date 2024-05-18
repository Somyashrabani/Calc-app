interface calci{
int add(int a, int b)
}
class CalcImpl implements calci{
    public int add(int a, int b){
        return a+b;
    }
}
