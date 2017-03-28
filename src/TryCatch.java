/**
 * Created by eugene.iarosh on 3/28/2017.
 */
public class TryCatch {
    public static void  TryGetCatch(){
        try {
            throw new NullPointerException();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
