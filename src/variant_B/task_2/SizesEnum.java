package variant_B.task_2;

public enum SizesEnum {
    XXS(32){
        @Override
        public String getDescription() {
            return "Kid size";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    SizesEnum(int euroSize) {
        this.euroSize = euroSize;
    }

    private final int euroSize;

    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription() {
        return "Adult size";
    }
}
