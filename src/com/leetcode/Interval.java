package com.leetcode;

/**
 * For problems:
 * <p>
 * {@link _056_MergeIntervals.Solution [056]Merge Intervals}
 * {@link _057_InsertInterval.Solution [057] Insert Interval}
 */
public class Interval {
    
    // start position of interval
    public int start;
    
    // end position of interval
    public int end;

    public Interval() {
        start = 0;
        end = 0;
    }

    public Interval(int s, int e) {
        start = s;
        end = e;
    }

    @Override
    public String toString() {
        return "[" + start + "," + end + "]";
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (obj == null || !(obj instanceof Interval)) {
            return false;
        }
        Interval interval = (Interval) obj;
        return start == interval.start && end == interval.end;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + ((Integer)start).hashCode();
        hash = 31 * hash + ((Integer)end).hashCode();
        return hash;
    }

}
