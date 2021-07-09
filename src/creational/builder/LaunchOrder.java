package creational.builder;

public class LaunchOrder {

    public static class Builder{
        private String bread;
        private String dressing;
        private String meat;

        // can be used to force the required parameters
        public Builder(){
        }

        public Builder bread(String bread){
            this.bread = bread;
            return this;
        }

        public Builder dressing(String dressing){
            this.dressing = dressing;
            return this;
        }

        public Builder meat(String meat){
            this.meat = meat;
            return this;
        }

        public LaunchOrder build(){
            return new LaunchOrder(bread,dressing,meat);
        }
    }


    private String bread;
    private String dressing;
    private String meat;

    private LaunchOrder(String bread, String dressing, String meat) {
        this.bread = bread;
        this.dressing = dressing;
        this.meat = meat;
    }

    public String getBread() {
        return bread;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}
