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
 * Note: The read function may be called multiple times.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/read-n-characters-given-read4-ii-call-multiple-times/ }
 */
package _158_ReadNCharactersGivenRead4II;

import _157_ReadNCharactersGivenRead4.Reader4;

/** see test {@link _158_ReadNCharactersGivenRead4II.SolutionTest } */

/*
 * The read4 API is defined in the parent class Reader4. int read4(char[] buf);
 */
public class Solution extends Reader4 {
    
    private char[] buffer = new char[4];
    private int offset = 0;
    private int bufsize = 0;
    
    /**
     * @param buf Destination buffer
     * @param n Maximum number of characters to read
     * @return The number of characters read
     */
    public int read(char[] buf, int n) {
        int readBytes = 0;
        boolean eof = false;
        while (!eof && readBytes < n) {
            int size = (bufsize > 0)  ? bufsize : read4(buffer);
            if (bufsize == 0 && size < 4) {
                eof = true;
            }
            int bytes = Math.min(n - readBytes, size);
            for (int i = 0; i < bytes; i++) {
                buf[readBytes + i] = buffer[offset + i];
            }
            offset = (offset + bytes) % 4;
            bufsize = size - bytes;
            readBytes += bytes;
        }
        return readBytes;
    }

}
