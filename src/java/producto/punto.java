package producto;

/**
 *
 * @author Tocuhier
 */
public class punto {
    int[] _nums;
    int _resul;
    
    public punto(int[] numeros){
        _nums= numeros;
        _resul= 0;
    }
    public int productoPunto(){
        _resul= (_nums[0] * _nums[1]) + (_nums[2] * _nums[3]);
        return this._resul;
    }
}
