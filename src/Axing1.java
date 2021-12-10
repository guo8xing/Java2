public class Axing1 {
    public static void main(String[] args){
        Incom[] incoms=new Incom[]{
                new Incom(3000),
                new Salary(6000),
                new StateCouncilSpecial(5000)
        };
        System.out.println(totalTax(incoms));


    }
    public static double totalTax(Incom...incoms){
        double total=0;
        for(Incom incom:incoms){
            total=total+incom.getTax();
        }
        return total;
    }
}
class Incom{
    protected double income;
    public Incom(double income){
        this.income=income;
    }
    public double getTax(){
        return income*0.1;
    }
}

class Salary extends Incom{
    public Salary(double incom){
        super(incom);
    }
    @Override
    public double getTax(){
        if(income<=5000){
            return 0;
        }
        return (income-5000)*0.2;
    }
}

class StateCouncilSpecial extends Incom{

    public StateCouncilSpecial(double income) {
        super(income);
    }
    @Override
    public double getTax(){
        return 0;
    }
}