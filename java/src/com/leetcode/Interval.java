package com.leetcode;

/**
 * For problems:
 * <p>
 * {@link _056_MergeIntervals.Solution [056]Merge Intervals}
 */
public class Interval {
    public int start;
    public int end;

    public Interval() {
        start = 0;
        end = 0;
    }

    public Interval(int s, int e) {
        start = s;
        end = e;
    }

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
        // TODO Auto-generated method stub
        return super.hashCode();
    }

}
