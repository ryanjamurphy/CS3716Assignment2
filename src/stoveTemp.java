public enum stoveTemp {
        HIGH, LOW, OFF;
        public String toString() {
            switch(this) {
                case HIGH: return "high";
                case LOW: return "low";
                default: return "off";
            }
        }
    }