package com.alexcovizzi.systemnotification.Utils;

/**
 * Created by Alex on 10/11/2017.
 */

public class MeasureUnit {
    
    public class Byte {
        private long bytes;
        private boolean perSec;
        
        public Byte(long bytes, boolean perSec) {
            this.bytes = bytes;
            this.perSec = perSec;
        }
    
        @Override
        public String toString() {
            String s = bytes + " Bytes";
            if(perSec) s += "/s";
            return s;
        }
    }
    
    public class KHz {
        private long khz;
        
        public KHz(long khz) {
            this.khz = khz;
        }
    
        @Override
        public String toString() {
            return khz + " KHz";
        }
    }
}
