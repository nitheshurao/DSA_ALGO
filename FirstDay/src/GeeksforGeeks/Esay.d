```js

class Compute
{
    String average(int A[], int N)
    {
        int s=0;
        for( int i=0;i<N;i++){
            s= s+A[i];
        }
      
        double res = (double)s/A.length;
        String ss = String.format("%.2f",res);
        return ss;
    }
}
```