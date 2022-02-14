import java.util.random.RandomGenerator;

/*
 *  The isBadVersion API is defined in the parent class VersionControl.
 *  boolean isBadVersion(int version);
*/
class VersionControl {
    private int firstBadVersion;
    public VersionControl() {
        firstBadVersion = RandomGenerator.getDefault().nextInt();
    }

    boolean isBadVersion(int num) {
        return num >= firstBadVersion;
    }
}


class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 0;
        int r = n;

        while (r - l > 1) {
            int mid = l + (r - l) / 2;
            if (isBadVersion(mid))
                r = mid;
            else
                l = mid;
        }
        return r;
    }
}
