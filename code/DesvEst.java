

/**
 * 
 */
public class DesvEst {

    /**
     * Default constructor
     */
    public DesvEst() {
    }

    /**
     * 
     */
    public double getDesvEst( double media ,  String[] dataList,  double n ) {
        double suma=0;
        for(int i=0;i<n;i++){
            suma=suma+Math.pow((Double.parseDouble(dataList[i])-media),2);
        }
        return Math.sqrt(suma/(n-1));
        // TODO implement here --- IGNORE ---
    }

}