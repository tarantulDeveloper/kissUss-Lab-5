package variant_B.task_1;

public enum Season {
    WINTER(-15), SPRING(-5), SUMMER(31) {
        @Override
        public String getDescription() {
            return "The hottest season";
        }
    }, AUTUMN(10);
    private double avgTmp;

    Season(double avgTmp) {
        this.avgTmp = avgTmp;
    }

    double getAvgTmp() {
        return avgTmp;
    }

    public String getDescription() {
        return "The coldest season";
    }
}


