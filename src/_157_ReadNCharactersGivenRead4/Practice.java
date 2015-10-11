/**
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
 * @tag : String
 * {@link https://leetcode.com/problems/read-n-characters-given-read4/ }
 */
package _157_ReadNCharactersGivenRead4;

/** see test {@link _157_ReadNCharactersGivenRead4.PracticeTest } */
/*
 * The read4 API is defined in the parent class Reader4. int read4(char[] buf);
 */
public class Practice extends Reader4 {

    /**
     * @param buf Destination buffer
     * @param n Maximum number of characters to read
     * @return The number of characters read
     */
    public int read(char[] buf, int n) {
        // TODO:
        return 0;
    }

}
