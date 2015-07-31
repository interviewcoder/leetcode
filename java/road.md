## something learnt in the road.

01. [Eclipse] cmd + I: indent selected areas
02. [Eclipse] cmd + 1: get suggestion 
03. [Eclipse] cmd + .: go to next error
04. [Eclipse] cmd + 1: quick fix
05. [Eclipse] cmd + ,: open preference
06. [Eclipse] cmd + E: editor cycle
07. [Eclipse] ctrl + H: open search dialogue
08. [Eclipse] cmd + shift + T: search for class
              cmd + shift + R
09. [Eclipse] cmd + w: close current editor tab              
10. [Eclipse] cmd + F11 run last junit test
11. [Eclipse] F3: go to definition
12. [Eclipse] cmd + shift + F indent
---------------------------------------------------
- [vim]  H  go to heading line of current screen
- [vim]  M  go to middle line of current screen
- [vim]  L  go to last line of current screen
- [vim]  ctrl + b  go backwards by one screen
- [vim]  ctrl + f  go forwards by one screen
- [vim]  ctrl + u  go upwards by half screen
- [vim]  ctrl + d  go downwards by half screen
- [vim]  W  go to next position delimiter is blank space
---------------------------------------------------
* [online editor] alt + upper arrow : moves current line to upper line
* [online editor] alt + down arrow: moves current line to next line.
* [online editor] alt + right arrow, move cursor to right by one word  

1.  One way to loop over a String
    ```java
    String word = "abc";
    for(char ch : word.toCharArray()) {
        //TODO: do something with ch
    }
    ```
  
2. ! There is no easy way to reverse sort primitive array
    ```java
    //!!! wrong
    int[] nums = new int[10];
    Arrays.sort(nums, Collections.reverseOrder());
    // right
    String[] strs = new String[10];
    Arrays.sort(strs, Collections.reverseOrder());
    ```
  
3.  ! No easy way to convert primitive array to list  
    ```java
    //!!! wrong
    int[] nums = {1, 2, 3, 4};
    List<Integer> list = new ArrayList<>(Arrays.asList(nums));
    ```
  
4.  watch out when converting 2D coordinates to 1D cooridinates for nearby position
    ```java
    int row = 5;
    int col = 0;
    int index = row * cols + col;
  
    int r = (row * cols + (col - 1)) / cols;  // 4
    int c = (row * cols + (col - 1)) % cols;  // cols - 1
    // however, in 2D matrix, (row, col - 1) = (5, -1) which is outside of boundary
    ```

5. str.split(reg) with escape
    ```java
    String[] strs = string.split("\\."); // use \\ as escape sigh to escape . 
    ```

6. loop each digit of a number from back to beginning

    ```java
    while (x != 0) {
        int lastDigit = x % 10;
        x = x / 10;
    }
    ```

7. static import, use static method in non-static method way
    ```java
    import static org.junit.Assert.*;
    ```
8. append content to existing file

    ```java
    # use another constructor of BufferedWriter
    try {
        String filename = "xxx"
        boolean append = true;
        BufferedWriter bw = new BufferedWriter(new FileWriter(filename), append));
    } catch (IOException e) {
        // TODO
    }
    ```
9. avoid stack overflow in binary sort

    ```java
    // avoid using (low + high) / 2 because (low + high) might be very large
    int mid = low + (high - low) / 2;
    ```

10. Test whether a given url exists and has good connection status, see [gist](https://gist.github.com/StevenCooks/39c51a012e5303aba584)
    ```java
    import java.net.URL;
    import javax.net.ssl.HttpsURLConnection;

    /**
    * Returns <tt>true</tt> if given url exists and has good connection status.
    * @param urlStr url that we want to check
    */
    public boolean urlExists(String urlStr) {
        try {
            URL url = new URL(urlStr);
            HttpsURLConnection huc = (HttpsURLConnection) url.openConnection();
            huc.setRequestMethod("HEAD");
            if (huc.getResponseCode() == HttpsURLConnection.HTTP_OK) {
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // System.out.println(url);
        return false;
    }
    ```
    
 10. generate Javadoc http://stackoverflow.com/questions/4468669/how-to-generate-javadoc-html-in-eclipse   
  