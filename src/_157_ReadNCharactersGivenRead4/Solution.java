/**
 * Time : O() ; Space: O()
 * @tag : String
 * @by  : Steven Cooks
 * @date: Sep 25, 2015
 ***************************************************************************
 * Description:
 * 
 * The API: int read4(char *buf) reads 4 characters at a time from a file. 
 * 
 * The return value is the actual number of characters read. For example, 
 * it returns 3 if there is only 3 characters left in the file. 
 * 
 * By using the read4 API, implement the function int read(char *buf, int n) 
 * that reads n characters from the file. 
 * 
 * Note: The read function will only be called once for each test case.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/read-n-characters-given-read4/ }
 */
package _157_ReadNCharactersGivenRead4;

/** see test {@link _157_ReadNCharactersGivenRead4.SolutionTest } */
/*
 * The read4 API is defined in the parent class Reader4. int read4(char[] buf);
 */
public class Solution extends Reader4 {

    private static final int SIZE = 4;

    /**
     * @param buf Destination buffer
     * @param n Maximum number of characters to read
     * @return The number of characters read
     */
    public int read(char[] buf, int n) {
        char[] buffer = new char[SIZE];
        boolean eof = false;
        int bytes = 0;
        while (bytes < n && !eof) {
            int in = read4(buffer);
            if (in != SIZE) {
                eof = true;
            }
            int len = Math.min(in, n - bytes);
            for (int i = 0; i < len; i++) {
                buf[bytes + i] = buffer[i];
            }
            bytes += len;
        }
        return bytes;
    }

}
