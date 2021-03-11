package megacom.kg.models;

public class Ticket implements Comparable<Ticket> {

    private int cost;
    private boolean isVip;

    public Ticket() {
    }

    public Ticket(int cost, boolean isVip) {
        this.cost = cost;
        this.isVip = isVip;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isVip() {
        return isVip;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "cost=" + cost +
                ", isVip=" + isVip +
                '}';
    }

    @Override
    public int compareTo(Ticket o) {
        if(isVip == o.isVip){
            if(cost > o.getCost()){
                return 1;
            }else {
                return -1;
            }
        }else {
            if(isVip == isVip){
                return 1;
            }else {
                return -1;
            }
        }



    }

}
