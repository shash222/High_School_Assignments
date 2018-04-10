/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coin;
import java.util.Random;
public class Coin{
    String sideUp;
    Random gen=new Random();
    int num;

    public String initialSide(){
        num=gen.nextInt(2)+1;
        if (num==1){
            sideUp="Heads";
        }
        else{
            sideUp="Tails";
        }
        return sideUp;
    }

    public void flip(){
        num=gen.nextInt(2)+1;
        if (num==1){
            sideUp="Heads";
        }
        else{
            sideUp="Tails";
        }
    }

    public String getSideUp(){
        flip();
        return sideUp;
    }
}